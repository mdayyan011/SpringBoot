package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		/*
		 * Following run return a type ConfigurableApplicationContext this context we
		 * can use to search and get beans present in spring container. Spring
		 * containers contain all beans present in the spring application.
		 */
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);

		//Since student following singleton pattern so following will give 1 bean only
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);

		System.out.println(s2.toString());
		
		// Following is prototype so it will create as many beans as getbeans is called
		Address a1 = context.getBean(Address.class);
		Address a2 = context.getBean(Address.class);
		Address a3 = context.getBean(Address.class);
	}

}
