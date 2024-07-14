package com.dependencyi.dependencyi;

import com.dependencyi.dependencyi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
