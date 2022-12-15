package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

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

    /*
     * METHODS
     */
    /** Returns name of attack */
    public String getAttackName() {
        return attackName;
    }
    /** Returns attack bonus */
    public String getAtkBonus() {
        return atkBonus;
    }
    /** Returns damage types */
    public Constants.DamageTypes getDamageType() {
        return damageType;
    }
    /** Sets attack name*/
    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }
    /** Sets attack bonus */
    public void setAtkBonus(String atkBonus) {
        this.atkBonus = atkBonus;
    }
    /** Sets type of damage*/
    public void setDamageType(Constants.DamageTypes damageType) {
        this.damageType = damageType;
    }
}
