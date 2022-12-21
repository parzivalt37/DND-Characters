package com.dndcharacters.s1project.Panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import com.dndcharacters.s1project.Components.Label;
import com.dndcharacters.s1project.Components.ErrorLabel;
import com.dndcharacters.s1project.Components.TextArea;
import com.dndcharacters.s1project.Components.Button;
import com.dndcharacters.s1project.Components.DiceLabel;
import com.dndcharacters.s1project.Constants;

import javax.swing.JPanel;

@SuppressWarnings("DuplicatedCode")
public class DicePanel extends JPanel {

    //Labels
    private static Label dice;
    private static DiceLabel dice1Label;
    private static DiceLabel dice2Label;
    private static DiceLabel dice3Label;
    private static DiceLabel dice4Label;
    private static DiceLabel dice5Label;
    private static DiceLabel dice6Label;
    private static DiceLabel dice7Label;
    private static DiceLabel dice8Label;
    private static DiceLabel dice9Label;
    private static DiceLabel dice10Label;
    private static DiceLabel sumLabel;
    private static ErrorLabel emptyErrorLabel;
    private static ErrorLabel inputErrorLabel;
    //TextField
    private static TextArea entryField;
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
        rollButton.setBounds(400, 625, 250, 75);
        rollButton.addActionListener(e -> roll());
        //TODO: add navigation to character sheet editor

        //Program exit button
        exitButton = new Button("Exit");
        exitButton.setBounds(0, 0, 200, 75);
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void initializeLabels() {
        //data entry label
        dice = new Label("Enter dice: ");
        dice.setBounds(400, 275, 150, 40);
        dice.setFont(Constants.buttons);

        //first dice label
        dice1Label = new DiceLabel();
        dice1Label.setBounds(900, 350, 200, 75);
        dice1Label.setVisible(false);

        //second dice label
        dice2Label = new DiceLabel();
        dice2Label.setBounds(1100, 350, 200, 75);
        dice2Label.setVisible(false);

        //third dice label
        dice3Label = new DiceLabel();
        dice3Label.setBounds(1300, 350, 200, 75);
        dice3Label.setVisible(false);

        //fourth dice label
        dice4Label = new DiceLabel();
        dice4Label.setBounds(1500, 350, 200, 75);
        dice4Label.setVisible(false);

        //fifth dice label
        dice5Label = new DiceLabel();
        dice5Label.setBounds(1700, 350, 200, 75);
        dice5Label.setVisible(false);

        //sixth dice label
        dice6Label = new DiceLabel();
        dice6Label.setBounds(900, 700, 200, 75);
        dice6Label.setVisible(false);

        //seventh dice label
        dice7Label = new DiceLabel();
        dice7Label.setBounds(1100, 700, 200, 75);
        dice7Label.setVisible(false);

        //eighth dice label
        dice8Label = new DiceLabel();
        dice8Label.setBounds(1300, 700, 200, 75);
        dice8Label.setVisible(false);

        //ninth dice label
        dice9Label = new DiceLabel();
        dice9Label.setBounds(1500, 700, 200, 75);
        dice9Label.setVisible(false);

        //tenth dice label
        dice10Label = new DiceLabel();
        dice10Label.setBounds(1700, 700, 200, 75);
        dice10Label.setVisible(false);

        //sum label
        sumLabel = new DiceLabel();
        sumLabel.setBounds(1300, 825, 200, 75);
        sumLabel.setVisible(false);

        //input error label
        inputErrorLabel = new ErrorLabel("Error: invalid input");
        inputErrorLabel.setBounds(900, 350, 700, 15);

        //empty error label
        emptyErrorLabel = new ErrorLabel("Error: empty input");
        emptyErrorLabel.setBounds(900, 350, 700, 75);
    }

    private void initializeTextFields() {
        entryField = new TextArea();
        entryField.setBounds(400, 325, 250, 200);
    }

    private void addComponents() {
        add(dice);
        add(rollButton);
        add(exitButton);
        add(emptyErrorLabel);
        add(inputErrorLabel);
        add(entryField);

        add(dice1Label);
        add(dice2Label);
        add(dice3Label);
        add(dice4Label);
        add(dice5Label);
        add(dice6Label);
        add(dice7Label);
        add(dice8Label);
        add(dice9Label);
        add(dice10Label);
    }

    private void roll() {
        //TODO: implement regex parser
        String input = entryField.getText();
        int times = 1;
        int sides = 0;
        long sum = 0;
        long x;
        if (input.matches("\\d+d\\d+")) {
            emptyErrorLabel.setVisible(false);
            String[] s = input.split("d");
            sides = Integer.parseInt(s[1]);
            times = Integer.parseInt(s[0]);
        } else if (input.matches("d\\d+")) {
            emptyErrorLabel.setVisible(false);
            input = input.substring(1);
            sides = Integer.parseInt(input);
        } else if (input.equals("")) {
            emptyErrorLabel.setVisible(true);
        }

        for (int i = 0; i < times; i++) {
            x = Math.round(Math.random() * (sides - 1) + 1);
            sum += x;
            switch (i) {
                case 0 -> {
                    dice1Label.setText("" + x);
                    dice1Label.setVisible(true);
                }
                case 1 -> {
                    dice2Label.setText("" + x);
                    dice2Label.setVisible(true);
                }
                case 2 -> {
                    dice3Label.setText("" + x);
                    dice3Label.setVisible(true);
                }
                case 3 -> {
                    dice4Label.setText("" + x);
                    dice4Label.setVisible(true);
                }
                case 4 -> {
                    dice5Label.setText("" + x);
                    dice5Label.setVisible(true);
                }
                case 5 -> {
                    dice6Label.setText("" + x);
                    dice6Label.setVisible(true);
                }
                case 6 -> {
                    dice7Label.setText("" + x);
                    dice7Label.setVisible(true);
                }
                case 7 -> {
                    dice8Label.setText("" + x);
                    dice8Label.setVisible(true);
                }
                case 8 -> {
                    dice9Label.setText("" + x);
                    dice9Label.setVisible(true);
                }
                case 9 -> {
                    dice10Label.setText("" + x);
                    dice10Label.setVisible(true);
                }
                default -> {

                }
            }
        }

        sumLabel.setText("" + sum);
        sumLabel.setVisible(true);
    }
}