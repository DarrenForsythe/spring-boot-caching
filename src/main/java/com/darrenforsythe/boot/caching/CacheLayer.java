package com.darrenforsythe.boot.caching;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheLayer {

	private static final Logger log = LoggerFactory.getLogger(CacheLayer.class);

	@Cacheable(cacheNames = "uuid")
	public String getUUID() {
		String uuid = UUID.randomUUID().toString();

		log.info("Created UUID - {}", uuid);

		return uuid;
	}
}
