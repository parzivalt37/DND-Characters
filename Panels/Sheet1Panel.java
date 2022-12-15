package com.dndcharacters.s1project.Panels;

import com.dndcharacters.s1project.*;
import com.dndcharacters.s1project.GameValues.*;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;

public class Sheet1Panel extends JPanel {

    //JButton
    private static JButton nextPage;
    /** Save button to be displayed on every panel */
    public static JButton saveButton = new JButton("Save and exit");

    //JLabels
    public static JLabel playerLabel;
    public static JLabel characterLabel;
    public static JLabel raceLabel;
    public static JLabel classLabel;
    public static JLabel levelLabel;
    public static JLabel alignmentLabel;
    public static JLabel strengthLabel;
    public static JLabel dexterityLabel;
    public static JLabel constitutionLabel;
    public static JLabel intelligenceLabel;
    public static JLabel wisdomLabel;
    public static JLabel charismaLabel;
    public static JLabel abilityLabel;
    public static JLabel modifierLabel;
    public static JLabel savingThrowLabel;
    public static JLabel inspirationLabel;
    public static JLabel proficiencyLabel;
    public static JLabel armorClassLabel;
    public static JLabel difficultyClassLabel;
    public static JLabel initiativeLabel;
    public static JLabel speedLabel;
    //Skill JLabels
    public static JLabel acrobaticsLabel;
    public static JLabel animalHandlingLabel;
    public static JLabel arcanaLabel;
    public static JLabel athleticsLabel;
    public static JLabel historyLabel;
    public static JLabel deceptionLabel;
    public static JLabel insightLabel;
    public static JLabel intimidationLabel;
    public static JLabel investigationLabel;
    public static JLabel medicineLabel;
    public static JLabel natureLabel;
    public static JLabel perceptionLabel;
    public static JLabel performanceLabel;
    public static JLabel persuasionLabel;
    public static JLabel religionLabel;
    public static JLabel sleightOfHandLabel;
    public static JLabel stealthLabel;
    public static JLabel survivalLabel;
    //attacks
    public static JLabel attackLabel;
    public static JLabel attackBonusLabel;
    public static JLabel damageTypeLabel;
    //hp
    public static JLabel HPLabel;
    public static JLabel tempHPLabel;
    public static JLabel currentHPLabel;
    //currency
    public static JLabel currencyLabel;
    public static JLabel copperLabel;
    public static JLabel silverLabel;
    public static JLabel electrumLabel;
    public static JLabel goldLabel;
    public static JLabel platinumLabel;
    //other
    public static JLabel passiveWisdomLabel;

    //JComboBox
    public static JComboBox<Constants.Races> raceComboBox;
    public static JComboBox<Constants.Classes> classComboBox;
    public static JComboBox<Constants.Alignment> alignmentComboBox;
    public static JComboBox<Constants.DamageTypes> damageTypesComboBox1;
    public static JComboBox<Constants.DamageTypes> damageTypesComboBox2;
    public static JComboBox<Constants.DamageTypes> damageTypesComboBox3;

    //JTextField
    public static JTextField pNameField;
    public static JTextField cNameField;
    public static JTextField levelField;
    public static JTextField strengthField;
    public static JTextField strengthMField;
    public static JTextField dexterityField;
    public static JTextField dexterityMField;
    public static JTextField constitutionField;
    public static JTextField constitutionMField;
    public static JTextField intelligenceField;
    public static JTextField intelligenceMField;
    public static JTextField wisdomField;
    public static JTextField wisdomMField;
    public static JTextField charismaField;
    public static JTextField charismaMField;
    //saving throw fields
    public static JTextField strengthSTField;
    public static JTextField dexteritySTField;
    public static JTextField constitutionSTField;
    public static JTextField intelligenceSTField;
    public static JTextField wisdomSTField;
    public static JTextField charismaSTField;

    public static JTextField proficiencyField;
    public static JTextField armorClassField;
    public static JTextField difficultyClassField;
    public static JTextField initiativeField;
    public static JTextField speedField;
    //Skill fields
    public static JTextField acrobaticsField;
    public static JTextField animalHandlingField;
    public static JTextField arcanaField;
    public static JTextField athleticsField;
    public static JTextField historyField;
    public static JTextField deceptionField;
    public static JTextField insightField;
    public static JTextField intimidationField;
    public static JTextField investigationField;
    public static JTextField medicineField;
    public static JTextField natureField;
    public static JTextField perceptionField;
    public static JTextField performanceField;
    public static JTextField persuasionField;
    public static JTextField religionField;
    public static JTextField sleightOfHandField;
    public static JTextField stealthField;
    public static JTextField survivalField;
    //attacks
    public static JTextField attack1Field;
    public static JTextField attack2Field;
    public static JTextField attack3Field;
    public static JTextField attack1BonusField;
    public static JTextField attack2BonusField;
    public static JTextField attack3BonusField;
    //hp
    public static JTextField HPField;
    public static JTextField tempHPField;
    public static JTextField currentHPField;
    //currency
    public static JTextField copperField;
    public static JTextField silverField;
    public static JTextField electrumField;
    public static JTextField goldField;
    public static JTextField platinumField;
    //other
    public static JTextField passiveWisdomField;

