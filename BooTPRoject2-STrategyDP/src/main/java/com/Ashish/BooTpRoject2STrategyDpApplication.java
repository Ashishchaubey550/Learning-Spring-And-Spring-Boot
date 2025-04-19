package com.Ashish;

import com.Ashish.sbeans.Vichel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Vector;

@SpringBootApplication
public class BooTpRoject2STrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BooTpRoject2STrategyDpApplication.class, args);
		//get target sbean class target
		Vichel vichel = ctx.getBean("vichel" , Vichel.class);
		//invoke the bussiness logic
		vichel.journey("Hyderabad" , "Raipur");
		((org.springframework.context.ConfigurableApplicationContext) ctx).close();
	}

}

