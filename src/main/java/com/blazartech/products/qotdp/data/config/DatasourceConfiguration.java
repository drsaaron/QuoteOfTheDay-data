/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.qotdp.data.config;

import com.blazartech.products.crypto.BlazarCryptoFile;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author scott
 */
@Configuration
@Profile("!unittest")
public class DatasourceConfiguration {
    
    @Value("${com.blazartech.products.qotdp.data.access.impl.spring.ds.userId}")
    private String userID;
    
    @Value("${com.blazartech.products.qotdp.data.access.impl.spring.ds.resourceID}")
    private String resourceID;
    
    @Value("${com.blazartech.products.qotdp.data.access.impl.spring.ds.url}")
    private String url;
    
    @Value("${com.blazartech.products.qotdp.data.access.impl.spring.ds.driverClass}")
    private String driverClass;
    
    @Autowired
    private BlazarCryptoFile cryptoFile;
    
    private final int poolSize = 5;
    
    @Bean(name = "quoteOfTheDataDataSource", destroyMethod = "")
    @Primary
    public DataSource getDataSource() {
        
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverClass);
        ds.setUrl(url);
        ds.setUsername(userID);
        ds.setPassword(cryptoFile.getPassword(userID, resourceID));
        ds.setInitialSize(poolSize);
        ds.setMaxTotal(poolSize);
        
        return ds;
    }
}
