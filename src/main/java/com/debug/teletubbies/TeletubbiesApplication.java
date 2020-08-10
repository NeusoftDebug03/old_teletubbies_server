package com.debug.teletubbies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.debug.teletubbies.mapper")
public class TeletubbiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeletubbiesApplication.class, args);
	}

}
