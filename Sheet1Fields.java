package com.dndcharacters.s1project;

import java.io.Serializable;
import java.util.ArrayList;

import com.dndcharacters.s1project.GameValues.*;

/**
 * Class containing the fields from the first page of the D&D 5E character sheet
 *
 * @author S. Mahon
 * @version 12.5.2022
 */
public class Sheet1Fields implements Serializable {

    //basic character information (header of page)

    private Constants.Classes classes;
    /** Level field*/
    private String level;

    /** Player name field*/
    private String pName;
    /** Character name field*/
    private String cName;
    /** Race field*/
    private Constants.Races race;
    /** Character alignment field*/
    private Constants.Alignment alignment;


    /** ArrayList of the 6 attributes of a D&D character
     * Order: [strength, dexterity, constitution, intelligence, wisdom, charisma]
     * Also contains values for modifiers and saving throws
     */
    public ArrayList<Ability> abilities;

    //Acrobatics, animalhandling, arcana, athletics, deception, history,
    //insight, intimidation, investigation, medicine, nature, perception,
    //performance, persuasion, religion, sleight of hand, stealth, survival

    /** ArrayList of Skills
     * Order: acrobatics, animal handling, arcana, athletics, deception,
     * history, insight, intimidation, investigation, medicine, nature,
     * perception, performance, persuasion, religion, sleight of hand,
     * stealth, survival */
    public ArrayList<Skill> skills;


    /** Boolean of whether or not the character has inspiration */
    private boolean inspiration;
    /** Integer representing the proficiency bonus modifier*/
    private String proficiencybonus;
    /** Integer representing the difficulty class*/
    private String difficultyclass;
    /** Integer representing the armor class (target roll for an attack) */
    private String armorclass;
    /** Integer representing a character's initiative */
    private String initiative;
    /** Integer representing a character's speed */
    private String speed;

    //index 0 is integer for current hit points
    //index 1 is integer for maximum hit points
    //index 2 is integer for temporary hit points
    public ArrayList<String> hp;
    public ArrayList<Attack> attacks;
    public ArrayList<Currency> currency;
    private String passiveWisdom; //supposed to be an int, but JTextFields aren't typesafe


    /*
    * CONSTRUCTOR, called in sheet
    * */
    public Sheet1Fields() {
        level = "";
        pName = "";
        cName = "";
        race = Constants.Races.DEFAULT;
        alignment = Constants.Alignment.TrueNeutral;


        //instantiation and assignment of abilities arraylist
        abilities = new ArrayList<>();
        //instantiation and assignment of skills arraylist
        skills = new ArrayList<>();
        //instantiation of attacks arraylist: this one is not assigned initial values because attacks are based on user
        //preference and not a predefined list
        attacks = new ArrayList<>();
        //instantiation and assignment of currency arraylist
        currency = new ArrayList<>();

        inspiration = false;
        proficiencybonus = "";
        armorclass = "";
        difficultyclass = "";
        initiative = "";
        speed = "";
        hp = new ArrayList<>();
        attacks = new ArrayList<>();
        currency = new ArrayList<>();
    }

    /*
    * METHODS
    */
    /** Returns player name*/
    public String getpName() {
        return pName;
    }
    /** Sets player name*/
    public void setpName(String s) {
        pName = s;
    }
    /** Returns character name*/
    public String getcName() {
        return cName;
    }
    /** Sets character name */
    public void setcName(String s) {
        pName = s;
    }
    /** Returns character race */
    public Constants.Races getRace() {
        return race;
    }
    /** Sets character race */
    public void setRace(Constants.Races r) {
        race = r;
    }
    /** Returns character alignment */
    public Constants.Alignment getAlignment() {
        return alignment;
    }
    /** Sets character alignment */
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

    public void setPassiveWisdom(String passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }
}