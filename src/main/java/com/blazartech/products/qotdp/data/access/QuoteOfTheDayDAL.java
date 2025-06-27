/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blazartech.products.qotdp.data.access;

import com.blazartech.products.qotdp.data.Quote;
import com.blazartech.products.qotdp.data.QuoteOfTheDay;
import com.blazartech.products.qotdp.data.QuoteOfTheDayHistory;
import com.blazartech.products.qotdp.data.QuoteSourceCode;
import java.time.LocalDate;
import java.util.Collection;

/**
 *
 * @author aar1069
 * @version $Id: QuoteOfTheDayDAL.java 33 2013-02-28 13:15:38Z scott $
 */

/*
$Log$
********************************************************************************/

public interface QuoteOfTheDayDAL {
    /**
     * get a quote.
     * @param quoteNumber
     * @return
     */
    public Quote getQuote(int quoteNumber);

    /**
     * update a quote
     * @param q quote to update
     */
    public void updateQuote(Quote q);

    /**
     * get a quote source code
     * @param sourceCode
     * @return
     */
    public QuoteSourceCode getQuoteSourceCode(int sourceCode);

    /**
     * update a source code.
     * @param sourceCode
     */
    public void updateQuoteSourceCode(QuoteSourceCode sourceCode);

    /**
     * get all the quotes in the database
     * @return
     */
    public Collection<Quote> getAllQuotes();

    /**
     * get all the <em>usable</em> quotes in the database.
     * @return
     */
    public Collection<Quote> getUsableQuotes();

    /**
     * get a quote of the day for a given date
     * @param runDate desired effective date
     * @return
     */
    public QuoteOfTheDay getQuoteOfTheDay(LocalDate runDate);

    /**
     * update a quote of the day.
     * @param qotd
     */
    public void updateQuoteOfTheDay(QuoteOfTheDay qotd);

    /**
     * get all the source codes.
     * @return
     */
    public Collection<QuoteSourceCode> getQuoteSourceCodes();

    /**
     * create a new quote
     * @param q
     */
    public void addQuote(Quote q);

    /**
     * create a new quote of the day.
     * @param qotd
     */
    public void addQuoteOfTheDay(QuoteOfTheDay qotd);

    /**
     * create a new source code.
     * @param sourceCode
     */
    public void addQuoteSourceCode(QuoteSourceCode sourceCode);

    /**
     * get the list of quotes of the day for a given quote date range.  In other
     * words, how often was that quote used in the date range?
     * @param quoteNumber
     * @param startDate
     * @param endDate
     * @return
     */
    public Collection<QuoteOfTheDay> getQuoteOfTheDayInDateRange(int quoteNumber, LocalDate startDate, LocalDate endDate);

    /**
     * get all quotes of the day in a date range
     * @param startDate
     * @param endDate
     * @return 
     */
    public Collection<QuoteOfTheDay> getQuoteOfTheDayInDateRange(LocalDate startDate, LocalDate endDate);
    
    /**
     * get all quotes for a given source code.
     * @param sourceCode
     * @return
     */
    public Collection<Quote> getQuotesForSourceCode(int sourceCode);

    /**
     * get the list of all times the quote has been used as a quote of the day.
     * @param quoteNumber
     * @return
     */
    public QuoteOfTheDayHistory getQuoteOfTheDayHistoryForQuote(int quoteNumber);
}
