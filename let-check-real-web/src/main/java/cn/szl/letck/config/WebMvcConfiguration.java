package cn.szl.letck.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfiguration
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/21 11:39
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    /**
     * 实现屏蔽HTTP
     *   Springboot禁止内置Tomcat不安全的HTTP方法
     * @author szl
     * @date 2022/8/21 12:03
     * @return TomcatServletWebServerFactory
     */
    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcatServletContainerFactory = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                collection.addMethod("HEAD");
                collection.addMethod("PUT");
                collection.addMethod("PATCH");
                collection.addMethod("DELETE");
                collection.addMethod("OPTIONS");
                collection.addMethod("TRACE");
                collection.addMethod("COPY");
                collection.addMethod("SEARCH");
                collection.addMethod("PROPFIND");

                // 配置以/*结尾的path。这样配置表示全部请求使用安全模式，必须走https
                collection.addPattern("/*");
                //还可以配置哪些请求必须走https，这表示以/home/开头的请求必须走https
                // collection.addPattern("/home/*");


                constraint.addCollection(collection);
                constraint.setAuthConstraint(true);
                context.addConstraint(constraint);
                context.setUseHttpOnly(true);
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }
        };

        tomcatServletContainerFactory.addAdditionalTomcatConnectors(this.newHttpConnector());
        //如果需要禁用TRACE请求，需添加以下代码：
        tomcatServletContainerFactory.addConnectorCustomizers(connector -> {
            connector.setAllowTrace(true);
        });

        return tomcatServletContainerFactory;
    }

//    @Bean
//    public TomcatServletWebServerFactory servletContainerFactory(){
//        TomcatServletWebServerFactory tomcatConfig = new  TomcatServletWebServerFactory(){
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                // 配置以/*结尾的path。这样配置表示全部请求使用安全模式，必须走https
//                collection.addPattern("/*");
//                //还可以配置哪些请求必须走https，这表示以/home/开头的请求必须走https
//                // collection.addPattern("/home/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        tomcatConfig.addAdditionalTomcatConnectors(this.newHttpConnector());
//        return tomcatConfig;
//    }

    private Connector newHttpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(8080);
        connector.setSecure(false);
        // 如果只需要支持https访问，这里把收到的http请求跳转到https的端口
        connector.setRedirectPort(8443);
        return connector;
    }
}
