package com.itlee.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {

		// 创建容器类，加载 bean
		ConfigurableApplicationContext ctx = SpringApplication.run(QuickstartApplication.class, args);

	}

}
