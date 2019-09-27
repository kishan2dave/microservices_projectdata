package com.boaserver.cloudkycserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudkycserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudkycserverApplication.class, args);
	}

}
