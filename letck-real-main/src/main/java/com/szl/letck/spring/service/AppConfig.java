package com.szl.letck.spring.service;

import io.shardingsphere.core.config.DataSourceConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName AppConfig
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/8 20:19
 */
@ComponentScan("com.szl.letck")
@EnableTransactionManagement
@Configuration
//@EnableAutoConfiguration( exclude = DataSourceConfiguration.class)
public class AppConfig {


}
