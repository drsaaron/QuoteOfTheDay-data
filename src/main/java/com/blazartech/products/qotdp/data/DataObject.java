/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blazartech.products.qotdp.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author aar1069
 * @version $Id: DataObject.java 5 2011-05-07 16:08:27Z scott $
 */

/*
$Log$
********************************************************************************/

public abstract class DataObject implements Serializable {

    private int number = -1;
    public static final String PROP_NUMBER = "number";

    /**
     * Get the value of number
     *
     * @return the value of number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the value of number
     *
     * @param number new value of number
     */
    public void setNumber(int number) {
        int oldNumber = this.number;
        this.number = number;
        propertyChangeSupport.firePropertyChange(PROP_NUMBER, oldNumber, number);
    }

    public DataObject() {

    }

    /** Utility field used by bound properties. */
    protected PropertyChangeSupport propertyChangeSupport =  new PropertyChangeSupport(this);

    /** Adds a PropertyChangeListener to the listener list.
     * @param l The listener to add.
     *
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    /** Removes a PropertyChangeListener from the listener list.
     * @param l The listener to remove.
     *
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
