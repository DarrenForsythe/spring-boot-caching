package com.darrenforsythe.boot.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class DefaultBootSetupApplication {


	public static void main(String[] args) {
		SpringApplication.run(DefaultBootSetupApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner () {
	
		return new ApplicationRunner() {
			
			@Autowired
			private ServiceLayer serviceLayer;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				serviceLayer.getValue();
			}
		};
	}
}
