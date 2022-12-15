package com.dndcharacters.s1project.GameValues;

import java.io.Serializable;
import com.dndcharacters.s1project.Constants;

public class Skill implements Serializable {

    /** Type of skill */
    private Constants.Skills skill;
    /** Value of skill */
    private String skillValue;

    /** Constructor, called in Sheet1Fields*/
    public Skill(Constants.Skills s, String sV) {
        skill = s;
        skillValue = sV;
    }

    /*
     * METHODS
     */
    /** Returns skill type */
    public Constants.Skills getSkill() {
        return skill;
    }
    /** Returns skill value */
    public String getSkillValue() {
        return skillValue;
    }
    /** Sets skill type */
    public void setSkill(Constants.Skills skill) {
        this.skill = skill;
    }
    /** Sets skill value*/
    public void setSkillValue(String skillValue) {
        this.skillValue = skillValue;
    }
}
