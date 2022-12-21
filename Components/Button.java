package com.dndcharacters.s1project.Components;

import javax.swing.JButton;
import com.dndcharacters.s1project.Constants;

public class Button extends JButton {

    public Button(String text) {
        super(text);
        setFont(Constants.buttons);
    }
}
