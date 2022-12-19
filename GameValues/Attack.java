package com.dndcharacters.s1project.GameValues;

import com.dndcharacters.s1project.Constants;
import java.io.Serializable;

/** Class for attacks/spellcasting - types, values, atkbonuses */
public class Attack implements Serializable {

    /** Name of attack*/
    private String attackName;
    /** Attack bonus */
    private String atkBonus;
    /** Damage Type */
    private Constants.DamageTypes damageType;

    /** Constructor, called in Sheet1Fields */
    public Attack(String name, String attack, Constants.DamageTypes dT) {
        attackName = name;
        atkBonus = attack;
        damageType = dT;
    }

    //getter methods
    //setters not necessary as attacks are initialized in constructor when serialized

    public String getAttackName() {
        return attackName;
    }

    public String getAtkBonus() {
        return atkBonus;
    }

    public Constants.DamageTypes getDamageType() {
        return damageType;
    }
}