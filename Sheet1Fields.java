package com.dndcharacters.s1project;

import java.io.Serializable;
import java.util.ArrayList;

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
    private String race;
    /** Character alignment field*/
    private Constants.Alignment alignment;


    /** ArrayList of the 6 attributes of a D&D character
     * Order: [strength, dexterity, constitution, intelligence, wisdom, charisma]
     */
    private ArrayList<Constants.Ability> abilities;
    /** ArrayList of modifiers for the 6 attributes
     * Order: [strength, dexterity, constitution, intelligence, wisdom, charisma[
     */
    private ArrayList<Constants.Ability> modifiers;

    /** ArrayList of the 6 saving throws, ordered the same way as attributes */
    private ArrayList<Ability> savingThrows;

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
    * RECORDS
    * */
    /** Record for an Attack (also counts as a spell)
     * @param name name of attack/spell
     * @param atkBonus attack bonus of attack/spell
     * @param damageType type of damage dealt by attack/spell*/
    private record Attack(String name, int atkBonus, String damageType) implements Serializable {}
    /** Record for Skills
     * @param name name of skill
     * @param val value of skill
     */
    private record Skill(String name, int val) implements Serializable {}
    /** Record for Ability
     * @param a Ability enum value of which ability is being assigned
     * @param val value of ability */
    private record Ability(Constants.Ability a, int val) implements Serializable {}
    /** Record for Currency
     * @param type type of currency
     * @param val quantity of currency */
    private record Currency(Constants.CurrencyType type, int val) implements Serializable {}


    /*
    * CONSTRUCTOR
    * */
    public Sheet1Fields() {
        classLevel = "";
        background = "";
        pName = "";
        cName = "";
        race = "";
        alignment = Constants.Alignment.TrueNeutral;
        abilities = new ArrayList<>();
        modifiers = new ArrayList<>();
        savingThrows = new ArrayList<>();
        skills = new ArrayList<>();
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
}