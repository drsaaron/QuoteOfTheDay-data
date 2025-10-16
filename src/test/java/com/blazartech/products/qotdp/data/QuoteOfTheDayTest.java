/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.qotdp.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tools.jackson.databind.ObjectMapper;

/**
 *
 * @author scott
 */
@ExtendWith(SpringExtension.class)
public class QuoteOfTheDayTest {
    
    static final Logger logger = LoggerFactory.getLogger(QuoteOfTheDayTest.class);
    
    public QuoteOfTheDayTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSerialize() throws JsonProcessingException {
        logger.info("testSerialize");
        
        QuoteOfTheDay qotd = new QuoteOfTheDay();
        qotd.setNumber(1);
        qotd.setQuoteNumber(1);
        qotd.setRunDate(LocalDate.now());
        
        ObjectMapper mapper = new ObjectMapper();
     //   mapper.registerModule(new JavaTimeModule());
        
        String json = mapper.writeValueAsString(qotd);
        
        assertNotNull(json);
        assertFalse(json.isBlank());
    }
}
