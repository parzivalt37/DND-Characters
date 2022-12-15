package com.dndcharacters.s1project.Panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.dndcharacters.s1project.Constants;

public class Sheet2Panel extends JPanel {

    //JLabels
    public static JLabel alliesLabel;
    public static JLabel additionalFeaturesLabel;
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
    public static JLabel featuresLabel;
    public static JLabel otherProficienciesLabel;

    //JTextFields
    public static JTextArea alliesArea;
    public static JTextArea additionalFeaturesArea;
    public static JTextArea backstoryField;
    public static JTextArea treasureField;
    public static JTextArea ageField;
    public static JTextArea heightField;
    public static JTextArea weightField;
    public static JTextArea eyesField;
    public static JTextArea skinField;
    public static JTextArea hairField;
    public static JTextArea personalityTraitsField;
    public static JTextArea idealsField;
    public static JTextArea bondsField;
    public static JTextArea flawsField;
    public static JTextArea featuresField;
    public static JTextArea otherProficienciesField;

    public static JButton previousPage;
    public static JButton saveButton;

    public Sheet2Panel() {
        setSize(1920, 1080);
        setLayout(null);

        initializeLabels();
        initializeTextAreas();
        initializeButtons();

        add(alliesLabel);
        add(additionalFeaturesLabel);
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

        add(featuresLabel);
        add(otherProficienciesLabel);

        add(alliesArea);
        add(additionalFeaturesArea);


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
        additionalFeaturesLabel = new JLabel("Additional features:");
        additionalFeaturesLabel.setFont(Constants.labels);
        additionalFeaturesLabel.setBounds(0, 300, 200, 50);
        additionalFeaturesLabel.setForeground(Color.WHITE);

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
        featuresLabel = new JLabel("Features & traits:");
        featuresLabel.setFont(Constants.labels);
        featuresLabel.setBounds(1300, 100, 200, 50);
        featuresLabel.setForeground(Color.WHITE);

        //Other proficiences label
        otherProficienciesLabel = new JLabel("Other proficiencies & languages:");
        otherProficienciesLabel.setFont(Constants.labels);
        otherProficienciesLabel.setBounds(1300, 300, 300, 50);
        otherProficienciesLabel.setForeground(Color.WHITE);
    }

    private void initializeTextAreas() {
        //allies text area
        alliesArea = new JTextArea();
        alliesArea.setBounds(200, 100, 250, 175);
        alliesArea.setFont(Constants.labels);
        alliesArea.setLineWrap(true);

        //additional features text area
        additionalFeaturesArea = new JTextArea();
        additionalFeaturesArea.setBounds(200, 300, 250, 175);
        additionalFeaturesArea.setFont(Constants.labels);
        additionalFeaturesArea.setLineWrap(true);
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
                //TODO: serialize object
                System.exit(0);
            }
        });
    }

    private void save() {
        MainPanel.sheet.s2.setAllies(alliesArea.getText());
    }
}
