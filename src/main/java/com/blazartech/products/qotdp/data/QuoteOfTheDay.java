/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blazartech.products.qotdp.data;

import java.util.Date;

/**
 *
 * @author aar1069
 * @version $Id: QuoteOfTheDay.java 33 2013-02-28 13:15:38Z scott $
 */

/*
$Log$
********************************************************************************/

public class QuoteOfTheDay extends DataObject implements Comparable<QuoteOfTheDay> {

    private int quoteNumber;
    public static final String PROP_QUOTE = "quoteNumber";

    /**
     * Get the value of quote
     *
     * @return the value of quote
     */
    public int getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Set the value of quote
     *
     * @param quote new value of quote
     */
    public void setQuoteNumber(int quoteNumber) {
        int oldQuote = this.quoteNumber;
        this.quoteNumber = quoteNumber;
        propertyChangeSupport.firePropertyChange(PROP_QUOTE, oldQuote, quoteNumber);
    }

    private Date runDate;
    public static final String PROP_RUNDATE = "runDate";

    /**
     * Get the value of runDate
     *
     * @return the value of runDate
     */
    public Date getRunDate() {
        return runDate;
    }

    /**
     * Set the value of runDate
     *
     * @param runDate new value of runDate
     */
    public void setRunDate(Date runDate) {
        Date oldRunDate = this.runDate;
        this.runDate = runDate;
        propertyChangeSupport.firePropertyChange(PROP_RUNDATE, oldRunDate, runDate);
    }

    @Override
    public int compareTo(QuoteOfTheDay t) {
        return this.getRunDate().compareTo(t.getRunDate());
    }

}
