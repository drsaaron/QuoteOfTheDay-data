/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.qotdp.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author scott
 */
@RunWith(SpringRunner.class)
public class QuoteOfTheDayTest {
    
    static final Logger logger = LoggerFactory.getLogger(QuoteOfTheDayTest.class);
    
    public QuoteOfTheDayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSerialize() throws JsonProcessingException {
        logger.info("testSerialize");
        
        QuoteOfTheDay qotd = new QuoteOfTheDay();
        qotd.setNumber(1);
        qotd.setQuoteNumber(1);
        qotd.setRunDate(new Date());
        
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(qotd);
        
        assertNotNull(json);
        assertFalse(json.isBlank());
    }
}