    public static JRadioButton inspirationRadioButton;

    public Sheet1Panel() {
        //panel config
        setSize(1920, 1080);
        setLayout(null);

        //Save button initialization
        saveButton.setBounds(0, 0, 200, 75);
        saveButton.setFont(Constants.buttons);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: serialize object
                System.exit(0);
            }
        });

        initializeLabels();
        initializeComboBoxes();
        initializeTextFields();
        initializeRadioButtons();
        initializeButtons();

        //additions to the panel
        add(pNameField);
        add(cNameField);
        add(levelField);
        add(playerLabel);
        add(classLabel);
        add(characterLabel);
        add(alignmentLabel);
        add(raceLabel);
        add(alignmentComboBox);
        add(raceComboBox);
        add(classComboBox);
        add(levelLabel);
        add(savingThrowLabel);
        add(strengthLabel);
        add(dexterityLabel);
        add(constitutionLabel);
        add(wisdomLabel);
        add(charismaLabel);
        add(intelligenceLabel);
        add(abilityLabel);
        add(modifierLabel);
        add(strengthField);
        add(strengthMField);
        add(strengthSTField);
        add(dexterityField);
        add(dexterityMField);
        add(dexteritySTField);
        add(constitutionField);
        add(constitutionMField);
        add(constitutionSTField);
        add(intelligenceField);
        add(intelligenceMField);
        add(intelligenceSTField);
        add(wisdomField);
        add(wisdomMField);
        add(wisdomSTField);
        add(charismaField);
        add(charismaMField);
        add(charismaSTField);
        add(inspirationLabel);
        add(inspirationRadioButton);
        add(proficiencyLabel);
        add(proficiencyField);
        add(armorClassField);
        add(armorClassLabel);
        add(difficultyClassField);
        add(difficultyClassLabel);
        add(speedLabel);
        add(initiativeLabel);
        add(speedField);
        add(initiativeField);
        add(acrobaticsLabel);
        add(arcanaLabel);
        add(animalHandlingLabel);
        add(athleticsLabel);
        add(deceptionLabel);
        add(historyLabel);
        add(insightLabel);
        add(intimidationLabel);
        add(investigationLabel);
        add(medicineLabel);
        add(natureLabel);
        add(perceptionLabel);
        add(performanceLabel);
        add(persuasionLabel);
        add(religionLabel);
        add(sleightOfHandLabel);
        add(stealthLabel);
        add(survivalLabel);
        add(acrobaticsField);
        add(animalHandlingField);
        add(arcanaField);
        add(athleticsField);
        add(historyField);
        add(deceptionField);
        add(insightField);
        add(intimidationField);
        add(investigationField);
        add(medicineField);
        add(natureField);
        add(perceptionField);
        add(performanceField);
        add(persuasionField);
        add(religionField);
        add(sleightOfHandField);
        add(stealthField);
        add(survivalField);
        add(attackBonusLabel);
        add(attackLabel);
        add(damageTypeLabel);
        add(damageTypesComboBox1);
        add(damageTypesComboBox2);
        add(damageTypesComboBox3);
        add(attack1Field);
        add(attack1BonusField);
        add(attack2Field);
        add(attack2BonusField);
        add(attack3Field);
        add(attack3BonusField);
        add(HPLabel);
        add(tempHPLabel);
        add(currentHPLabel);
        add(HPField);
        add(tempHPField);
        add(currentHPField);
        add(currencyLabel);
        add(copperLabel);
        add(silverLabel);
        add(electrumLabel);
        add(goldLabel);
        add(platinumLabel);
        add(copperField);
        add(silverField);
        add(electrumField);
        add(goldField);
        add(platinumField);
        add(passiveWisdomField);
        add(passiveWisdomLabel);
        add(nextPage);
        add(saveButton);
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
        //Player Name label
        playerLabel = new JLabel("Player name:");
        playerLabel.setFont(Constants.labels);
        playerLabel.setBounds(0, 100, 200, 50);
        playerLabel.setForeground(Color.WHITE);

        //Character Name label
        characterLabel = new JLabel("Character name:");
        characterLabel.setFont(Constants.labels);
        characterLabel.setBounds(0, 150, 200, 50);
        characterLabel.setForeground(Color.WHITE);

        //Race label
        raceLabel = new JLabel("Race:");
        raceLabel.setFont(Constants.labels);
        raceLabel.setBounds(0, 200, 200, 50);
        raceLabel.setForeground(Color.WHITE);

        //Class label
        classLabel = new JLabel("Class:");
        classLabel.setFont(Constants.labels);
        classLabel.setBounds(0, 250, 200, 50);
        classLabel.setForeground(Color.WHITE);

        //Level label
        levelLabel = new JLabel("Level:");
        levelLabel.setFont(Constants.labels);
        levelLabel.setBounds(0, 300, 200, 50);
        levelLabel.setForeground(Color.WHITE);

        //Alignment label
        alignmentLabel = new JLabel("Alignment:");
        alignmentLabel.setFont(Constants.labels);
        alignmentLabel.setBounds(0, 350, 200, 50);
        alignmentLabel.setForeground(Color.WHITE);

        //Ability label
        abilityLabel = new JLabel("Ability Scores");
        abilityLabel.setFont(Constants.labels);
        abilityLabel.setBounds(175, 400, 200, 50);
        abilityLabel.setForeground(Color.WHITE);

        //Modifier label
        modifierLabel = new JLabel("Modifiers");
        modifierLabel.setFont(Constants.labels);
        modifierLabel.setBounds(340, 400, 200, 50);
        modifierLabel.setForeground(Color.WHITE);

        //Saving throw label
        savingThrowLabel = new JLabel("Saving Throws");
        savingThrowLabel.setFont(Constants.labels);
        savingThrowLabel.setBounds(500, 400, 200, 50);
        savingThrowLabel.setForeground(Color.WHITE);

        //Strength label
        strengthLabel = new JLabel("Strength:");
        strengthLabel.setFont(Constants.labels);
        strengthLabel.setBounds(0, 450, 200, 50);
        strengthLabel.setForeground(Color.WHITE);

        //Dexterity label
        dexterityLabel = new JLabel("Dexterity:");
        dexterityLabel.setFont(Constants.labels);
        dexterityLabel.setBounds(0, 500, 200, 50);
        dexterityLabel.setForeground(Color.WHITE);

        //Constutition label
        constitutionLabel = new JLabel("Constitution:");
        constitutionLabel.setFont(Constants.labels);
        constitutionLabel.setBounds(0, 550, 200, 50);
        constitutionLabel.setForeground(Color.WHITE);

        //Intelligence label
        intelligenceLabel = new JLabel("Intelligence:");
        intelligenceLabel.setFont(Constants.labels);
        intelligenceLabel.setBounds(0, 600, 200, 50);
        intelligenceLabel.setForeground(Color.WHITE);

        //Charisma label
        charismaLabel = new JLabel("Charisma:");
        charismaLabel.setFont(Constants.labels);
        charismaLabel.setBounds(0, 650, 200, 50);
        charismaLabel.setForeground(Color.WHITE);

        //Wisdom label
        wisdomLabel = new JLabel("Wisdom:");
        wisdomLabel.setFont(Constants.labels);
        wisdomLabel.setBounds(0, 700, 200, 50);
        wisdomLabel.setForeground(Color.WHITE);

        //Inspiration label
        inspirationLabel = new JLabel("Inspiration:");
        inspirationLabel.setFont(Constants.labels);
        inspirationLabel.setBounds(0, 750, 200, 50);
        inspirationLabel.setForeground(Color.WHITE);

        //Proficiency bonus
        proficiencyLabel = new JLabel("Proficiency bonus:");
        proficiencyLabel.setFont(Constants.labels);
        proficiencyLabel.setBounds(0, 800, 200, 50);
        proficiencyLabel.setForeground(Color.WHITE);

        //Armor class label
        armorClassLabel = new JLabel("Armor class:");
        armorClassLabel.setFont(Constants.labels);
        armorClassLabel.setBounds(0, 850, 200, 50);
        armorClassLabel.setForeground(Color.WHITE);

        //Difficulty class label
        difficultyClassLabel = new JLabel("Difficulty class:");
        difficultyClassLabel.setFont(Constants.labels);
        difficultyClassLabel.setBounds(0, 900, 200, 50);
        difficultyClassLabel.setForeground(Color.WHITE);

        //Initiative label
        initiativeLabel = new JLabel("Initiative:");
        initiativeLabel.setFont(Constants.labels);
        initiativeLabel.setBounds(0, 950, 200, 50);
        initiativeLabel.setForeground(Color.WHITE);

        //Speed label
        speedLabel = new JLabel("Speed:");
        speedLabel.setFont(Constants.labels);
        speedLabel.setBounds(0, 1000, 200, 50);
        speedLabel.setForeground(Color.WHITE);

        //Skill labels
        //Acrobatics label
        acrobaticsLabel = new JLabel("Acrobatics:");
        acrobaticsLabel.setFont(Constants.labels);
        acrobaticsLabel.setBounds(700, 100, 200, 50);
        acrobaticsLabel.setForeground(Color.WHITE);

        //Animal Handling Label
        animalHandlingLabel = new JLabel("Animal handling:");
        animalHandlingLabel.setFont(Constants.labels);
        animalHandlingLabel.setBounds(700, 150, 200, 50);
        animalHandlingLabel.setForeground(Color.WHITE);

        //Arcana label
        arcanaLabel = new JLabel("Arcana:");
        arcanaLabel.setFont(Constants.labels);
        arcanaLabel.setBounds(700, 200, 200, 50);
        arcanaLabel.setForeground(Color.WHITE);

        //Athletics label
        athleticsLabel = new JLabel("Athletics:");
        athleticsLabel.setFont(Constants.labels);
        athleticsLabel.setBounds(700, 250, 200, 50);
        athleticsLabel.setForeground(Color.WHITE);

        //Deception label
        deceptionLabel = new JLabel("Deception:");
        deceptionLabel.setFont(Constants.labels);
        deceptionLabel.setBounds(700, 300, 200, 50);
        deceptionLabel.setForeground(Color.WHITE);

        //History label
        historyLabel = new JLabel("History:");
        historyLabel.setFont(Constants.labels);
        historyLabel.setBounds(700, 350, 200, 50);
        historyLabel.setForeground(Color.WHITE);

        //Insight label
        insightLabel = new JLabel("Insight:");
        insightLabel.setFont(Constants.labels);
        insightLabel.setBounds(700, 400, 200, 50);
        insightLabel.setForeground(Color.WHITE);

        //Intimidation label
        intimidationLabel = new JLabel("Intimidation:");
        intimidationLabel.setFont(Constants.labels);
        intimidationLabel.setBounds(700, 450, 200, 50);
        intimidationLabel.setForeground(Color.WHITE);

        //Investigation label
        investigationLabel = new JLabel("Investigation:");
        investigationLabel.setFont(Constants.labels);
        investigationLabel.setBounds(700, 500, 200, 50);
        investigationLabel.setForeground(Color.WHITE);

        //Medicine label
        medicineLabel = new JLabel("Medicine:");
        medicineLabel.setFont(Constants.labels);
        medicineLabel.setBounds(700, 550, 200, 50);
        medicineLabel.setForeground(Color.WHITE);

        //Nature label
        natureLabel = new JLabel("Nature:");
        natureLabel.setFont(Constants.labels);
        natureLabel.setBounds(700, 600, 200, 50);
        natureLabel.setForeground(Color.WHITE);

        //Perception label
        perceptionLabel = new JLabel("Perception:");
        perceptionLabel.setFont(Constants.labels);
        perceptionLabel.setBounds(700, 650, 200, 50);
        perceptionLabel.setForeground(Color.WHITE);

        //Performance label
        performanceLabel = new JLabel("Performance:");
        performanceLabel.setFont(Constants.labels);
        performanceLabel.setBounds(700, 700, 200, 50);
        performanceLabel.setForeground(Color.WHITE);

        //Persuasion label
        persuasionLabel = new JLabel("Persuasion:");
        persuasionLabel.setFont(Constants.labels);
        persuasionLabel.setBounds(700, 750, 200, 50);
        persuasionLabel.setForeground(Color.WHITE);

        //Religion label
        religionLabel = new JLabel("Religion:");
        religionLabel.setFont(Constants.labels);
        religionLabel.setBounds(700, 800, 300, 50);
        religionLabel.setForeground(Color.WHITE);

        //Sleight of hand label
        sleightOfHandLabel = new JLabel("Sleight of hand:");
        sleightOfHandLabel.setFont(Constants.labels);
        sleightOfHandLabel.setBounds(700, 850, 300, 50);
        sleightOfHandLabel.setForeground(Color.WHITE);

        //Stealth label
        stealthLabel = new JLabel("Stealth:");
        stealthLabel.setFont(Constants.labels);
        stealthLabel.setBounds(700, 900, 300, 50);
        stealthLabel.setForeground(Color.WHITE);

        //Survival label
        survivalLabel = new JLabel("Survival:");
        survivalLabel.setFont(Constants.labels);
        survivalLabel.setBounds(700, 950, 300, 50);
        survivalLabel.setForeground(Color.WHITE);

        //Attacks label
        attackLabel = new JLabel("Attacks");
        attackLabel.setFont(Constants.labels);
        attackLabel.setBounds(1300, 100, 200, 50);
        attackLabel.setForeground(Color.WHITE);

        //Attack bonus label
        attackBonusLabel = new JLabel("Attack bonus");
        attackBonusLabel.setFont(Constants.labels);
        attackBonusLabel.setBounds(1550, 100, 200, 50);
        attackBonusLabel.setForeground(Color.WHITE);

        //Damage type label
        damageTypeLabel = new JLabel("Damage type");
        damageTypeLabel.setFont(Constants.labels);
        damageTypeLabel.setBounds(1675, 100, 200, 50);
        damageTypeLabel.setForeground(Color.WHITE);

        //HP label
        HPLabel = new JLabel("Hit points:");
        HPLabel.setFont(Constants.labels);
        HPLabel.setBounds(1300, 300, 200, 50);
        HPLabel.setForeground(Color.WHITE);

        //Temporary HP label
        tempHPLabel = new JLabel("Temporary hit points:");
        tempHPLabel.setFont(Constants.labels);
        tempHPLabel.setBounds(1300, 350, 200, 50);
        tempHPLabel.setForeground(Color.WHITE);

        //Current HP label
        currentHPLabel = new JLabel("Current hit points:");
        currentHPLabel.setFont(Constants.labels);
        currentHPLabel.setBounds(1300, 400, 200, 50);
        currentHPLabel.setForeground(Color.WHITE);

        //Currency labels
        //Currency label
        currencyLabel = new JLabel("Currency");
        currencyLabel.setFont(Constants.labels);
        currencyLabel.setBounds(1400, 450, 200, 50);
        currencyLabel.setForeground(Color.WHITE);

        //Copper label
        copperLabel = new JLabel("Copper:");
        copperLabel.setFont(Constants.labels);
        copperLabel.setBounds(1300, 500, 200, 50);
        copperLabel.setForeground(Color.WHITE);

        //Silver label
        silverLabel = new JLabel("Silver:");
        silverLabel.setFont(Constants.labels);
        silverLabel.setBounds(1300, 550, 200, 50);
        silverLabel.setForeground(Color.WHITE);

        //Electrum label
        electrumLabel = new JLabel("Electrum:");
        electrumLabel.setFont(Constants.labels);
        electrumLabel.setBounds(1300, 600, 200, 50);
        electrumLabel.setForeground(Color.WHITE);

        //Gold label
        goldLabel = new JLabel("Gold:");
        goldLabel.setFont(Constants.labels);
        goldLabel.setBounds(1300, 650, 200, 50);
        goldLabel.setForeground(Color.WHITE);

        //Platinum label
        platinumLabel = new JLabel("Platinum:");
        platinumLabel.setFont(Constants.labels);
        platinumLabel.setBounds(1300, 700, 200, 50);
        platinumLabel.setForeground(Color.WHITE);

        //Passive wisdom label
        passiveWisdomLabel = new JLabel("Passive wisdom:");
        passiveWisdomLabel.setFont(Constants.labels);
        passiveWisdomLabel.setBounds(700, 1000, 200, 50);
        passiveWisdomLabel.setForeground(Color.WHITE);
    }

    private void initializeComboBoxes() {
        //Alignment combo box
        alignmentComboBox = new JComboBox<>();
        EnumSet.allOf(Constants.Alignment.class).forEach(a -> alignmentComboBox.addItem(a));
        alignmentComboBox.setFont(Constants.labels);
        alignmentComboBox.setBounds(175, 350, 250, 40);
        alignmentComboBox.setForeground(Color.BLACK);

        //Race combo box
        raceComboBox = new JComboBox<>();
        EnumSet.allOf(Constants.Races.class).forEach(r -> raceComboBox.addItem(r));
        raceComboBox.setFont(Constants.labels);
        raceComboBox.setBounds(175, 200, 250, 40);
        raceComboBox.setForeground(Color.BLACK);

        //Class combo box
        classComboBox = new JComboBox<>();
        EnumSet.allOf(Constants.Classes.class).forEach(c -> classComboBox.addItem(c));
        classComboBox.setFont(Constants.labels);
        classComboBox.setBounds(175, 250, 250, 40);
        classComboBox.setForeground(Color.BLACK);

        //Damage type combo box 1
        damageTypesComboBox1 = new JComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox1.addItem(d));
        damageTypesComboBox1.setFont(Constants.labels);
        damageTypesComboBox1.setBounds(1675, 150, 200, 40);
        damageTypesComboBox1.setForeground(Color.BLACK);

        //Damage type combo box 2
        damageTypesComboBox2 = new JComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox2.addItem(d));
        damageTypesComboBox2.setFont(Constants.labels);
        damageTypesComboBox2.setBounds(1675, 200, 200, 40);
        damageTypesComboBox2.setForeground(Color.BLACK);

        //Damage type combo box 3
        damageTypesComboBox3 = new JComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox3.addItem(d));
        damageTypesComboBox3.setFont(Constants.labels);
        damageTypesComboBox3.setBounds(1675, 250, 200, 40);
        damageTypesComboBox3.setForeground(Color.BLACK);
    }

    private void initializeTextFields() {
        //player name text field
        pNameField = new JTextField();
        pNameField.setBounds(175, 100, 250, 40);
        pNameField.setFont(Constants.labels);

        //Character name text field
        cNameField = new JTextField();
        cNameField.setBounds(175, 150, 250, 40);
        cNameField.setFont(Constants.labels);

        //Level text field
        levelField = new JTextField();
        levelField.setBounds(175, 300, 250, 40);
        levelField.setFont(Constants.labels);

        //Strength text field
        strengthField = new JTextField();
        strengthField.setBounds(175, 450, 75, 40);
        strengthField.setFont(Constants.labels);

        //Strength modifier field
        strengthMField = new JTextField();
        strengthMField.setBounds(340, 450, 75, 40);
        strengthMField.setFont(Constants.labels);

        //Strength saving throw field
        strengthSTField = new JTextField();
        strengthSTField.setBounds(500, 450, 75, 40);
        strengthSTField.setFont(Constants.labels);

        //Dexterity text field
        dexterityField = new JTextField();
        dexterityField.setBounds(175, 500, 75, 40);
        dexterityField.setFont(Constants.labels);

        //Dexterity modifier field
        dexterityMField = new JTextField();
        dexterityMField.setBounds(340, 500, 75, 40);
        dexterityMField.setFont(Constants.labels);

        //Dexterity saving throw field
        dexteritySTField = new JTextField();
        dexteritySTField.setBounds(500, 500, 75, 40);
        dexteritySTField.setFont(Constants.labels);

        //Constitution text field
        constitutionField = new JTextField();
        constitutionField.setBounds(175, 550, 75, 40);
        constitutionField.setFont(Constants.labels);

        //Constitution modifier field
        constitutionMField = new JTextField();
        constitutionMField.setBounds(340, 550, 75, 40);
        constitutionMField.setFont(Constants.labels);

        //Constitution saving throw field
        constitutionSTField = new JTextField();
        constitutionSTField.setBounds(500, 550, 75, 40);
        constitutionSTField.setFont(Constants.labels);

        //Intelligence text field
        intelligenceField = new JTextField();
        intelligenceField.setBounds(175, 600, 75, 40);
        intelligenceField.setFont(Constants.labels);

        //Intelligence modifier field
        intelligenceMField = new JTextField();
        intelligenceMField.setBounds(340, 600, 75, 40);
        intelligenceMField.setFont(Constants.labels);

        //Intelligence saving throw field
        intelligenceSTField = new JTextField();
        intelligenceSTField.setBounds(500, 600, 75, 40);
        intelligenceSTField.setFont(Constants.labels);

        //Charisma text field
        charismaField = new JTextField();
        charismaField.setBounds(175, 650, 75, 40);
        charismaField.setFont(Constants.labels);

        //Charisma modifier field
        charismaMField = new JTextField();
        charismaMField.setBounds(340, 650, 75, 40);
        charismaMField.setFont(Constants.labels);

        //Charisma saving throw field
        charismaSTField = new JTextField();
        charismaSTField.setBounds(500, 650, 75, 40);
        charismaSTField.setFont(Constants.labels);

        //Wisdom text field
        wisdomField = new JTextField();
        wisdomField.setBounds(175, 700, 75, 40);
        wisdomField.setFont(Constants.labels);

        //Wisdom modifier field
        wisdomMField = new JTextField();
        wisdomMField.setBounds(340, 700, 75, 40);
        wisdomMField.setFont(Constants.labels);

        //Wisdom saving throw field
        wisdomSTField = new JTextField();
        wisdomSTField.setBounds(500, 700, 75, 40);
        wisdomSTField.setFont(Constants.labels);

        //Proficiency field
        proficiencyField = new JTextField();
        proficiencyField.setBounds(175, 800, 75, 40);
        proficiencyField.setFont(Constants.labels);

        //Armor class field
        armorClassField = new JTextField();
        armorClassField.setBounds(175, 850, 75, 40);
        armorClassField.setFont(Constants.labels);

        //Difficulty class field
        difficultyClassField = new JTextField();
        difficultyClassField.setBounds(175, 900, 75, 40);
        difficultyClassField.setFont(Constants.labels);

        //Initiative field
        initiativeField = new JTextField();
        initiativeField.setBounds(175, 950, 75, 40);
        initiativeField.setFont(Constants.labels);

        //Speed field
        speedField = new JTextField();
        speedField.setBounds(175, 1000, 75, 40);
        speedField.setFont(Constants.labels);

        //Skill text fields
        //Acrobatics filed
        acrobaticsField = new JTextField();
        acrobaticsField.setBounds(875, 100, 75, 40);
        acrobaticsField.setFont(Constants.labels);

        //Animal handling field
        animalHandlingField = new JTextField();
        animalHandlingField.setBounds(875, 150, 75, 40);
        animalHandlingField.setFont(Constants.labels);

        //Arcana field
        arcanaField = new JTextField();
        arcanaField.setBounds(875, 200, 75, 40);
        arcanaField.setFont(Constants.labels);

        //Athletics field
        athleticsField = new JTextField();
        athleticsField.setBounds(875, 250, 75, 40);
        athleticsField.setFont(Constants.labels);

        //History field
        historyField = new JTextField();
        historyField.setBounds(875, 300, 75, 40);
        historyField.setFont(Constants.labels);

        //Deception field
        deceptionField = new JTextField();
        deceptionField.setBounds(875, 350, 75, 40);
        deceptionField.setFont(Constants.labels);

        //Insight field
        insightField = new JTextField();
        insightField.setBounds(875, 400, 75, 40);
        insightField.setFont(Constants.labels);

        //Intimidation field
        intimidationField = new JTextField();
        intimidationField.setBounds(875, 450, 75, 40);
        intimidationField.setFont(Constants.labels);

        //Investigation field
        investigationField = new JTextField();
        investigationField.setBounds(875, 500, 75, 40);
        investigationField.setFont(Constants.labels);

        //Medicine field
        medicineField = new JTextField();
        medicineField.setBounds(875, 550, 75, 40);
        medicineField.setFont(Constants.labels);

        //Nature field
        natureField = new JTextField();
        natureField.setBounds(875, 600, 75, 40);
        natureField.setFont(Constants.labels);

        //Perception field
        perceptionField = new JTextField();
        perceptionField.setBounds(875, 650, 75, 40);
        perceptionField.setFont(Constants.labels);

        //Performance field
        performanceField = new JTextField();
        performanceField.setBounds(875, 700, 75, 40);
        performanceField.setFont(Constants.labels);

        //Persuasion field
        persuasionField = new JTextField();
        persuasionField.setBounds(875, 750, 75, 40);
        persuasionField.setFont(Constants.labels);

        //Religion field
        religionField = new JTextField();
        religionField.setBounds(875, 800, 75, 40);
        religionField.setFont(Constants.labels);

        //Sleight of hand field
        sleightOfHandField = new JTextField();
        sleightOfHandField.setBounds(875, 850, 75, 40);
        sleightOfHandField.setFont(Constants.labels);

        //Stealth field
        stealthField = new JTextField();
        stealthField.setBounds(875, 900, 75, 40);
        stealthField.setFont(Constants.labels);

        //Survival field
        survivalField = new JTextField();
        survivalField.setBounds(875, 950, 75, 40);
        survivalField.setFont(Constants.labels);

        //Attack 1 field
        attack1Field = new JTextField();
        attack1Field.setBounds(1300, 150, 225, 40);
        attack1Field.setFont(Constants.labels);

        //Attack 1 bonus field
        attack1BonusField = new JTextField();
        attack1BonusField.setBounds(1550, 150, 75, 40);
        attack1Field.setFont(Constants.labels);

        //Attack 2 field
        attack2Field = new JTextField();
        attack2Field.setBounds(1300, 200, 225, 40);
        attack2Field.setFont(Constants.labels);

        //Attack 2 bonus field
        attack2BonusField = new JTextField();
        attack2BonusField.setBounds(1550, 200, 75, 40);
        attack2BonusField.setFont(Constants.labels);

        //Attack 3 field
        attack3Field = new JTextField();
        attack3Field.setBounds(1300, 250, 225, 40);
        attack3Field.setFont(Constants.labels);

        //Attack 3 bonus field
        attack3BonusField = new JTextField();
        attack3BonusField.setBounds(1550, 250, 75, 40);
        attack3BonusField.setFont(Constants.labels);

        //HP Field
        HPField = new JTextField();
        HPField.setBounds(1550, 300, 75, 40);
        HPField.setFont(Constants.labels);

        //Temporary HP field
        tempHPField = new JTextField();
        tempHPField.setBounds(1550, 350, 75, 40);
        tempHPField.setFont(Constants.labels);

        //Current HP field
        currentHPField = new JTextField();
        currentHPField.setBounds(1550, 400, 75, 40);
        currentHPField.setFont(Constants.labels);

        //Currency fields
        //Copper field
        copperField = new JTextField();
        copperField.setBounds(1550, 500, 75, 40);
        copperField.setFont(Constants.labels);

        //Silver field
        silverField = new JTextField();
        silverField.setBounds(1550, 550, 75, 40);
        silverField.setFont(Constants.labels);

        //Electrum field
        electrumField = new JTextField();
        electrumField.setBounds(1550, 600, 75, 40);
        electrumField.setFont(Constants.labels);

        //Gold field
        goldField = new JTextField();
        goldField.setBounds(1550, 650, 75, 40);
        goldField.setFont(Constants.labels);

        //Platinum field
        platinumField = new JTextField();
        platinumField.setBounds(1550, 700, 75, 40);
        platinumField.setFont(Constants.labels);

        //Passive wisdom field
        passiveWisdomField = new JTextField();
        passiveWisdomField.setBounds(875, 1000, 75, 40);
        passiveWisdomField.setFont(Constants.labels);
    }

    private void initializeRadioButtons() {
        inspirationRadioButton = new JRadioButton();
        inspirationRadioButton.setBounds(175, 761, 25, 25);
        inspirationRadioButton.setOpaque(false);
    }

    private void initializeButtons() {
        nextPage = new JButton("Next page");
        nextPage.setFont(Constants.buttons);
        nextPage.setBounds(1720, 0, 200, 75);
        nextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                if (MainPanel.s2p == null) {
                    MainPanel.s2p = new Sheet2Panel();
                }
                else {
                    MainPanel.s2p.setVisible(true);
                }
            }
        });
    }

    private void save() {
        MainPanel.sheet.s1.setClasses((Constants.Classes) classComboBox.getSelectedItem());
        MainPanel.sheet.s1.setLevel(levelField.getText());
        MainPanel.sheet.s1.setpName(pNameField.getText());
        MainPanel.sheet.s1.setcName(cNameField.getText());
        MainPanel.sheet.s1.setRace((Constants.Races) raceComboBox.getSelectedItem());
        MainPanel.sheet.s1.setAlignment((Constants.Alignment) alignmentComboBox.getSelectedItem());
        MainPanel.sheet.s1.abilities.set(0, new Ability(Constants.Ability.Strength, strengthField.getText(), strengthMField.getText(), strengthSTField.getText()));
        MainPanel.sheet.s1.abilities.set(1, new Ability(Constants.Ability.Dexterity, dexterityField.getText(), dexterityMField.getText(), dexteritySTField.getText()));
        MainPanel.sheet.s1.abilities.set(2, new Ability(Constants.Ability.Constitution, constitutionField.getText(), constitutionMField.getText(), constitutionSTField.getText()));
        MainPanel.sheet.s1.abilities.set(3, new Ability(Constants.Ability.Intelligence, intelligenceField.getText(), intelligenceMField.getText(), intelligenceSTField.getText()));
        MainPanel.sheet.s1.abilities.set(4, new Ability(Constants.Ability.Charisma, charismaField.getText(), charismaMField.getText(), charismaSTField.getText()));
        MainPanel.sheet.s1.abilities.set(5, new Ability(Constants.Ability.Wisdom, wisdomField.getText(), wisdomMField.getText(), wisdomSTField.getText()));

        MainPanel.sheet.s1.skills.set(0, new Skill(Constants.Skills.Acrobatics, acrobaticsField.getText()));
        MainPanel.sheet.s1.skills.set(1, new Skill(Constants.Skills.AnimalHandling, animalHandlingField.getText()));
        MainPanel.sheet.s1.skills.set(2, new Skill(Constants.Skills.Arcana, arcanaField.getText()));
        MainPanel.sheet.s1.skills.set(3, new Skill(Constants.Skills.Athletics, athleticsField.getText()));
        MainPanel.sheet.s1.skills.set(4, new Skill(Constants.Skills.History, historyField.getText()));
        MainPanel.sheet.s1.skills.set(5, new Skill(Constants.Skills.Deception, deceptionField.getText()));
        MainPanel.sheet.s1.skills.set(6, new Skill(Constants.Skills.Insight, insightField.getText()));
        MainPanel.sheet.s1.skills.set(7, new Skill(Constants.Skills.Intimidation, intimidationField.getText()));
        MainPanel.sheet.s1.skills.set(8, new Skill(Constants.Skills.Investigation, investigationField.getText()));
        MainPanel.sheet.s1.skills.set(9, new Skill(Constants.Skills.Medicine, medicineField.getText()));
        MainPanel.sheet.s1.skills.set(10, new Skill(Constants.Skills.Nature, natureField.getText()));
        MainPanel.sheet.s1.skills.set(11, new Skill(Constants.Skills.Perception, perceptionField.getText()));
        MainPanel.sheet.s1.skills.set(12, new Skill(Constants.Skills.Performance, performanceField.getText()));
        MainPanel.sheet.s1.skills.set(13, new Skill(Constants.Skills.Persuasion, persuasionField.getText()));
        MainPanel.sheet.s1.skills.set(14, new Skill(Constants.Skills.Religion, religionField.getText()));
        MainPanel.sheet.s1.skills.set(15, new Skill(Constants.Skills.SleightOfHand, sleightOfHandField.getText()));
        MainPanel.sheet.s1.skills.set(16, new Skill(Constants.Skills.Stealth, stealthField.getText()));
        MainPanel.sheet.s1.skills.set(17, new Skill(Constants.Skills.Survival, survivalField.getText()));

        MainPanel.sheet.s1.attacks.set(0, new Attack(attack1Field.getText(), attack1BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox1.getSelectedItem()));
        MainPanel.sheet.s1.attacks.set(1, new Attack(attack2Field.getText(), attack2BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox2.getSelectedItem()));
        MainPanel.sheet.s1.attacks.set(2, new Attack(attack3Field.getText(), attack3BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox3.getSelectedItem()));

        MainPanel.sheet.s1.hp.set(0, currentHPField.getText());
        MainPanel.sheet.s1.hp.set(1, HPField.getText());
        MainPanel.sheet.s1.hp.set(2, tempHPField.getText());

        MainPanel.sheet.s1.currency.set(0, new Currency(Constants.CurrencyType.Copper, copperField.getText()));
        MainPanel.sheet.s1.currency.set(1, new Currency(Constants.CurrencyType.Silver, silverField.getText()));
        MainPanel.sheet.s1.currency.set(2, new Currency(Constants.CurrencyType.Electrum, electrumField.getText()));
        MainPanel.sheet.s1.currency.set(3, new Currency(Constants.CurrencyType.Gold, goldField.getText()));
        MainPanel.sheet.s1.currency.set(4, new Currency(Constants.CurrencyType.Platinum, platinumField.getText()));

        MainPanel.sheet.s1.setInspiration(inspirationRadioButton.isSelected());
        MainPanel.sheet.s1.setProficiencybonus(proficiencyField.getText());
        MainPanel.sheet.s1.setDifficultyclass(difficultyClassField.getText());
        MainPanel.sheet.s1.setArmorclass(armorClassField.getText());
        MainPanel.sheet.s1.setInitiative(initiativeField.getText());
        MainPanel.sheet.s1.setSpeed(speedField.getText());
        MainPanel.sheet.s1.setPassiveWisdom(passiveWisdomField.getText());
    }
}