package com.dndcharacters.s1project.Sheets;

import java.io.Serializable;

/**
 * Data class containing fields from the first page of the character editor
 * @author S. Mahon
 * @version 12.19.2022
 */
public class Sheet2Fields implements Serializable {

    /** Character's allies */
    private String allies;
    /** Character's additional features */
    private String features;
    /** Character backstory */
    private String backstory;
    /** Character treasure*/
    private String treasure;
    /** Character age*/
    private String age;
    /** Character height, in units the user desires */
    private String height;
    /** Character's weight, in units the user desires */
    private String weight;
    /** Description of the character's eyes */
    private String eyes;
    /** Description of the character's skin */
    private String skin;
    /** Description of the character's hair */
    private String hair;

    //Fields displaced from lack of space on Sheet1Panel
    /** Character's personality traits */
    private String personalityTraits;
    /** Character's ideals */
    private String ideals;
    /** Character's bonds */
    private String bonds;
    /** Character's flaws */
    private String flaws;
    /** Character's additional features */
    private String additionalFeatures;
    /** Character's other proficiencies */
    private String otherProficiencies;

    /** Constructor, called in sheet */
    public Sheet2Fields() {
        allies = "";
        features = "";
        backstory = "";
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

    //Getter and setter methods
    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

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