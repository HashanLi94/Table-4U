package com.springboot.restuarant.Table4U;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class Table4UApplication {

	public static void main(String[] args) {
		SpringApplication.run(Table4UApplication.class, args);
	}
//	@Bean
//	public CorsFilter corsFilter() {
//		final UrlBasedCorsConfigurationSource source = new org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource();
//		final CorsConfiguration config = new CorsConfiguration();
//		config.setAllowedOrigins(Collections.singletonList("http://localhost:3000")); // Provide list of origins if you want multiple origins
//		config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
//		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
//		config.setAllowCredentials(true);
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}

}
