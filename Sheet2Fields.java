package com.dndcharacters.s1project;

import java.io.Serializable;

public class Sheet2Fields implements Serializable {
    //State variables
    /** String listing the character's allies */
    private String allies;
    /** String listing the character's additional features */
    private String additionalFeatures;
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
    private String features;
    private String otherProficiencies;
    //private String equipment; TODO: implement equipment

    //Constructor, called in sheet
    public Sheet2Fields() {
        allies = "";
        additionalFeatures = "";
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
        features = "";
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
    public String getAdditionalFeatures() {
        return additionalFeatures;
    }
    /** Sets the description of the character's additional features */
    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
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
    /** Sets the character's height*/
    public void setHeight(String height) {
        this.height = height;
    }
    /** Returns the character's weight */
    public String getWeight() {
        return weight;
    }
    /** Sets the character's weight */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /** Returns the description of the character's eyes */
    public String getEyes() {
        return eyes;
    }
    /** Sets the description of the character's eyes */
    public void setEyes(String eyes) {
        this.eyes = eyes;
    }
    /** Returns the description of the character's skin */
    public String getSkin() {
        return skin;
    }
    /** Sets the description of the character's skin */
    public void setSkin(String skin) {
        this.skin = skin;
    }
    /** Returns the description of the character's hair */
    public String getHair() {
        return hair;
    }
    /** Sets the description of the character's hair */
    public void setHair(String hair) {
        this.hair = hair;
    }
    /** Returns character's background */
    public String getBackground() { return background; }
    /** Sets character's background */
    public void setBackground(String s) {
        background = s;
    }
}