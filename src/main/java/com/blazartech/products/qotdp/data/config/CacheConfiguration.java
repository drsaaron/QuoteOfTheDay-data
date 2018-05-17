/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.qotdp.data.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author scott
 */
@Configuration
@EnableCaching
public class CacheConfiguration {
    
    @Bean("cacheManager")
    public CacheManager getQuoteCacheManager() {
        return new ConcurrentMapCacheManager();
    }

}
