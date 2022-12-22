package com.dndcharacters.s1project.Components;

import javax.swing.JTextArea;
import com.dndcharacters.s1project.Constants;

public class TextArea extends JTextArea {
    public TextArea() {
        super();
        setFont(Constants.labels);
        setLineWrap(true);
    }
}