package com.Ashish.ProjectSP._DependencyInjection;

import com.Ashish.sbean.SessionFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@SpringBootApplication
@ComponentScan(basePackages = "com.Ashish") // Ensures all packages are scanned
public class Application {

	@Bean(name = "ld") // LocalDate Bean
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// Retrieve SessionFinder bean
		SessionFinder sf = ctx.getBean("sf", SessionFinder.class);
		String msg = sf.findSeason();
		System.out.println("Result is: " + msg);

		// Close the context
		((org.springframework.context.ConfigurableApplicationContext) ctx).close();
	}
}
