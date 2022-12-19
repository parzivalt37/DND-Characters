package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

/**
 * Class defining the Skill type
 *
 * @author S. Mahon
 * @version 12.15.2022
 * */
public class Skill implements Serializable {

    /** Type of skill */
    private Constants.Skills skill;
    /** Value of skill */
    private String skillValue;

    /** Constructor, called in Sheet1Panel */
    public Skill(Constants.Skills s, String sV) {
        skill = s;
        skillValue = sV;
    }

    //getter method
    //setters not needed as values are initialized in the constructor during serialization
    public String getSkillValue() {
        return skillValue;
    }
    /** Sets skill type */
}