package com.dndcharacters.s1project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import com.dndcharacters.s1project.GameValues.*;

/**
 * Class containing the fields from the first page of the D&D 5E character sheet
 *
 * @author S. Mahon
 * @version 12.5.2022
 */
public class Sheet1Fields implements Serializable {

    //basic character information (header of page)
    /** Class & level field*/
    private String classLevel;
    /** Character background field*/
    private String background;
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
    private ArrayList<Ability> abilities;

    //Acrobatics, animalhandling, arcana, athletics, deception, history,
    //insight, intimidation, investigation, medicine, nature, perception,
    //performance, persuasion, religion, sleight of hand, stealth, survival

    /** ArrayList of Skills
     * Order: acrobatics, animal handling, arcana, athletics, deception,
     * history, insight, intimidation, investigation, medicine, nature,
     * perception, performance, persuasion, religion, sleight of hand,
     * stealth, survival */
    private ArrayList<Skill> skills;

    /** Boolean of whether or not the character has inspiration */
    private boolean inspiration;
    /** Integer representing the proficiency bonus modifier*/
    private int proficiencybonus;
    /** Integer representing the armor class (target roll for an attack) */
    private int armorclass;
    /** Integer representing a character's initiative */
    private int initiative;
    /** Integer representing a character's speed */
    private int speed;

    private ArrayList hp;
    private ArrayList<Attack> attacks;
    private ArrayList<Currency> currency;

    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;
    private String features;
    //passive wisdom
    private String otherProficiencies;
    //equipment


    /*
    * CONSTRUCTOR
    * */
    public Sheet1Fields() {
        classLevel = "";
        background = "";
        pName = "";
        cName = "";
        race = Constants.Races.DEFAULT;
        alignment = Constants.Alignment.TrueNeutral;

        //instantiation and assignment of abilities arraylist
        abilities = new ArrayList<>();
        EnumSet.allOf(Constants.Ability.class).forEach(a -> abilities.add(new Ability(a, 0, 0, 0)));
        //instantiation and assignment of skills arraylist
        skills = new ArrayList<>();
        EnumSet.allOf(Constants.Skills.class).forEach(s -> skills.add(new Skill(s, 0)));
        //instantiation of attacks arraylist: this one is not assigned initial values because attacks are based on user
        //preference and not a predefined list
        attacks = new ArrayList<>();
        //instantiation and assignment of currency arraylist
        currency = new ArrayList<>();
        EnumSet.allOf(Constants.CurrencyType.class).forEach(c -> currency.add(new Currency(c, 0)));


        inspiration = false;
        proficiencybonus = 0;
        armorclass = 0;
        initiative = 0;
        speed = 0;
        hp = new ArrayList<>();
        attacks = new ArrayList<>();
        currency = new ArrayList<>();
        personalityTraits = "";
        ideals = "";
        bonds = "";
        flaws = "";
        features = "";
        otherProficiencies = "";
    }

    /*
    * METHODS
    */
    /** Returns the class & level string */
    public String getClassLevel() {
        return classLevel;
    }
    /** Sets class & level string to input */
    public void setClassLevel(String s) {
        classLevel = s;
    }
    /** Returns character's background */
    public String getBackground() { return background; }
    /** Sets character's background */
    public void setBackground(String s) {
        background = s;
    }
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



}