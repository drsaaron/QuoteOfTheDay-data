/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blazartech.products.qotdp.data;

/**
 *
 * @author aar1069
 * @version $Id: Quote.java 33 2013-02-28 13:15:38Z scott $
 */

/*
$Log$
********************************************************************************/

public class Quote extends DataObject {

    public Quote() {
        super();
    }

    private String text;
    public static final String PROP_TEXT = "text";

    /**
     * Get the value of text
     *
     * @return the value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Set the value of text
     *
     * @param text new value of text
     */
    public void setText(String text) {
        String oldText = this.text;
        this.text = text;
        propertyChangeSupport.firePropertyChange(PROP_TEXT, oldText, text);
    }

    private int sourceCode;
    public static final String PROP_SOURCECODE = "sourceCode";

    /**
     * Get the value of sourceCode
     *
     * @return the value of sourceCode
     */
    public int getSourceCode() {
        return sourceCode;
    }

    /**
     * Set the value of sourceCode
     *
     * @param sourceCode new value of sourceCode
     */
    public void setSourceCode(int sourceCode) {
        int oldSourceCode = this.sourceCode;
        this.sourceCode = sourceCode;
        propertyChangeSupport.firePropertyChange(PROP_SOURCECODE, oldSourceCode, sourceCode);
    }

    private boolean usable;
    public static final String PROP_USABLE = "usable";

    /**
     * Get the value of usable
     *
     * @return the value of usable
     */
    public boolean isUsable() {
        return usable;
    }

    /**
     * Set the value of usable
     *
     * @param usable new value of usable
     */
    public void setUsable(boolean usable) {
        boolean oldUsable = this.usable;
        this.usable = usable;
        propertyChangeSupport.firePropertyChange(PROP_USABLE, oldUsable, usable);
    }

    private int nextQuoteNumber = -1;
    public static final String PROP_NEXTQUOTENUMBER = "nextQuoteNumber";

    /**
     * Get the value of nextQuoteNumber
     *
     * @return the value of nextQuoteNumber
     */
    public int getNextQuoteNumber() {
        return nextQuoteNumber;
    }

    /**
     * Set the value of nextQuoteNumber
     *
     * @param nextQuoteNumber new value of nextQuoteNumber
     */
    public void setNextQuoteNumber(int nextQuoteNumber) {
        int oldNextQuoteNumber = this.nextQuoteNumber;
        this.nextQuoteNumber = nextQuoteNumber;
        propertyChangeSupport.firePropertyChange(PROP_NEXTQUOTENUMBER, oldNextQuoteNumber, nextQuoteNumber);
    }

    private int priorQuoteNumber = -1;
    public static final String PROP_PRIORQUOTENUMBER = "priorQuoteNumber";

    /**
     * Get the value of priorQuoteNumber
     *
     * @return the value of priorQuoteNumber
     */
    public int getPriorQuoteNumber() {
        return priorQuoteNumber;
    }

    /**
     * Set the value of priorQuoteNumber
     *
     * @param priorQuoteNumber new value of priorQuoteNumber
     */
    public void setPriorQuoteNumber(int priorQuoteNumber) {
        int oldPriorQuoteNumber = this.priorQuoteNumber;
        this.priorQuoteNumber = priorQuoteNumber;
        propertyChangeSupport.firePropertyChange(PROP_PRIORQUOTENUMBER, oldPriorQuoteNumber, priorQuoteNumber);
    }

}
