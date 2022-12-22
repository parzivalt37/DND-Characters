package com.dndcharacters.s1project.Components;

import javax.swing.JComboBox;
import com.dndcharacters.s1project.Constants;
import java.awt.Color;

public class ComboBox<E> extends JComboBox<E> {

    public ComboBox() {
        super();
        setFont(Constants.labels);
        setForeground(Color.BLACK);
    }
}