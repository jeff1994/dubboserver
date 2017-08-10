package com.jeff;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboserverApplication.class, args);
	}
}
