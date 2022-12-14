package com.dndcharacters.s1project;

import com.dndcharacters.s1project.Panels.*;

/**
 * Main class: starts the application
 * @author S. Mahon
 * @version 12.15.2022
 */
@SuppressWarnings("ClassEscapesDefinedScope")
public class Main {

    public static void main(String[] args) {
        try {
            mp = new MainPanel();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MainPanel mp;
}