package com.dndcharacters.s1project.Components;

import com.dndcharacters.s1project.Constants;
import javax.swing.JLabel;
import java.awt.Color;

public class ErrorLabel extends JLabel {

    public ErrorLabel(String text) {
        super(text);
        setForeground(Color.RED);
        setFont(Constants.errorFont);
        setVisible(false);
    }

}
