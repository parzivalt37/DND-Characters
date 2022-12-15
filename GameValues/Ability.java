package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

/** Class for Ability types - contains ability type, value, modifier, and saving throw */
public class Ability implements Serializable {

    /**
     * Ability
     */
    private Constants.Ability ability;
    /**
     * Value of ability
     */
    private String abilityValue;
    /**
     * Value of modifier
     */
    private String modifierValue;
    /**
     * Value of saving throw
     */
    private String savingThrowValue;

    /**
     * Constructor, called in Sheet1Fields
     */
    public Ability(Constants.Ability a, String val, String modifierVal, String savingThrow) {
        ability = a;
        abilityValue = val;
        modifierValue = modifierVal;
        savingThrowValue = savingThrow;
    }

    /*
     * METHODS
     */

    /**
     * Returns ability
     */
    public Constants.Ability getAbility() {
        return ability;
    }

    /**
     * Sets ability
     */
    public void setAbility(Constants.Ability a) {
        ability = a;
    }

    /**
     * Returns ability value
     */
    public String getAbilityValue() {
        return abilityValue;
    }

    /**
     * Sets ability value
     */
    public void setAbilityValue(String aV) {
        abilityValue = aV;
    }

    /**
     * Returns modifier value
     */
    public String getModifierValue() {
        return modifierValue;
    }

    /**
     * Sets modifier value
     */
    public void setModifierValue(String mV) {
        modifierValue = mV;
    }

    /**
     * Returns saving throw value
     */
    public String getSavingThrowValue() {
        return savingThrowValue;
    }

    /**
     * Sets saving throw value
     */
    public void setSavingThrowValue(String sTV) {
        savingThrowValue = sTV;
    }
}