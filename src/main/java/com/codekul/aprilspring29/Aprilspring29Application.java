package com.codekul.aprilspring29;

import com.codekul.aprilspring29.ioc.SimConfig;
import com.codekul.aprilspring29.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aprilspring29Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Aprilspring29Application.class, args);

//		ApplicationContext context1 = new ClassPathXmlApplicationContext();
//		Vodafone vodafone = context1.getBean(Vodafone.class);
//		vodafone.calling();

		Vodafone vodafone1 = context.getBean(Vodafone.class);
		vodafone1.calling();
	}


	@GetMapping("/hii")
	public String getHiiMsg(){
		return "Hello world";
	}

}
