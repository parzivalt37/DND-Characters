package com.dndcharacters.s1project.GameValues;

import com.dndcharacters.s1project.Constants;
import java.io.Serializable;

/**
 * Class for Currency Types - contains value and type
 *
 * @author S. Mahon
 * @version 12.15.2022
 */
public class Currency implements Serializable {

    /** Value of currency */
    private String value;
    /** Type of currency (gold, platinum, etc.) */
    private Constants.CurrencyType currencyType;

    /** Constructor, called in Sheet1Panel */
    public Currency(Constants.CurrencyType type, String v) {
        currencyType = type;
        value = v;
    }

    //getter methods
    //setters not necessary, values are initialized correctly in constructor through serialization
    //getcurrencytype not necessary

    public String getValue() {
        return value;
    }
}