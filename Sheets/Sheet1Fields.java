package com.dndcharacters.s1project.Sheets;

import com.dndcharacters.s1project.Constants;
import com.dndcharacters.s1project.Records;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Data class containing fields from the first page of the character editor
 * @author S. Mahon
 * @version 12.19.2022
 */
public class Sheet1Fields implements Serializable {

    /** Character class */
    private Constants.Classes classes;
    /** Character level */
    private String level;
    /** Player name */
    private String pName;
    /** Character name */
    private String cName;
    /** Character race */
    private Constants.Races race;
    /** Character alignment */
    private Constants.Alignment alignment;

    /** ArrayList of the 6 abilities of a D&D character
     * Order: [strength, dexterity, constitution, intelligence, wisdom, charisma]
     * Also contains values for modifiers and saving throws
     */
    public ArrayList<Records.Ability> abilities;

    /** ArrayList of Skills
     * Order: acrobatics, animal handling, arcana, athletics, deception,
     * history, insight, intimidation, investigation, medicine, nature,
     * perception, performance, persuasion, religion, sleight of hand,
     * stealth, survival */
    public ArrayList<Records.Skill> skills;


    /** Character inspiration */
    private boolean inspiration;
    /** Proficiency bonus modifier*/
    private String proficiencybonus;
    /** Character's difficulty class*/
    private String difficultyclass;
    /** Character's armor class (target roll for an attack) */
    private String armorclass;
    /** Character's initiative */
    private String initiative;
    /** Character's speed */
    private String speed;
    /** Character's experience points */
    private String experiencePoints;
    /** Character's passive wisdom modifier */
    private String passiveWisdom;

    /** ArrayList of HP
     * Order: [Current hit points, maximum hit points, temporary hit points] */
    public ArrayList<String> hp;

    /** ArrayList of character's attacks
     * Ordered by the list on Sheet1Panel */
    public ArrayList<Records.Attack> attacks;

    /** ArrayList of character's currency
     * Order: [copper, silver, electrum, gold, platinum] */
    public ArrayList<Records.Currency> currency;

    /** Constructor, called in sheet: sets up all fields as blank */
    public Sheet1Fields() {
        level = "";
        pName = "";
        cName = "";
        race = Constants.Races.DEFAULT;
        alignment = Constants.Alignment.TrueNeutral;

        abilities = new ArrayList<>();
        skills = new ArrayList<>();
        hp = new ArrayList<>();
        attacks = new ArrayList<>();
        currency = new ArrayList<>();

        inspiration = false;
        proficiencybonus = "";
        armorclass = "";
        difficultyclass = "";
        initiative = "";
        speed = "";
    }


    //Getter and setter methods
    public String getpName() {
        return pName;
    }

    public void setpName(String s) {
        pName = s;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String s) {
        cName = s;
    }

    public Constants.Races getRace() {
        return race;
    }

    public void setRace(Constants.Races r) {
        race = r;
    }

    public Constants.Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Constants.Alignment a) {
        alignment = a;
    }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public boolean isInspiration() { return inspiration; }

    public void setInspiration(boolean ins) { inspiration = ins; }

    public String getProficiencybonus() { return proficiencybonus; }

    public void setProficiencybonus(String proficiencybonus) {
        this.proficiencybonus = proficiencybonus;
    }

    public String getDifficultyclass() {
        return difficultyclass;
    }

    public void setDifficultyclass(String difficultyclass) {
        this.difficultyclass = difficultyclass;
    }

    public String getArmorclass() {
        return armorclass;
    }

    public void setArmorclass(String armorclass) {
        this.armorclass = armorclass;
    }

    public String getInitiative() {
        return initiative;
    }

    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Constants.Classes getClasses() {
        return classes;
    }

    public void setClasses(Constants.Classes classes) {
        this.classes = classes;
    }

    public String getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(String pW) {
        passiveWisdom = pW;
    }

    public String getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(String exP) {
        experiencePoints = exP;
    }
}