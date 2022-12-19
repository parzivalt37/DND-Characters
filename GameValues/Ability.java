package com.dndcharacters.s1project.GameValues;

import com.dndcharacters.s1project.Constants;
import java.io.Serializable;

/**
 * Class for Ability types - contains ability type, value, modifier, and saving throw
 *
 * @author S. Mahon
 * @version 12.15.2022
 */
public class Ability implements Serializable {

    /** Ability state variable */
    private Constants.Ability ability;
    /** Ability score*/
    private String abilityValue;
    /** Ability modifier score */
    private String modifierValue;
    /** Ability saving throw score */
    private String savingThrowValue;

    /**Constructor, called in Sheet1Fields */
    public Ability(Constants.Ability a, String val, String modifierVal, String savingThrow) {
        ability = a;
        abilityValue = val;
        modifierValue = modifierVal;
        savingThrowValue = savingThrow;
    }


    //getter methods for each field
    //getter for Ability not necessary, Arraylist of Abilities is hardcoded in a certain order
    //setters not necessary, abilities are initialized in constructor in serialization

    public String getAbilityValue() {
        return abilityValue;
    }

    public String getModifierValue() {
        return modifierValue;
    }

    public String getSavingThrowValue() {
        return savingThrowValue;
    }
}