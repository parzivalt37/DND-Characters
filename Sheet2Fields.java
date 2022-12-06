package com.dndcharacters.s1project;

import java.io.Serializable;

public class Sheet2Fields implements Serializable {
    private String allies;
    private String additionalFeatures;
    private String backstory;
    private String treasure;
    private int age;
    private int height;
    private int weight;
    private String eyes;
    private String skin;
    private String hair;

    public Sheet2Fields() {
        allies = "";
        additionalFeatures = "";
        backstory = "";
        treasure = "";
        age = 0;
        height = 0;
        weight = 0;
        eyes = "";
        skin = "";
        hair = "";
    }
}