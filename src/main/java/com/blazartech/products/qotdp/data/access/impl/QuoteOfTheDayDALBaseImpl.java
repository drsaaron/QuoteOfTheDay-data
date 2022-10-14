/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.qotdp.data.access.impl;

import com.blazartech.products.qotdp.data.QuoteOfTheDay;
import com.blazartech.products.qotdp.data.QuoteOfTheDayHistory;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author scott
 */
abstract public class QuoteOfTheDayDALBaseImpl {

    private final Calendar calendar = Calendar.getInstance();
    
    private int getYear(Date d) {
        calendar.setTime(d);
        return calendar.get(Calendar.YEAR);
    }
    
    protected QuoteOfTheDayHistory buildQuoteOfTheDayHistory(Collection<QuoteOfTheDay> qotdCollection, int quoteNumber) {
        QuoteOfTheDayHistory history = new QuoteOfTheDayHistory();
        Map<Integer, Collection<QuoteOfTheDay>> historyByYear = new HashMap<>();
        history.setQuoteNumber(quoteNumber);
        history.setHistoryByYear(historyByYear);
        
        // initialize empty sets for each year we have QOTD for
        qotdCollection.stream()
                .map(qotd -> getYear(qotd.getRunDate()))
                .collect(Collectors.toSet()) // ensures unique values
                .forEach(y -> historyByYear.put(y, new TreeSet<>()));
        
        // populate the lists
        qotdCollection.forEach(qotd -> historyByYear.get(getYear(qotd.getRunDate())).add(qotd));
                
        return history;
    }
}
