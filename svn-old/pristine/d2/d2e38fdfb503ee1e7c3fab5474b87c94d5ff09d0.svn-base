/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blazartech.products.qotdp.data;

/**
 *
 * @author aar1069
 * @version $Id: QuoteSourceCode.java 33 2013-02-28 13:15:38Z scott $
 */

/*
$Log$
********************************************************************************/

public class QuoteSourceCode extends DataObject {

    public QuoteSourceCode() {
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

}
