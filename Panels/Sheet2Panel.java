package com.dndcharacters.s1project.Panels;

import com.dndcharacters.s1project.Main;
import com.dndcharacters.s1project.Components.Label;
import com.dndcharacters.s1project.Components.Button;
import com.dndcharacters.s1project.Components.TextField;
import com.dndcharacters.s1project.Components.TextArea;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import javax.swing.JPanel;

/** Sheet2Panel: extends JPanel and shows all labels, text fields, etc. on page 2
 * @author S. Mahon
 * @version 12.19.2022
 */
@SuppressWarnings("DuplicatedCode")
public class Sheet2Panel extends JPanel {

    //JLabels
    private static Label alliesLabel;
    private static Label featuresLabel;
    private static Label backstoryLabel;
    private static Label treasureLabel;
    private static Label ageLabel;
    private static Label heightLabel;
    private static Label weightLabel;
    private static Label eyesLabel;
    private static Label skinLabel;
    private static Label hairLabel;
    private static Label personalityTraitsLabel;
    private static Label idealsLabel;
    private static Label bondsLabel;
    private static Label flawsLabel;
    private static Label additionalFeaturesLabel;
    private static Label otherProficienciesLabel;
    private static Label languagesLabel;

    //JTextFields
    public static TextArea alliesArea;
    public static TextArea featuresArea;
    public static TextArea backstoryArea;
    public static TextArea treasureArea;
    public static TextField ageField;
    public static TextField heightField;
    public static TextField weightField;
    public static TextField eyesField;
    public static TextField skinField;
    public static TextField hairField;
    public static TextArea personalityTraitsArea;
    public static TextArea idealsArea;
    public static TextArea bondsArea;
    public static TextArea flawsArea;
    public static TextArea additionalFeaturesArea;
    public static TextArea otherProficienciesArea;

    //JButtons
    private static Button previousPage;
    private static Button saveButton;
    private static Button mainButton;

    /** Constructor, called in MainPanel: configures frame, initializes and adds all components*/
    public Sheet2Panel() {
        setSize(1920, 1080);
        setLayout(null);

        initializeLabels();
        initializeTextFieldsAreas();
        initializeButtons();
        addComponents();


        MainPanel.frame.add(this);
        setVisible(true);
    }

    /** Overrides JPanel paintComponent method and draws background image */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(MainPanel.backgroundImage, 0, 0, this);
        int brightness = (int) (256 - 256 * 0.5f);
        g2d.setColor(new Color(0, 0, 0, brightness));
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    /** Contains setup for all JLabels on page 2 of the editor: sets text, font, boundaries, and text color */
    private void initializeLabels() {
        //allies label
        alliesLabel = new Label("Allies:");
        alliesLabel.setBounds(0, 100, 200, 50);

        //additional features label
        featuresLabel = new Label("Features & traits:");
        featuresLabel.setBounds(0, 300, 200, 50);

        //backstory label
        backstoryLabel = new Label("Backstory:");
        backstoryLabel.setBounds(0, 500, 200, 50);

        //Treasure label
        treasureLabel = new Label("Treasure:");
        treasureLabel.setBounds(0, 700, 200, 50);

        //Age label
        ageLabel = new Label("Age:");
        ageLabel.setBounds(0, 900, 200, 50);

        //Height label
        heightLabel = new Label("Height:");
        heightLabel.setBounds(0, 950, 200, 50);

        //Weight label
        weightLabel = new Label("Weight:");
        weightLabel.setBounds(0, 1000, 200, 50);

        //Eyes label
        eyesLabel = new Label("Eyes:");
        eyesLabel.setBounds(800, 100, 200, 50);

        //Skin label
        skinLabel = new Label("Skin:");
        skinLabel.setBounds(800, 150, 200, 50);

        //Hair label
        hairLabel = new Label("Hair:");
        hairLabel.setBounds(800, 200, 200, 50);

        //Personality traits label
        personalityTraitsLabel = new Label("Personality traits:");
        personalityTraitsLabel.setBounds(800, 250, 200, 50);

        //Ideals label
        idealsLabel = new Label("Ideals:");
        idealsLabel.setBounds(800, 450, 200, 50);

        //Bonds label
        bondsLabel = new Label("Bonds:");
        bondsLabel.setBounds(800, 650, 200, 50);

        //Flaws label
        flawsLabel = new Label("Flaws:");
        flawsLabel.setBounds(800, 850, 200, 50);

        //Features label
        additionalFeaturesLabel = new Label("Additional features:");
        additionalFeaturesLabel.setBounds(1400, 100, 200, 50);

        //Other proficiencies label
        otherProficienciesLabel = new Label("Other proficiencies");
        otherProficienciesLabel.setBounds(1400, 300, 300, 50);

        //& languages label
        languagesLabel = new Label("& languages:");
        languagesLabel.setBounds(1400, 330, 200, 50);
    }

