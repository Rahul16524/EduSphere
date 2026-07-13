//Dependencies
//
//Only these:
//
//Spring Cloud Gateway
//Eureka Discovery Client
//Spring Boot Actuator
//
//Do not add Spring Web.
//
//Why?
//
//This is a very important Spring Boot concept.
//
//Spring Cloud Gateway is built on Spring WebFlux (Reactive), not Spring MVC.
//
//If you add both Spring Web and Spring Cloud Gateway, Spring Boot will detect both servlet and reactive web stacks, which often leads to startup errors or unexpected behavior.
//
//So for the Gateway, we intentionally use only:
//
//Gateway
//Eureka Client
//Actuator
//
//We'll discuss Spring MVC vs Spring WebFlux later when it naturally becomes relevant.

// Startup: give eureka error since it is not connected.

package com.edushpere.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdusphereApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdusphereApiGatewayApplication.class, args);
	}

}
