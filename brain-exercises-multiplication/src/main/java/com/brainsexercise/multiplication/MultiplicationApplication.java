package com.brainsexercise.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MultiplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApplication.class, args);
	}

	@Configuration
	@EnableWebMvc
	public class CorsConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:3000")
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedHeaders("*")
					.allowCredentials(true);
		}
	}

	//Foractivating snacke_case
//		@Bean
//	public ObjectMapper objectMapper(){
//		var om = new ObjectMapper();
//		om.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//		return om;
//	}


}
