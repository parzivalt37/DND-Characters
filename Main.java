package com.dndcharacters.s1project;

import com.dndcharacters.s1project.Panels.*;

public class Main {
    public static void main(String[] args) {
        try {
            new MainPanel();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //TODO: make a label class and override JLabel, because having 80 bajillion commands to set up one label is excessive
        //TODO: alphabetize all import statements
    }
}
