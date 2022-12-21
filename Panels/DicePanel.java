package com.dndcharacters.s1project.Panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import com.dndcharacters.s1project.Components.*;

import javax.swing.JPanel;

@SuppressWarnings("DuplicatedCode")
public class DicePanel extends JPanel {

    //Labels
    private static Label dice;
    //TextField
    private static TextField entryField;
    //Buttons
    private static Button rollButton;
    private static Button exitButton;

    public DicePanel() {
        setSize(1920, 1080);
        setLayout(null);

        initializeButtons();
        initializeLabels();
        initializeTextFields();

        addComponents();

        MainPanel.frame.add(this);
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(MainPanel.backgroundImage, 0, 0, this);
        int brightness = (int) (256 - 256 * 0.5f);
        g2d.setColor(new Color(0, 0, 0, brightness));
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void initializeButtons() {
        rollButton = new Button("Roll");
        rollButton.setBounds(200, 600, 200, 75);
        rollButton.addActionListener(e -> roll());
        //TODO: add navigation to character sheet editor

        //Program exit button
        exitButton = new Button("Exit");
        exitButton.setBounds(0, 0, 200, 75);
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void initializeLabels() {
        dice = new Label("Enter dice: ");
        //TODO: set boundaries for dice label
    }

    private void initializeTextFields() {
        entryField = new TextField();
        //TODO: set boundaries for dice label
    }

    private void addComponents() {
        //add(dice);
        add(rollButton);
        add(exitButton);
        //add(entryField);
    }

    private void roll() {
        //TODO: implement regex parser
        String input = entryField.getText();

    }
}
