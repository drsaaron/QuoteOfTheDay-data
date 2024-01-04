/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.blazartech.products.qotdp.data.access.impl;

import com.blazartech.products.qotdp.data.QuoteOfTheDay;
import com.blazartech.products.qotdp.data.QuoteOfTheDayHistory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author scott
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
    QuoteOfTheDayDALBaseImplTest.QuoteOfTheDayDALBaseImplTestConfiguration.class
})
public class QuoteOfTheDayDALBaseImplTest {
    
    private static final Logger logger = LoggerFactory.getLogger(QuoteOfTheDayDALBaseImplTest.class);
    
    @Configuration
    static class QuoteOfTheDayDALBaseImplTestConfiguration {
        
        @Bean
        public QuoteOfTheDayDALBaseImpl instance() {
            return new TestDAL();
        }
    }
    
    @Autowired
    private QuoteOfTheDayDALBaseImpl instance;
    
    public QuoteOfTheDayDALBaseImplTest() {
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

    private LocalDate parseDate(String d) {
        return LocalDate.parse(d);
    }
    
    /**
     * Test of buildQuoteOfTheDayHistory method, of class QuoteOfTheDayDALBaseImpl.
     */
    @Test
    public void testBuildQuoteOfTheDayHistory() {
        logger.info("buildQuoteOfTheDayHistory");
        
        QuoteOfTheDay qotd1 = new QuoteOfTheDay();
        qotd1.setNumber(1);
        qotd1.setQuoteNumber(1);
        qotd1.setRunDate(parseDate("2022-05-01"));
        QuoteOfTheDay qotd2 = new QuoteOfTheDay();
        qotd2.setNumber(2);
        qotd2.setQuoteNumber(2);
        qotd2.setRunDate(parseDate("2021-05-01"));
        QuoteOfTheDay qotd3 = new QuoteOfTheDay();
        qotd3.setNumber(3);
        qotd3.setQuoteNumber(3);
        qotd3.setRunDate(parseDate("2020-05-01"));
        QuoteOfTheDay qotd4 = new QuoteOfTheDay();
        qotd4.setNumber(4);
        qotd4.setQuoteNumber(4);
        qotd4.setRunDate(parseDate("2022-05-02"));
        
        Collection<QuoteOfTheDay> qotdCollection = List.of(qotd1, qotd2, qotd3, qotd4);
        int quoteNumber = 0;

        QuoteOfTheDayHistory result = instance.buildQuoteOfTheDayHistory(qotdCollection, quoteNumber);
        assertNotNull(result);
        
        // there should 3 years of history.
        Set<Integer> years = result.getHistoryByYear().keySet();
        assertNotNull(years);
        assertEquals(3, years.size());
        
        // check the 2022, there should be two quotes
        Collection<QuoteOfTheDay> quotes2022 = result.getHistoryByYear().get(2022);
        assertNotNull(quotes2022);
        assertEquals(2, quotes2022.size());
    }

    public class QuoteOfTheDayDALBaseImplImpl extends QuoteOfTheDayDALBaseImpl {
    }
    
}
