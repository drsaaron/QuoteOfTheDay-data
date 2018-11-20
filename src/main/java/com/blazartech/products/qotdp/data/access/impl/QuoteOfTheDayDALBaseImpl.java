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
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author scott
 */
abstract public class QuoteOfTheDayDALBaseImpl {
    
    protected QuoteOfTheDayHistory buildQuoteOfTheDayHistory(Collection<QuoteOfTheDay> qotdCollection, int quoteNumber) {
        QuoteOfTheDayHistory history = new QuoteOfTheDayHistory();
        Map<Integer, Collection<QuoteOfTheDay>> historyByYear = new HashMap<>();
        history.setQuoteNumber(quoteNumber);
        history.setHistoryByYear(historyByYear);
        
        Calendar cal = Calendar.getInstance();
        qotdCollection.stream().map((qotd) -> {
            cal.setTime(qotd.getRunDate());
            return qotd;
        }).forEachOrdered((qotd) -> {
            int year = cal.get(Calendar.YEAR);
            
            Collection<QuoteOfTheDay> quoteDaySet = historyByYear.get(year);
            if (quoteDaySet == null) {
                quoteDaySet = new TreeSet<>();
                historyByYear.put(year, quoteDaySet);
            }
            quoteDaySet.add(qotd);
        });
        
        return history;
    }
}
