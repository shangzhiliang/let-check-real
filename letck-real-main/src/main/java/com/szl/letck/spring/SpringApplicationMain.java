package com.szl.letck.spring;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.style.ToStringStyler;

/**
 * @ClassName SpringApplicationMain
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/29 22:08
 * @Version v1.0
 */
public class SpringApplicationMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring/spring-main.xml");
        Person person = (Person) classPathXmlApplicationContext.getBean("person");

        person.setId(112344L);
        person.setName("Alix");

        System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.SHORT_PREFIX_STYLE));
    }

}
