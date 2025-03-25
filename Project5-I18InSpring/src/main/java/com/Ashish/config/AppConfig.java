package com.Ashish.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.ResourceBundle;

@Configuration
public class AppConfig {

    @Bean(name="messageSource")
    public ResourceBundleMessageSource createRBMS(){
        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
        rbms.setBasename("src/main/resources/com/Ashish/commons/App");
        return rbms;
    }
}
