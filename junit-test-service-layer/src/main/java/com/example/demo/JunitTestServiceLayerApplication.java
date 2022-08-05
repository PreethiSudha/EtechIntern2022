package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.RedisSessionProperties.ConfigureAction;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JunitTestServiceLayerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JunitTestServiceLayerApplication.class, args);
		ctx.close();
	}

}
