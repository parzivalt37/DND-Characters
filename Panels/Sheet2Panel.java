package com.dndcharacters.s1project.Panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.dndcharacters.s1project.Constants;

public class Sheet2Panel extends JPanel {

    //JLabels
    public static JLabel alliesLabel;
    public static JLabel featuresLabel;
    public static JLabel backstoryLabel;
    public static JLabel treasureLabel;
    public static JLabel ageLabel;
    public static JLabel heightLabel;
    public static JLabel weightLabel;
    public static JLabel eyesLabel;
    public static JLabel skinLabel;
    public static JLabel hairLabel;
    public static JLabel personalityTraitsLabel;
    public static JLabel idealsLabel;
    public static JLabel bondsLabel;
    public static JLabel flawsLabel;
    public static JLabel additionalFeaturesLabel;
    public static JLabel otherProficienciesLabel;
    public static JLabel languagesLabel;

    //JTextFields
    public static JTextArea alliesArea;
    public static JTextArea featuresArea;
    public static JTextArea backstoryArea;
    public static JTextArea treasureArea;
    public static JTextField ageField;
    public static JTextField heightField;
    public static JTextField weightField;
    public static JTextField eyesField;
    public static JTextField skinField;
    public static JTextField hairField;
    public static JTextArea personalityTraitsArea;
    public static JTextArea idealsArea;
    public static JTextArea bondsArea;
    public static JTextArea flawsArea;
    public static JTextArea additionalFeaturesArea;
    public static JTextArea otherProficienciesArea;

    public static JButton previousPage;
    public static JButton saveButton;

