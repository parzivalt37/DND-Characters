package com.dndcharacters.s1project.Components;

import javax.swing.JLabel;
import java.awt.Color;
import com.dndcharacters.s1project.Constants;

public class DiceLabel extends JLabel{

    public DiceLabel() {
        super();
        setVisible(false);
        setFont(Constants.diceFont);
        setForeground(Color.WHITE);
    }
}
