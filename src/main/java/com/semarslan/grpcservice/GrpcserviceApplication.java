package com.semarslan.grpcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcserviceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GrpcserviceApplication.class, args);
	}

}
