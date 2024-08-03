package com.acme.imposto;

import feign.Capability;
import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ImpostoApplication {
	@Bean
	public Capability capability(final MeterRegistry registry){
		return new MicrometerCapability(registry);
	}
	public static void main(String[] args) {
		SpringApplication.run(ImpostoApplication.class, args);
	}

}
