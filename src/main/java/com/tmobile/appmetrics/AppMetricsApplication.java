package com.tmobile.appmetrics;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Application Metrics", version = "v1"))
public class AppMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMetricsApplication.class, args);
	}

}
