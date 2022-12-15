package com.dndcharacters.s1project;

import java.io.Serializable;

public class Sheet2Fields implements Serializable {
    //State variables
    /** String listing the character's allies */
    private String allies;
    /** String listing the character's additional features */
    private String features;
    /** String containing the character's backstory */
    private String backstory;
    /** String treasure*/
    private String treasure;
    /** String storing the character's age*/
    private String age; //TODO: make this an int and make text fields typesafe
    /** Double storing the character's height, in units the user desires */
    private String height; //TODO: make this a double and make text fields typesafe
    /** Double storing the character's weight, in units the user desires */
    private String weight; //TODO: make this a double and make text fields typesafe
    /** String storing a description of the character's eyes */
    private String eyes;
    /** String storing a description of the character's skin */
    private String skin;
    /** String storing a description of the character's hair */
    private String hair;
    /** Character background field*/
    private String background;

    //displaced things from sheet1
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;
    private String additionalFeatures;
    private String otherProficiencies;
    //private String equipment; TODO: implement equipment

    //Constructor, called in sheet
    public Sheet2Fields() {
        allies = "";
        features = "";
        backstory = "";
        background = "";
        treasure = "";
        age = "";
        height = "";
        weight = "";
        eyes = "";
        skin = "";
        hair = "";
        //displaced things from sheet1
        personalityTraits = "";
        ideals = "";
        bonds = "";
        flaws = "";
        additionalFeatures = "";
        otherProficiencies = "";
    }

    /*
     * METHODS
     */
    /** Returns the list of the character's allies */
    public String getAllies() {
        return allies;
    }
    /** Sets the list of the character's allies */
    public void setAllies(String allies) {
        this.allies = allies;
    }
    /** Returns the description of the character's additional features */
    public String getFeatures() {
        return features;
    }
    /** Sets the description of the character's additional features */
    public void setFeatures(String features) {
        this.features = features;
    }
    /** Returns the description of the character's backstory */
    public String getBackstory() {
        return backstory;
    }
    /** Sets the description of the character's backstory */
    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }
    /** Returns the character's age */
    public String getAge() {
        return age;
    }
    /** Sets the character's age */
    public void setAge(String age) {
        this.age = age;
    }
    /** Returns the character's height */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getBackground() { return background; }

    public void setBackground(String s) {
        background = s;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public String getOtherProficiencies() {
        return otherProficiencies;
    }

    public void setOtherProficiencies(String otherProficiencies) {
        this.otherProficiencies = otherProficiencies;
    }
}