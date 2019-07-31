package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //标注这个一个住程序类 spring Boot 的应用
public class DemoApplication {

	public static void main(String[] args) {
		//springboot 应用启动入口
		SpringApplication.run(DemoApplication.class, args);
	}

}
