package cn.szl.letck.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, RabbitAutoConfiguration.class})
public class SpringBootApplicationMain2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain2.class, args);
    }
}
