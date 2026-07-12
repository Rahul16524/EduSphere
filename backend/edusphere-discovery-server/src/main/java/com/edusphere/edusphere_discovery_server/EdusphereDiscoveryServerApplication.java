//first microservice which is created
package com.edusphere.edusphere_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdusphereDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdusphereDiscoveryServerApplication.class, args);
	}

}
