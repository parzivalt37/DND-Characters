package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

/** Class for Currency Types - contains value and type */
public class Currency implements Serializable {

    /** Value of currency */
    private int value;
    /** Type of currency (gold, platinum, etc.) */
    private Constants.CurrencyType currencyType;

    /** Constructor, called in Sheet1Fields*/
    public Currency(Constants.CurrencyType type, int v) {
        currencyType = type;
        value = v;
    }

    /*
     * METHODS
     */
    /** Returns value of currency */
    public int getValue() {
        return value;
    }
    /** Returns type of currency */
    public Constants.CurrencyType getCurrencyType() {
        return currencyType;
    }
    /** Sets value of currency */
    public void setValue(int value) {
        this.value = value;
    }
    /** Sets type of currency */
    public void setCurrencyType(Constants.CurrencyType currencyType) {
        this.currencyType = currencyType;
    }


}
