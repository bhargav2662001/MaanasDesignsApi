package com.empower.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "MaanasDesigns- API Development"))
public class MaanasDesignsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaanasDesignsApplication.class, args);
	}

}
