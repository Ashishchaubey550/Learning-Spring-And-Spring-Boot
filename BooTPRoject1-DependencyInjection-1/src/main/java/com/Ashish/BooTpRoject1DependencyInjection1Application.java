package com.Ashish;

import com.Ashish.sbeans.SessionFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.time.LocalDate;

@SpringBootApplication
public class BooTpRoject1DependencyInjection1Application {

	@Bean(name = "id")
	public LocalDate createDate(){
		return LocalDate.now();
	};



	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BooTpRoject1DependencyInjection1Application.class, args);
		SessionFinder sf= ctx.getBean("sf", SessionFinder.class);
		String msg = sf.FindSeason();
		System.out.println("result is ::" + msg);
		((org.springframework.context.ConfigurableApplicationContext) ctx).close();
	}

}
