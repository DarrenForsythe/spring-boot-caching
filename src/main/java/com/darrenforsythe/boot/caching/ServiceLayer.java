package com.darrenforsythe.boot.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

	private CacheLayer cacheLayer;

	private static final Logger log = LoggerFactory.getLogger(ServiceLayer.class);

	public ServiceLayer(CacheLayer cacheLayer) {
		this.cacheLayer = cacheLayer;
	}

	public void getValue() {

		for (int i = 0; i < 10; i++) {
			String cacheValue = cacheLayer.getUUID();
			log.info("Got {} from cache layer", cacheValue);
		}

	}

}