    /** Contains setup for all JTextFields and JTextAreas on page 2 of the editor: sets bounds, fonts, and line wrap */
    private void initializeTextFieldsAreas() {
        //allies text area
        alliesArea = new TextArea();
        alliesArea.setBounds(200, 100, 250, 175);

        //additional features text area
        featuresArea = new TextArea();
        featuresArea.setBounds(200, 300, 250, 175);

        //backstory text area
        backstoryArea = new TextArea();
        backstoryArea.setBounds(200, 500, 250, 175);

        //treasure area
        treasureArea = new TextArea();
        treasureArea.setBounds(200, 700, 250, 175);

        //age field
        ageField = new TextField();
        ageField.setBounds(200, 900, 100, 40);

        //height field
        heightField = new TextField();
        heightField.setBounds(200, 950, 100, 40);

        //weight field
        weightField = new TextField();
        weightField.setBounds(200, 1000, 100, 40);

        //eyes field
        eyesField = new TextField();
        eyesField.setBounds(1000, 100, 100, 40);

        //skin field
        skinField = new TextField();
        skinField.setBounds(1000, 150, 100, 40);

        //hair field
        hairField = new TextField();
        hairField.setBounds(1000, 200, 100, 40);

        //personality traits area
        personalityTraitsArea = new TextArea();
        personalityTraitsArea.setBounds(1000, 250, 250, 175);

        //ideals area
        idealsArea = new TextArea();
        idealsArea.setBounds(1000, 450, 250, 175);

        //bonds area
        bondsArea = new TextArea();
        bondsArea.setBounds(1000, 650, 250, 175);

        //flaws area
        flawsArea = new TextArea();
        flawsArea.setBounds(1000, 850, 250, 175);

        //Additional features area
        additionalFeaturesArea = new TextArea();
        additionalFeaturesArea.setBounds(1600, 100, 250, 175);

        //other proficiencies area
        otherProficienciesArea = new TextArea();
        otherProficienciesArea.setBounds(1600, 300, 250, 175);
    }

    /** Contains setup for all JButtons on page 2 of the editor: sets bounds, fonts, and action listeners */
    private void initializeButtons() {
        previousPage = new Button("Last page");
        previousPage.setBounds(1720, 0, 200, 75);
        previousPage.addActionListener(e -> {
             setVisible(false);
             MainPanel.s1p.setVisible(true);
        });

        saveButton = new Button("Save and exit");
        saveButton.setBounds(0, 0, 200, 75);
        saveButton.addActionListener(e -> {
            MainPanel.s1p.save();
            save();
            try { MainPanel.serialize();}
            catch (Exception ex) { ex.printStackTrace(); }
            System.exit(0);
        });

        mainButton = new Button("Back to main");
        mainButton.setBounds(200, 0, 200, 75);
        mainButton.addActionListener(e -> {
            setVisible(false);
            Main.mp.setVisible(true);
        });
    }

    /** Stores information from every JTextField and JTextArea in the data class object */
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

    /** Loads all information from serialized object into JTextFields and JTextAreas */
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

    private void addComponents() {
        add(alliesLabel);
        add(featuresLabel);
        add(backstoryLabel);
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
        add(mainButton);
    }
}