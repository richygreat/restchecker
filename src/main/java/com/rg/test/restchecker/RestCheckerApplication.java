package com.rg.test.restchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.rg.test.restchecker.controller.config.FileStorageProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties({ FileStorageProperties.class })
public class RestCheckerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestCheckerApplication.class, args);
	}
}
