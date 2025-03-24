package com.Ashish.main;

import com.Ashish.config.AppConfig;
import com.Ashish.sbeans.PersonDetails;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    public static void main(String[]args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersonDetails.class);
        PersonDetails details = ctx.getBean("pDetails" , PersonDetails.class);
        System.out.println(details);
        ctx.close();
    }
}
