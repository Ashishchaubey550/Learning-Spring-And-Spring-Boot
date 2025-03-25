package com.Ashish.main;

import com.Ashish.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;
import java.util.Scanner;

public class I18Test {
    public static void main(String []args){
        System.out.println("Classpath: " + System.getProperty("java.class.path"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Language code ::");
        String lang = sc.next();

        System.out.println("Enter Country code ::");
        String country = sc.next();


        Locale locale = new Locale(lang,country);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        String msg = ctx.getMessage("welcome.msg",new String[]{},locale);
        String msg2 = ctx.getMessage("goodbye.msg",new String[]{},locale);
        String msg3 = ctx.getMessage("missing.msg",new String[]{},locale);
        String msg4 = ctx.getMessage("disconnect.msg",new String[]{},locale);
        System.out.println(msg+" "+msg2+" "+msg3+" "+msg4);

        ctx.close();



    }
}
