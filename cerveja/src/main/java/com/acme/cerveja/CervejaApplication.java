package com.acme.cerveja;

import feign.Capability;
import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CervejaApplication {
	@Bean
	public Capability capability(final MeterRegistry registry){
		return new MicrometerCapability(registry);
	}
	public static void main(String[] args) {
		SpringApplication.run(CervejaApplication.class, args);
	}

}
