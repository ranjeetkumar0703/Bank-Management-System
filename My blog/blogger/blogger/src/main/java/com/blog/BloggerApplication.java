package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class BloggerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) { SpringApplication.run(BloggerApplication.class, args);}




}
