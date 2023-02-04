package com.jaydave.videostream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@Configuration
//@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackages = {"io.restapi"})
//@ComponentScan(basePackages = {"com.jaydave.videostream"})
public class VideostreamApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(VideostreamApplication.class, args);
	}

}
