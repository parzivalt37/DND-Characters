package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

/** Class for Ability types - contains ability type, value, modifier, and saving throw */
public class Ability implements Serializable {

    /** Ability */
    private Constants.Ability ability;
    /** Value of ability */
    private int abilityValue;
    /** Value of modifier */
    private int modifierValue;
    /** Value of saving throw*/
    private int savingThrowValue;

    /** Constructor, called in Sheet1Fields*/
    public Ability(Constants.Ability a, int val, int modifierVal, int savingThrow) {
        ability = a;
        abilityValue = val;
        modifierValue = val;
        savingThrowValue = savingThrow;
    }

    /*
     * METHODS
     */
    /** Returns ability */
    public Constants.Ability getAbility() {
        return ability;
    }
    /** Sets ability */
    public void setAbility(Constants.Ability a) {
        ability = a;
    }
    /** Returns ability value*/
    public int getAbilityValue() {
        return abilityValue;
    }
    /** Sets ability value*/
    public void setAbilityValue(int aV) {
        abilityValue = aV;
    }
    /** Returns modifier value */
    public int getModifierValue() {
        return modifierValue;
    }
    /** Sets modifier value */
    public void setModifierValue(int mV) {
        modifierValue = mV;
    }
    /** Returns saving throw value */
    public int getSavingThrowValue() {
        return savingThrowValue;
    }
    /** Sets saving throw value */
    public void setSavingThrowValue(int sTV) {
        savingThrowValue = sTV;
    }


}
