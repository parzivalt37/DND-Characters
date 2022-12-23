package com.dndcharacters.s1project.Components;

import com.dndcharacters.s1project.Constants;
import java.awt.Color;
import javax.swing.JLabel;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
        setFont(Constants.labels);
        setForeground(Color.WHITE);
    }

}