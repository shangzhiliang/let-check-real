package com.szl.letck.spring;

import com.szl.letck.spring.service.AppConfig;
import com.szl.letck.spring.service.UserService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.style.ToStringStyler;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName SpringApplicationMain
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/29 22:08
 * @Version v1.0
 */
public class SpringApplicationMain {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService");

        Field[] declaredFields = userService.getClass().getDeclaredFields();

        for (Field field : declaredFields) {

        }

        Method[] declaredMethods = userService.getClass().getDeclaredMethods();

        for(Method method : declaredMethods){
            if(method.isAnnotationPresent(PostConstruct.class)){
                method.invoke(method);
            }
        }




        userService.userTest();

//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring/spring-main.xml");
//        Person person = (Person) classPathXmlApplicationContext.getBean("person");

//        person.setId(112344L);
//        person.setName("Alix");

//        System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.SHORT_PREFIX_STYLE));
    }

}
