package com.zlimbu.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zlimbu.config","com.zlimbu.service"})
@EnableBatchProcessing  
public class SpringBatch01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatch01Application.class, args);
	}

}
