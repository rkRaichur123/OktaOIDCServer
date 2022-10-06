package com.example.ms.demo.OauthWithOkta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ms.demo.OauthWithOkta.*"})

public class OauthWithOktaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthWithOktaApplication.class, args);
	}

}