    public Sheet2Panel() {
        setSize(1920, 1080);
        setLayout(null);

        initializeLabels();
        initializeTextFieldsAreas();
        initializeButtons();

        add(alliesLabel);
        add(featuresLabel);
        add(backstoryLabel);
        //
        add(treasureLabel);
        add(ageLabel);
        add(heightLabel);
        add(weightLabel);
        add(eyesLabel);
        add(skinLabel);
        add(hairLabel);
        add(personalityTraitsLabel);
        add(idealsLabel);
        add(bondsLabel);
        add(flawsLabel);
        add(additionalFeaturesLabel);
        add(otherProficienciesLabel);
        add(languagesLabel);


        add(alliesArea);
        add(featuresArea);
        add(backstoryArea);
        add(treasureArea);
        add(ageField);
        add(heightField);
        add(weightField);
        add(eyesField);
        add(skinField);
        add(hairField);
        add(personalityTraitsArea);
        add(idealsArea);
        add(bondsArea);
        add(flawsArea);
        add(additionalFeaturesArea);
        add(otherProficienciesArea);


        add(saveButton);
        add(previousPage);
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

    private void initializeLabels() {
        //allies label
        alliesLabel = new JLabel("Allies:");
        alliesLabel.setFont(Constants.labels);
        alliesLabel.setBounds(0, 100, 200, 50);
        alliesLabel.setForeground(Color.WHITE);

        //additional features label
        featuresLabel = new JLabel("Features & traits:");
        featuresLabel.setFont(Constants.labels);
        featuresLabel.setBounds(0, 300, 200, 50);
        featuresLabel.setForeground(Color.WHITE);

        //backstory label
        backstoryLabel = new JLabel("Backstory:");
        backstoryLabel.setFont(Constants.labels);
        backstoryLabel.setBounds(0, 500, 200, 50);
        backstoryLabel.setForeground(Color.WHITE);

        //Treasure label
        treasureLabel = new JLabel("Treasure:");
        treasureLabel.setFont(Constants.labels);
        treasureLabel.setBounds(0, 700, 200, 50);
        treasureLabel.setForeground(Color.WHITE);

        //Age label
        ageLabel = new JLabel("Age:");
        ageLabel.setFont(Constants.labels);
        ageLabel.setBounds(0, 900, 200, 50);
        ageLabel.setForeground(Color.WHITE);

        //Height label
        heightLabel = new JLabel("Height:");
        heightLabel.setFont(Constants.labels);
        heightLabel.setBounds(0, 950, 200, 50);
        heightLabel.setForeground(Color.WHITE);

        //Weight label
        weightLabel = new JLabel("Weight:");
        weightLabel.setFont(Constants.labels);
        weightLabel.setBounds(0, 1000, 200, 50);
        weightLabel.setForeground(Color.WHITE);

        //Eyes label
        eyesLabel = new JLabel("Eyes:");
        eyesLabel.setFont(Constants.labels);
        eyesLabel.setBounds(800, 100, 200, 50);
        eyesLabel.setForeground(Color.WHITE);

        //Skin label
        skinLabel = new JLabel("Skin:");
        skinLabel.setFont(Constants.labels);
        skinLabel.setBounds(800, 150, 200, 50);
        skinLabel.setForeground(Color.WHITE);

        //Hair label
        hairLabel = new JLabel("Hair:");
        hairLabel.setFont(Constants.labels);
        hairLabel.setBounds(800, 200, 200, 50);
        hairLabel.setForeground(Color.WHITE);

        //Personality traits label
        personalityTraitsLabel = new JLabel("Personality traits:");
        personalityTraitsLabel.setFont(Constants.labels);
        personalityTraitsLabel.setBounds(800, 250, 200, 50);
        personalityTraitsLabel.setForeground(Color.WHITE);

        //Ideals label
        idealsLabel = new JLabel("Ideals:");
        idealsLabel.setFont(Constants.labels);
        idealsLabel.setBounds(800, 450, 200, 50);
        idealsLabel.setForeground(Color.WHITE);

        //Bonds label
        bondsLabel = new JLabel("Bonds:");
        bondsLabel.setFont(Constants.labels);
        bondsLabel.setBounds(800, 650, 200, 50);
        bondsLabel.setForeground(Color.WHITE);

        //Flaws label
        flawsLabel = new JLabel("Flaws:");
        flawsLabel.setFont(Constants.labels);
        flawsLabel.setBounds(800, 850, 200, 50);
        flawsLabel.setForeground(Color.WHITE);

        //Features label
        additionalFeaturesLabel = new JLabel("Additional features:");
        additionalFeaturesLabel.setFont(Constants.labels);
        additionalFeaturesLabel.setBounds(1400, 100, 200, 50);
        additionalFeaturesLabel.setForeground(Color.WHITE);

        //Other proficiences label
        otherProficienciesLabel = new JLabel("Other proficiencies");
        otherProficienciesLabel.setFont(Constants.labels);
        otherProficienciesLabel.setBounds(1400, 300, 300, 50);
        otherProficienciesLabel.setForeground(Color.WHITE);

        //& languages label
        languagesLabel = new JLabel("& languages:");
        languagesLabel.setFont(Constants.labels);
        languagesLabel.setBounds(1400, 330, 200, 50);
        languagesLabel.setForeground(Color.WHITE);
    }

    private void initializeTextFieldsAreas() {
        //allies text area
        alliesArea = new JTextArea();
        alliesArea.setBounds(200, 100, 250, 175);
        alliesArea.setFont(Constants.labels);
        alliesArea.setLineWrap(true);

        //additional features text area
        featuresArea = new JTextArea();
        featuresArea.setBounds(200, 300, 250, 175);
        featuresArea.setFont(Constants.labels);
        featuresArea.setLineWrap(true);

        //backstory text area
        backstoryArea = new JTextArea();
        backstoryArea.setBounds(200, 500, 250, 175);
        backstoryArea.setFont(Constants.labels);
        backstoryArea.setLineWrap(true);

        //treasure area
        treasureArea = new JTextArea();
        treasureArea.setBounds(200, 700, 250, 175);
        treasureArea.setFont(Constants.labels);
        treasureArea.setLineWrap(true);

        //age field
        ageField = new JTextField();
        ageField.setBounds(200, 900, 100, 40);
        ageField.setFont(Constants.labels);

        //height field
        heightField = new JTextField();
        heightField.setBounds(200, 950, 100, 40);
        heightField.setFont(Constants.labels);

        //weight field
        weightField = new JTextField();
        weightField.setBounds(200, 1000, 100, 40);
        weightField.setFont(Constants.labels);

        //eyes field
        eyesField = new JTextField();
        eyesField.setBounds(1000, 100, 100, 40);
        eyesField.setFont(Constants.labels);

        //skin field
        skinField = new JTextField();
        skinField.setBounds(1000, 150, 100, 40);
        skinField.setFont(Constants.labels);

        //hair field
        hairField = new JTextField();
        hairField.setBounds(1000, 200, 100, 40);
        hairField.setFont(Constants.labels);

        //personality traits area
        personalityTraitsArea = new JTextArea();
        personalityTraitsArea.setBounds(1000, 250, 250, 175);
        personalityTraitsArea.setFont(Constants.labels);
        personalityTraitsArea.setLineWrap(true);

        //ideals area
        idealsArea = new JTextArea();
        idealsArea.setBounds(1000, 450, 250, 175);
        idealsArea.setFont(Constants.labels);
        idealsArea.setLineWrap(true);

        //bonds area
        bondsArea = new JTextArea();
        bondsArea.setBounds(1000, 650, 250, 175);
        bondsArea.setFont(Constants.labels);
        bondsArea.setLineWrap(true);

        //flaws area
        flawsArea = new JTextArea();
        flawsArea.setBounds(1000, 850, 250, 175);
        flawsArea.setFont(Constants.labels);
        flawsArea.setLineWrap(true);

        //Additional features area
        additionalFeaturesArea = new JTextArea();
        additionalFeaturesArea.setBounds(1600, 100, 250, 175);
        additionalFeaturesArea.setFont(Constants.labels);
        additionalFeaturesArea.setLineWrap(true);

        //other proficiencies area
        otherProficienciesArea = new JTextArea();
        otherProficienciesArea.setBounds(1600, 300, 250, 175);
        otherProficienciesArea.setFont(Constants.labels);
        otherProficienciesArea.setLineWrap(true);
    }

    private void initializeButtons() {
        previousPage = new JButton("Last page");
        previousPage.setFont(Constants.buttons);
        previousPage.setBounds(1720, 0, 200, 75);
        previousPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                 MainPanel.s1p.setVisible(true);
            }
        });

        saveButton = new JButton("Save and exit");
        saveButton.setBounds(0, 0, 200, 75);
        saveButton.setFont(Constants.buttons);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPanel.s1p.save();
                save();
                try { MainPanel.serialize();}
                catch (Exception ex) { ex.printStackTrace(); }
                System.exit(0);
            }
        });
    }

    public void save() {
        MainPanel.sheet.s2.setAllies(alliesArea.getText());
        MainPanel.sheet.s2.setFeatures(featuresArea.getText());
        MainPanel.sheet.s2.setBackstory(backstoryArea.getText());
        MainPanel.sheet.s2.setTreasure(treasureArea.getText());
        MainPanel.sheet.s2.setAge(ageField.getText());
        MainPanel.sheet.s2.setHeight(heightField.getText());
        MainPanel.sheet.s2.setWeight(weightField.getText());
        MainPanel.sheet.s2.setEyes(eyesField.getText());
        MainPanel.sheet.s2.setSkin(skinField.getText());
        MainPanel.sheet.s2.setHair(hairField.getText());
        MainPanel.sheet.s2.setPersonalityTraits(personalityTraitsArea.getText());
        MainPanel.sheet.s2.setIdeals(idealsArea.getText());
        MainPanel.sheet.s2.setBonds(bondsArea.getText());
        MainPanel.sheet.s2.setFlaws(flawsArea.getText());
        MainPanel.sheet.s2.setAdditionalFeatures(additionalFeaturesArea.getText());
        MainPanel.sheet.s2.setOtherProficiencies(otherProficienciesArea.getText());
    }

    public void load() {
        alliesArea.setText(MainPanel.sheet.s2.getAllies());
        featuresArea.setText(MainPanel.sheet.s2.getFeatures());
        backstoryArea.setText(MainPanel.sheet.s2.getBackstory());
        treasureArea.setText(MainPanel.sheet.s2.getTreasure());
        ageField.setText(MainPanel.sheet.s2.getAge());
        heightField.setText(MainPanel.sheet.s2.getHeight());
        weightField.setText(MainPanel.sheet.s2.getWeight());
        eyesField.setText(MainPanel.sheet.s2.getEyes());
        skinField.setText(MainPanel.sheet.s2.getSkin());
        hairField.setText(MainPanel.sheet.s2.getHair());
        personalityTraitsArea.setText(MainPanel.sheet.s2.getPersonalityTraits());
        idealsArea.setText(MainPanel.sheet.s2.getIdeals());
        bondsArea.setText(MainPanel.sheet.s2.getBonds());
        flawsArea.setText(MainPanel.sheet.s2.getFlaws());
        additionalFeaturesArea.setText(MainPanel.sheet.s2.getAdditionalFeatures());
        otherProficienciesArea.setText(MainPanel.sheet.s2.getOtherProficiencies());
    }
}