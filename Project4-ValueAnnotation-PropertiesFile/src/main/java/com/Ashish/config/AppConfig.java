package com.Ashish.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("/java/com/Ashish/commons/Application.properties")
@ComponentScan(basePackages = "com.Ashish")
public class AppConfig {

}

