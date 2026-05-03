package com.telusko.TouristRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Tourist Info API",
				version="1.4",
				description="This API is about Tourist Info"
				),
		servers=@Server(
				url="http://localhost:8484",
				description="This is the server info our app is deployed"
				)
		)
public class TouristRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristRestApiApplication.class, args);
	}

}
