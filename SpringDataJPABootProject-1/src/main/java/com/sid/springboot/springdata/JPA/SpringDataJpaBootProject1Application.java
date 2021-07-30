package com.sid.springboot.springdata.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringDataJpaBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaBootProject1Application.class, args);
	}

}
