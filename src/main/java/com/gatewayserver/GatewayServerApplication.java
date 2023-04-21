package com.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//import brave.sampler.Sampler;

//@EnableEurekaClient 
/*
* Eureka version 4.0.0 onwards, which is being used in Spring Cloud 2022.0.0, 
* 	you do not need to explicitly register using the annotation @EnableEurekaClient
*/
@SpringBootApplication
public class GatewayServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

    // @Bean
	// public Sampler defaultSampler(){
	// 	return Sampler.ALWAYS_SAMPLE;
	// }

	@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
