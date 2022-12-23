package com.dndcharacters.s1project.Panels;

import com.dndcharacters.s1project.*;
import com.dndcharacters.s1project.Components.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.EnumSet;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

/** Sheet1Panel: extends JPanel and shows all labels, text fields, etc. on page 1
 * @author S. Mahon
 * @version 12.19.2022
 */
@SuppressWarnings("DuplicatedCode")
public class Sheet1Panel extends JPanel {

    //JButtons
    /** Button to navigate to the second page */
    private static Button nextPage;
    /** Save button to be displayed on every panel */
    public static Button saveButton;
    /** Return to mainpanel button */
    private static Button mainButton;

    //JLabels
    //General character information
    private static Label playerLabel;
    private static Label characterLabel;
    private static Label raceLabel;
    private static Label classLabel;
    private static Label levelLabel;
    private static Label alignmentLabel;
    //Ability labels
    private static Label strengthLabel;
    private static Label dexterityLabel;
    private static Label constitutionLabel;
    private static Label intelligenceLabel;
    private static Label wisdomLabel;
    private static Label charismaLabel;
    private static Label abilityLabel;
    private static Label modifierLabel;
    private static Label savingThrowLabel;
    //Other character information
    private static Label inspirationLabel;
    private static Label proficiencyLabel;
    private static Label armorClassLabel;
    private static Label difficultyClassLabel;
    private static Label initiativeLabel;
    private static Label speedLabel;
    private static Label experienceLabel;
    private static Label passiveWisdomLabel;
    //Skill JLabels
    private static Label acrobaticsLabel;
    private static Label animalHandlingLabel;
    private static Label arcanaLabel;
    private static Label athleticsLabel;
    private static Label historyLabel;
    private static Label deceptionLabel;
    private static Label insightLabel;
    private static Label intimidationLabel;
    private static Label investigationLabel;
    private static Label medicineLabel;
    private static Label natureLabel;
    private static Label perceptionLabel;
    private static Label performanceLabel;
    private static Label persuasionLabel;
    private static Label religionLabel;
    private static Label sleightOfHandLabel;
    private static Label stealthLabel;
    private static Label survivalLabel;
    //attacks
    private static Label attackLabel;
    private static Label attackBonusLabel;
    private static Label damageTypeLabel;
    //hp
    private static Label HPLabel;
    private static Label tempHPLabel;
    private static Label currentHPLabel;
    //currency
    private static Label currencyLabel;
    private static Label copperLabel;
    private static Label silverLabel;
    private static Label electrumLabel;
    private static Label goldLabel;
    private static Label platinumLabel;

    //JComboBox
    public static ComboBox<Constants.Races> raceComboBox;
    public static ComboBox<Constants.Classes> classComboBox;
    public static ComboBox<Constants.Alignment> alignmentComboBox;
    public static ComboBox<Constants.DamageTypes> damageTypesComboBox1;
    public static ComboBox<Constants.DamageTypes> damageTypesComboBox2;
    public static ComboBox<Constants.DamageTypes> damageTypesComboBox3;

    //JTextFields
    //General information
    public static TextField pNameField;
    public static TextField cNameField;
    public static TextField levelField;
    public static TextField passiveWisdomField;
    //Ability fields
    public static TextField strengthField;
    public static TextField dexterityField;
    public static TextField constitutionField;
    public static TextField intelligenceField;
    public static TextField wisdomField;
    public static TextField charismaField;
    //Modifier fields
    public static TextField strengthMField;
    public static TextField dexterityMField;
    public static TextField constitutionMField;
    public static TextField intelligenceMField;
    public static TextField wisdomMField;
    public static TextField charismaMField;
    //Saving throw fields
    public static TextField strengthSTField;
    public static TextField dexteritySTField;
    public static TextField constitutionSTField;
    public static TextField intelligenceSTField;
    public static TextField wisdomSTField;
    public static TextField charismaSTField;
    //Other character information
    public static TextField proficiencyField;
    public static TextField armorClassField;
    public static TextField difficultyClassField;
    public static TextField initiativeField;
    public static TextField speedField;
    public static TextField experienceField;
    //Skill fields
    public static TextField acrobaticsField;
    public static TextField animalHandlingField;
    public static TextField arcanaField;
    public static TextField athleticsField;
    public static TextField historyField;
    public static TextField deceptionField;
    public static TextField insightField;
    public static TextField intimidationField;
    public static TextField investigationField;
    public static TextField medicineField;
    public static TextField natureField;
    public static TextField perceptionField;
    public static TextField performanceField;
    public static TextField persuasionField;
    public static TextField religionField;
    public static TextField sleightOfHandField;
    public static TextField stealthField;
    public static TextField survivalField;
    //Attack fields
    public static TextField attack1Field;
    public static TextField attack2Field;
    public static TextField attack3Field;
    public static TextField attack1BonusField;
    public static TextField attack2BonusField;
    public static TextField attack3BonusField;
    //HP fields
    public static TextField HPField;
    public static TextField tempHPField;
    public static TextField currentHPField;
    //Currency fields
    public static TextField copperField;
    public static TextField silverField;
    public static TextField electrumField;
    public static TextField goldField;
    public static TextField platinumField;

    //JRadioButtons
    //Other information
    public static JRadioButton inspirationRadioButton;

    /** Constructor, called in MainPanel: sets up default options for the panel*/
    public Sheet1Panel() {
        //panel config
        setSize(1920, 1080);
        setLayout(null);

        //calls component initialization methods
        initializeLabels();
        initializeComboBoxes();
        initializeTextFields();
        initializeRadioButtons();
        initializeButtons();
        addComponents();

        //Final frame/panel setup
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

    /** Contains setup for all JLabels on page 1 of the editor: sets text, font, bounds, and text color */
    private void initializeLabels() {
        //Player Name label
        playerLabel = new Label("Player name:");
        playerLabel.setBounds(0, 100, 200, 50);

        //Character Name label
        characterLabel = new Label("Character name:");
        characterLabel.setBounds(0, 150, 200, 50);

        //Race label
        raceLabel = new Label("Race:");
        raceLabel.setBounds(0, 200, 200, 50);

        //Class label
        classLabel = new Label("Class:");
        classLabel.setBounds(0, 250, 200, 50);

        //Level label
        levelLabel = new Label("Level:");
        levelLabel.setBounds(0, 300, 200, 50);

        //Alignment label
        alignmentLabel = new Label("Alignment:");
        alignmentLabel.setBounds(0, 350, 200, 50);

        //Ability label
        abilityLabel = new Label("Ability Scores");
        abilityLabel.setBounds(175, 400, 200, 50);

        //Modifier label
        modifierLabel = new Label("Modifiers");
        modifierLabel.setBounds(340, 400, 200, 50);

        //Saving throw label
        savingThrowLabel = new Label("Saving Throws");
        savingThrowLabel.setBounds(500, 400, 200, 50);

        //Strength label
        strengthLabel = new Label("Strength:");
        strengthLabel.setBounds(0, 450, 200, 50);

        //Dexterity label
        dexterityLabel = new Label("Dexterity:");
        dexterityLabel.setBounds(0, 500, 200, 50);

        //Constitution label
        constitutionLabel = new Label("Constitution:");
        constitutionLabel.setBounds(0, 550, 200, 50);

        //Intelligence label
        intelligenceLabel = new Label("Intelligence:");
        intelligenceLabel.setBounds(0, 600, 200, 50);

        //Charisma label
        charismaLabel = new Label("Charisma:");
        charismaLabel.setBounds(0, 650, 200, 50);

        //Wisdom label
        wisdomLabel = new Label("Wisdom:");
        wisdomLabel.setBounds(0, 700, 200, 50);

        //Experience label
        experienceLabel = new Label("Experience points:");
        experienceLabel.setBounds(0, 750, 200, 50);

        //Proficiency bonus
        proficiencyLabel = new Label("Proficiency bonus:");
        proficiencyLabel.setBounds(0, 800, 200, 50);

        //Armor class label
        armorClassLabel = new Label("Armor class:");
        armorClassLabel.setBounds(0, 850, 200, 50);

        //Difficulty class label
        difficultyClassLabel = new Label("Difficulty class:");
        difficultyClassLabel.setBounds(0, 900, 200, 50);

        //Initiative label
        initiativeLabel = new Label("Initiative:");
        initiativeLabel.setBounds(0, 950, 200, 50);

        //Speed label
        speedLabel = new Label("Speed:");
        speedLabel.setBounds(0, 1000, 200, 50);

        //Skill labels
        //Acrobatics label
        acrobaticsLabel = new Label("Acrobatics:");
        acrobaticsLabel.setBounds(700, 100, 200, 50);

        //Animal Handling Label
        animalHandlingLabel = new Label("Animal handling:");
        animalHandlingLabel.setBounds(700, 150, 200, 50);

        //Arcana label
        arcanaLabel = new Label("Arcana:");
        arcanaLabel.setBounds(700, 200, 200, 50);

        //Athletics label
        athleticsLabel = new Label("Athletics:");
        athleticsLabel.setBounds(700, 250, 200, 50);

        //Deception label
        deceptionLabel = new Label("Deception:");
        deceptionLabel.setBounds(700, 300, 200, 50);

        //History label
        historyLabel = new Label("History:");
        historyLabel.setBounds(700, 350, 200, 50);

        //Insight label
        insightLabel = new Label("Insight:");
        insightLabel.setBounds(700, 400, 200, 50);

        //Intimidation label
        intimidationLabel = new Label("Intimidation:");
        intimidationLabel.setBounds(700, 450, 200, 50);

        //Investigation label
        investigationLabel = new Label("Investigation:");
        investigationLabel.setBounds(700, 500, 200, 50);

        //Medicine label
        medicineLabel = new Label("Medicine:");
        medicineLabel.setBounds(700, 550, 200, 50);

        //Nature label
        natureLabel = new Label("Nature:");
        natureLabel.setBounds(700, 600, 200, 50);

        //Perception label
        perceptionLabel = new Label("Perception:");
        perceptionLabel.setBounds(700, 650, 200, 50);

        //Performance label
        performanceLabel = new Label("Performance:");
        performanceLabel.setBounds(700, 700, 200, 50);

        //Persuasion label
        persuasionLabel = new Label("Persuasion:");
        persuasionLabel.setBounds(700, 750, 200, 50);

        //Religion label
        religionLabel = new Label("Religion:");
        religionLabel.setBounds(700, 800, 300, 50);

        //Sleight of hand label
        sleightOfHandLabel = new Label("Sleight of hand:");
        sleightOfHandLabel.setBounds(700, 850, 300, 50);

        //Stealth label
        stealthLabel = new Label("Stealth:");
        stealthLabel.setBounds(700, 900, 300, 50);

        //Survival label
        survivalLabel = new Label("Survival:");
        survivalLabel.setBounds(700, 950, 300, 50);

        //Attacks label
        attackLabel = new Label("Attacks");
        attackLabel.setBounds(1300, 100, 200, 50);

        //Attack bonus label
        attackBonusLabel = new Label("Attack bonus");
        attackBonusLabel.setBounds(1550, 100, 200, 50);

        //Damage type label
        damageTypeLabel = new Label("Damage type");
        damageTypeLabel.setBounds(1675, 100, 200, 50);

        //HP label
        HPLabel = new Label("Hit points:");
        HPLabel.setBounds(1300, 300, 200, 50);

        //Temporary HP label
        tempHPLabel = new Label("Temporary hit points:");
        tempHPLabel.setBounds(1300, 350, 200, 50);

        //Current HP label
        currentHPLabel = new Label("Current hit points:");
        currentHPLabel.setBounds(1300, 400, 200, 50);

        //Inspiration label
        inspirationLabel = new Label("Inspiration:");
        inspirationLabel.setBounds(1300, 450, 200, 50);

        //Currency labels
        //Currency label
        currencyLabel = new Label("Currency");
        currencyLabel.setBounds(1400, 500, 200, 50);

        //Copper label
        copperLabel = new Label("Copper:");
        copperLabel.setBounds(1300, 550, 200, 50);

        //Silver label
        silverLabel = new Label("Silver:");
        silverLabel.setBounds(1300, 600, 200, 50);

        //Electrum label
        electrumLabel = new Label("Electrum:");
        electrumLabel.setBounds(1300, 650, 200, 50);

        //Gold label
        goldLabel = new Label("Gold:");
        goldLabel.setBounds(1300, 700, 200, 50);

        //Platinum label
        platinumLabel = new Label("Platinum:");
        platinumLabel.setBounds(1300, 750, 200, 50);

        //Passive wisdom label
        passiveWisdomLabel = new Label("Passive wisdom:");
        passiveWisdomLabel.setBounds(700, 1000, 200, 50);
    }

    /** Contains setup for all JComboBoxes (drop down menu) on page 1 of the editor: adds options, sets font, bounds, text color */
    private void initializeComboBoxes() {
        //Alignment combo box
        alignmentComboBox = new ComboBox<>();
        EnumSet.allOf(Constants.Alignment.class).forEach(a -> alignmentComboBox.addItem(a));
        alignmentComboBox.setBounds(175, 350, 250, 40);

        //Race combo box
        raceComboBox = new ComboBox<>();
        EnumSet.allOf(Constants.Races.class).forEach(r -> raceComboBox.addItem(r));
        raceComboBox.setBounds(175, 200, 250, 40);

        //Class combo box
        classComboBox = new ComboBox<>();
        EnumSet.allOf(Constants.Classes.class).forEach(c -> classComboBox.addItem(c));
        classComboBox.setBounds(175, 250, 250, 40);

        //Damage type combo box 1
        damageTypesComboBox1 = new ComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox1.addItem(d));
        damageTypesComboBox1.setBounds(1675, 150, 200, 40);

        //Damage type combo box 2
        damageTypesComboBox2 = new ComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox2.addItem(d));
        damageTypesComboBox2.setBounds(1675, 200, 200, 40);

        //Damage type combo box 3
        damageTypesComboBox3 = new ComboBox<>();
        EnumSet.allOf(Constants.DamageTypes.class).forEach(d -> damageTypesComboBox3.addItem(d));
        damageTypesComboBox3.setBounds(1675, 250, 200, 40);
    }

    /** Contains setup for all JTextFields on page 1 of the editor: sets font and bounds. Text from deserialization is loaded in the load() method */
    private void initializeTextFields() {
        //player name text field
        pNameField = new TextField();
        pNameField.setBounds(175, 100, 250, 40);

        //Character name text field
        cNameField = new TextField();
        cNameField.setBounds(175, 150, 250, 40);

        //Level text field
        levelField = new TextField();
        levelField.setBounds(175, 300, 250, 40);

        //Strength text field
        strengthField = new TextField();
        strengthField.setBounds(175, 450, 75, 40);

        //Strength modifier field
        strengthMField = new TextField();
        strengthMField.setBounds(340, 450, 75, 40);

        //Strength saving throw field
        strengthSTField = new TextField();
        strengthSTField.setBounds(500, 450, 75, 40);

        //Dexterity text field
        dexterityField = new TextField();
        dexterityField.setBounds(175, 500, 75, 40);

        //Dexterity modifier field
        dexterityMField = new TextField();
        dexterityMField.setBounds(340, 500, 75, 40);

        //Dexterity saving throw field
        dexteritySTField = new TextField();
        dexteritySTField.setBounds(500, 500, 75, 40);

        //Constitution text field
        constitutionField = new TextField();
        constitutionField.setBounds(175, 550, 75, 40);

        //Constitution modifier field
        constitutionMField = new TextField();
        constitutionMField.setBounds(340, 550, 75, 40);

        //Constitution saving throw field
        constitutionSTField = new TextField();
        constitutionSTField.setBounds(500, 550, 75, 40);

        //Intelligence text field
        intelligenceField = new TextField();
        intelligenceField.setBounds(175, 600, 75, 40);

        //Intelligence modifier field
        intelligenceMField = new TextField();
        intelligenceMField.setBounds(340, 600, 75, 40);

        //Intelligence saving throw field
        intelligenceSTField = new TextField();
        intelligenceSTField.setBounds(500, 600, 75, 40);

        //Charisma text field
        charismaField = new TextField();
        charismaField.setBounds(175, 650, 75, 40);

        //Charisma modifier field
        charismaMField = new TextField();
        charismaMField.setBounds(340, 650, 75, 40);

        //Charisma saving throw field
        charismaSTField = new TextField();
        charismaSTField.setBounds(500, 650, 75, 40);

        //Wisdom text field
        wisdomField = new TextField();
        wisdomField.setBounds(175, 700, 75, 40);

        //Wisdom modifier field
        wisdomMField = new TextField();
        wisdomMField.setBounds(340, 700, 75, 40);

        //Wisdom saving throw field
        wisdomSTField = new TextField();
        wisdomSTField.setBounds(500, 700, 75, 40);

        //Experience points field
        experienceField = new TextField();
        experienceField.setBounds(175, 750, 75, 40);

        //Proficiency field
        proficiencyField = new TextField();
        proficiencyField.setBounds(175, 800, 75, 40);

        //Armor class field
        armorClassField = new TextField();
        armorClassField.setBounds(175, 850, 75, 40);

        //Difficulty class field
        difficultyClassField = new TextField();
        difficultyClassField.setBounds(175, 900, 75, 40);

        //Initiative field
        initiativeField = new TextField();
        initiativeField.setBounds(175, 950, 75, 40);

        //Speed field
        speedField = new TextField();
        speedField.setBounds(175, 1000, 75, 40);

        //Skill text fields
        //Acrobatics filed
        acrobaticsField = new TextField();
        acrobaticsField.setBounds(875, 100, 75, 40);

        //Animal handling field
        animalHandlingField = new TextField();
        animalHandlingField.setBounds(875, 150, 75, 40);

        //Arcana field
        arcanaField = new TextField();
        arcanaField.setBounds(875, 200, 75, 40);

        //Athletics field
        athleticsField = new TextField();
        athleticsField.setBounds(875, 250, 75, 40);

        //History field
        historyField = new TextField();
        historyField.setBounds(875, 300, 75, 40);

        //Deception field
        deceptionField = new TextField();
        deceptionField.setBounds(875, 350, 75, 40);

        //Insight field
        insightField = new TextField();
        insightField.setBounds(875, 400, 75, 40);

        //Intimidation field
        intimidationField = new TextField();
        intimidationField.setBounds(875, 450, 75, 40);

        //Investigation field
        investigationField = new TextField();
        investigationField.setBounds(875, 500, 75, 40);

        //Medicine field
        medicineField = new TextField();
        medicineField.setBounds(875, 550, 75, 40);

        //Nature field
        natureField = new TextField();
        natureField.setBounds(875, 600, 75, 40);

        //Perception field
        perceptionField = new TextField();
        perceptionField.setBounds(875, 650, 75, 40);

        //Performance field
        performanceField = new TextField();
        performanceField.setBounds(875, 700, 75, 40);

        //Persuasion field
        persuasionField = new TextField();
        persuasionField.setBounds(875, 750, 75, 40);

        //Religion field
        religionField = new TextField();
        religionField.setBounds(875, 800, 75, 40);

        //Sleight of hand field
        sleightOfHandField = new TextField();
        sleightOfHandField.setBounds(875, 850, 75, 40);

        //Stealth field
        stealthField = new TextField();
        stealthField.setBounds(875, 900, 75, 40);

        //Survival field
        survivalField = new TextField();
        survivalField.setBounds(875, 950, 75, 40);

        //Passive wisdom field
        passiveWisdomField = new TextField();
        passiveWisdomField.setBounds(875, 1000, 75, 40);

        //Attack 1 field
        attack1Field = new TextField();
        attack1Field.setBounds(1300, 150, 225, 40);

        //Attack 1 bonus field
        attack1BonusField = new TextField();
        attack1BonusField.setBounds(1550, 150, 75, 40);

        //Attack 2 field
        attack2Field = new TextField();
        attack2Field.setBounds(1300, 200, 225, 40);

        //Attack 2 bonus field
        attack2BonusField = new TextField();
        attack2BonusField.setBounds(1550, 200, 75, 40);

        //Attack 3 field
        attack3Field = new TextField();
        attack3Field.setBounds(1300, 250, 225, 40);

        //Attack 3 bonus field
        attack3BonusField = new TextField();
        attack3BonusField.setBounds(1550, 250, 75, 40);

        //HP Field
        HPField = new TextField();
        HPField.setBounds(1550, 300, 75, 40);

        //Temporary HP field
        tempHPField = new TextField();
        tempHPField.setBounds(1550, 350, 75, 40);

        //Current HP field
        currentHPField = new TextField();
        currentHPField.setBounds(1550, 400, 75, 40);

        //Currency fields
        //Copper field
        copperField = new TextField();
        copperField.setBounds(1550, 550, 75, 40);

        //Silver field
        silverField = new TextField();
        silverField.setBounds(1550, 600, 75, 40);

        //Electrum field
        electrumField = new TextField();
        electrumField.setBounds(1550, 650, 75, 40);

        //Gold field
        goldField = new TextField();
        goldField.setBounds(1550, 700, 75, 40);

        //Platinum field
        platinumField = new TextField();
        platinumField.setBounds(1550, 750, 75, 40);
    }

    /** Contains setup for the JRadioButton on page 1 of the editor: sets bounds and configures background */
    private void initializeRadioButtons() {
        inspirationRadioButton = new JRadioButton();
        inspirationRadioButton.setBounds(1550, 461, 25, 25);
        inspirationRadioButton.setOpaque(false);
    }

    /** Contains setup for all JButtons on page 1 of the editor: sets bounds, text, font, and action listeners */
    private void initializeButtons() {
        nextPage = new Button("Next page");
        nextPage.setBounds(1720, 0, 200, 75);
        nextPage.addActionListener(e -> {
            setVisible(false);
            MainPanel.s2p.setVisible(true);
        });

        //Save button initialization
        saveButton = new Button("Save and exit");
        saveButton.setBounds(0, 0, 200, 75);
        saveButton.addActionListener(e -> {
            save();
            MainPanel.s2p.save();
            try { MainPanel.serialize();}
            catch (Exception ex) { ex.printStackTrace(); }
            System.exit(0);
        });
        //TODO: make save and exit buttons separate

        //Main button initialization
        mainButton = new Button("Back to main");
        mainButton.setBounds(200, 0, 200, 75);
        mainButton.addActionListener(e -> {
            setVisible(false);
            Main.mp.setVisible(true);
        });

        //TODO: add navigation to dice roller menu
    }

    /** Adds all components to the panel */
    private void addComponents() {
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
        add(experienceLabel);
        add(experienceField);
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
        add(mainButton);
    }

    /** Stores information from every JTextField, JComboBox, and JRadioButton in the data class object */
    public void save() {
        MainPanel.sheet.s1.setClasses((Constants.Classes) classComboBox.getSelectedItem());
        MainPanel.sheet.s1.setLevel(levelField.getText());
        MainPanel.sheet.s1.setpName(pNameField.getText());
        MainPanel.sheet.s1.setcName(cNameField.getText());
        MainPanel.sheet.s1.setRace((Constants.Races) raceComboBox.getSelectedItem());
        MainPanel.sheet.s1.setAlignment((Constants.Alignment) alignmentComboBox.getSelectedItem());
        MainPanel.sheet.s1.abilities.add(0, new Records.Ability(Constants.Ability.Strength, strengthField.getText(), strengthMField.getText(), strengthSTField.getText()));
        MainPanel.sheet.s1.abilities.add(1, new Records.Ability(Constants.Ability.Dexterity, dexterityField.getText(), dexterityMField.getText(), dexteritySTField.getText()));
        MainPanel.sheet.s1.abilities.add(2, new Records.Ability(Constants.Ability.Constitution, constitutionField.getText(), constitutionMField.getText(), constitutionSTField.getText()));
        MainPanel.sheet.s1.abilities.add(3, new Records.Ability(Constants.Ability.Intelligence, intelligenceField.getText(), intelligenceMField.getText(), intelligenceSTField.getText()));
        MainPanel.sheet.s1.abilities.add(4, new Records.Ability(Constants.Ability.Charisma, charismaField.getText(), charismaMField.getText(), charismaSTField.getText()));
        MainPanel.sheet.s1.abilities.add(5, new Records.Ability(Constants.Ability.Wisdom, wisdomField.getText(), wisdomMField.getText(), wisdomSTField.getText()));
        while (MainPanel.sheet.s1.abilities.size() > 6) {
            MainPanel.sheet.s1.abilities.remove(MainPanel.sheet.s1.abilities.size() - 1);
        }

        MainPanel.sheet.s1.skills.add(0, new Records.Skill(acrobaticsField.getText()));
        MainPanel.sheet.s1.skills.add(1, new Records.Skill(animalHandlingField.getText()));
        MainPanel.sheet.s1.skills.add(2, new Records.Skill(arcanaField.getText()));
        MainPanel.sheet.s1.skills.add(3, new Records.Skill(athleticsField.getText()));
        MainPanel.sheet.s1.skills.add(4, new Records.Skill(historyField.getText()));
        MainPanel.sheet.s1.skills.add(5, new Records.Skill(deceptionField.getText()));
        MainPanel.sheet.s1.skills.add(6, new Records.Skill(insightField.getText()));
        MainPanel.sheet.s1.skills.add(7, new Records.Skill(intimidationField.getText()));
        MainPanel.sheet.s1.skills.add(8, new Records.Skill(investigationField.getText()));
        MainPanel.sheet.s1.skills.add(9, new Records.Skill(medicineField.getText()));
        MainPanel.sheet.s1.skills.add(10, new Records.Skill(natureField.getText()));
        MainPanel.sheet.s1.skills.add(11, new Records.Skill(perceptionField.getText()));
        MainPanel.sheet.s1.skills.add(12, new Records.Skill(performanceField.getText()));
        MainPanel.sheet.s1.skills.add(13, new Records.Skill(persuasionField.getText()));
        MainPanel.sheet.s1.skills.add(14, new Records.Skill(religionField.getText()));
        MainPanel.sheet.s1.skills.add(15, new Records.Skill(sleightOfHandField.getText()));
        MainPanel.sheet.s1.skills.add(16, new Records.Skill(stealthField.getText()));
        MainPanel.sheet.s1.skills.add(17, new Records.Skill(survivalField.getText()));
        while (MainPanel.sheet.s1.skills.size() > 18) {
            MainPanel.sheet.s1.skills.remove(MainPanel.sheet.s1.skills.size() - 1);
        }

        MainPanel.sheet.s1.attacks.add(0, new Records.Attack(attack1Field.getText(), attack1BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox1.getSelectedItem()));
        MainPanel.sheet.s1.attacks.add(1, new Records.Attack(attack2Field.getText(), attack2BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox2.getSelectedItem()));
        MainPanel.sheet.s1.attacks.add(2, new Records.Attack(attack3Field.getText(), attack3BonusField.getText(), (Constants.DamageTypes) damageTypesComboBox3.getSelectedItem()));
        while(MainPanel.sheet.s1.attacks.size() > 3) {
            MainPanel.sheet.s1.attacks.remove(MainPanel.sheet.s1.attacks.size() - 1);
        }

        MainPanel.sheet.s1.hp.add(0, currentHPField.getText());
        MainPanel.sheet.s1.hp.add(1, HPField.getText());
        MainPanel.sheet.s1.hp.add(2, tempHPField.getText());
        while(MainPanel.sheet.s1.hp.size() > 3) {
            MainPanel.sheet.s1.hp.remove(MainPanel.sheet.s1.hp.size() - 1);
        }

        MainPanel.sheet.s1.currency.add(0, new Records.Currency(copperField.getText()));
        MainPanel.sheet.s1.currency.add(1, new Records.Currency(silverField.getText()));
        MainPanel.sheet.s1.currency.add(2, new Records.Currency(electrumField.getText()));
        MainPanel.sheet.s1.currency.add(3, new Records.Currency(goldField.getText()));
        MainPanel.sheet.s1.currency.add(4, new Records.Currency(platinumField.getText()));
        while(MainPanel.sheet.s1.currency.size() > 5) {
            MainPanel.sheet.s1.currency.remove(MainPanel.sheet.s1.currency.size() - 1);
        }

        MainPanel.sheet.s1.setInspiration(inspirationRadioButton.isSelected());
        MainPanel.sheet.s1.setProficiencybonus(proficiencyField.getText());
        MainPanel.sheet.s1.setDifficultyclass(difficultyClassField.getText());
        MainPanel.sheet.s1.setArmorclass(armorClassField.getText());
        MainPanel.sheet.s1.setInitiative(initiativeField.getText());
        MainPanel.sheet.s1.setSpeed(speedField.getText());
        MainPanel.sheet.s1.setPassiveWisdom(passiveWisdomField.getText());

        MainPanel.sheet.s1.setExperiencePoints(experienceField.getText());
    }

    /** Loads all information from serialized object into JTextFields, JComboBoxes, and JRadioButton */
    public void load() {
        raceComboBox.setSelectedItem(MainPanel.sheet.s1.getRace());
        classComboBox.setSelectedItem(MainPanel.sheet.s1.getClasses());
        alignmentComboBox.setSelectedItem(MainPanel.sheet.s1.getAlignment());
        damageTypesComboBox1.setSelectedItem(MainPanel.sheet.s1.attacks.get(0).type());
        damageTypesComboBox2.setSelectedItem(MainPanel.sheet.s1.attacks.get(1).type());
        damageTypesComboBox3.setSelectedItem(MainPanel.sheet.s1.attacks.get(2).type());

        pNameField.setText(MainPanel.sheet.s1.getpName());
        cNameField.setText(MainPanel.sheet.s1.getcName());
        levelField.setText(MainPanel.sheet.s1.getLevel());

        strengthField.setText(MainPanel.sheet.s1.abilities.get(0).abilityValue());
        strengthMField.setText(MainPanel.sheet.s1.abilities.get(0).modifierValue());
        strengthSTField.setText(MainPanel.sheet.s1.abilities.get(0).savingThrowValue());

        dexterityField.setText(MainPanel.sheet.s1.abilities.get(1).abilityValue());
        dexterityMField.setText(MainPanel.sheet.s1.abilities.get(1).modifierValue());
        dexteritySTField.setText(MainPanel.sheet.s1.abilities.get(1).savingThrowValue());

        constitutionField.setText(MainPanel.sheet.s1.abilities.get(2).abilityValue());
        constitutionMField.setText(MainPanel.sheet.s1.abilities.get(2).modifierValue());
        constitutionSTField.setText(MainPanel.sheet.s1.abilities.get(2).savingThrowValue());

        intelligenceField.setText(MainPanel.sheet.s1.abilities.get(3).abilityValue());
        intelligenceMField.setText(MainPanel.sheet.s1.abilities.get(3).modifierValue());
        intelligenceSTField.setText(MainPanel.sheet.s1.abilities.get(3).savingThrowValue());

        charismaField.setText(MainPanel.sheet.s1.abilities.get(4).abilityValue());
        charismaMField.setText(MainPanel.sheet.s1.abilities.get(4).modifierValue());
        charismaSTField.setText(MainPanel.sheet.s1.abilities.get(4).savingThrowValue());

        wisdomField.setText(MainPanel.sheet.s1.abilities.get(5).abilityValue());
        wisdomMField.setText(MainPanel.sheet.s1.abilities.get(5).modifierValue());
        wisdomSTField.setText(MainPanel.sheet.s1.abilities.get(5).savingThrowValue());

        proficiencyField.setText(MainPanel.sheet.s1.getProficiencybonus());
        armorClassField.setText(MainPanel.sheet.s1.getArmorclass());
        difficultyClassField.setText(MainPanel.sheet.s1.getDifficultyclass());
        initiativeField.setText(MainPanel.sheet.s1.getInitiative());
        speedField.setText(MainPanel.sheet.s1.getSpeed());

        acrobaticsField.setText(MainPanel.sheet.s1.skills.get(0).skillValue());
        animalHandlingField.setText(MainPanel.sheet.s1.skills.get(1).skillValue());
        arcanaField.setText(MainPanel.sheet.s1.skills.get(2).skillValue());
        athleticsField.setText(MainPanel.sheet.s1.skills.get(3).skillValue());
        historyField.setText(MainPanel.sheet.s1.skills.get(4).skillValue());
        deceptionField.setText(MainPanel.sheet.s1.skills.get(5).skillValue());
        insightField.setText(MainPanel.sheet.s1.skills.get(6).skillValue());
        intimidationField.setText(MainPanel.sheet.s1.skills.get(7).skillValue());
        investigationField.setText(MainPanel.sheet.s1.skills.get(8).skillValue());
        medicineField.setText(MainPanel.sheet.s1.skills.get(9).skillValue());
        natureField.setText(MainPanel.sheet.s1.skills.get(10).skillValue());
        perceptionField.setText(MainPanel.sheet.s1.skills.get(11).skillValue());
        performanceField.setText(MainPanel.sheet.s1.skills.get(12).skillValue());
        persuasionField.setText(MainPanel.sheet.s1.skills.get(13).skillValue());
        religionField.setText(MainPanel.sheet.s1.skills.get(14).skillValue());
        sleightOfHandField.setText(MainPanel.sheet.s1.skills.get(15).skillValue());
        stealthField.setText(MainPanel.sheet.s1.skills.get(16).skillValue());
        survivalField.setText(MainPanel.sheet.s1.skills.get(17).skillValue());

        attack1Field.setText(MainPanel.sheet.s1.attacks.get(0).attackName());
        attack2Field.setText(MainPanel.sheet.s1.attacks.get(1).attackName());
        attack3Field.setText(MainPanel.sheet.s1.attacks.get(2).attackName());
        attack1BonusField.setText(MainPanel.sheet.s1.attacks.get(0).attackBonus());
        attack2BonusField.setText(MainPanel.sheet.s1.attacks.get(1).attackBonus());
        attack3BonusField.setText(MainPanel.sheet.s1.attacks.get(2).attackBonus());

        currentHPField.setText(MainPanel.sheet.s1.hp.get(0));
        HPField.setText(MainPanel.sheet.s1.hp.get(1));
        tempHPField.setText(MainPanel.sheet.s1.hp.get(2));

        copperField.setText(MainPanel.sheet.s1.currency.get(0).currencyValue());
        silverField.setText(MainPanel.sheet.s1.currency.get(1).currencyValue());
        electrumField.setText(MainPanel.sheet.s1.currency.get(2).currencyValue());
        goldField.setText(MainPanel.sheet.s1.currency.get(3).currencyValue());
        platinumField.setText(MainPanel.sheet.s1.currency.get(4).currencyValue());

        passiveWisdomField.setText(MainPanel.sheet.s1.getPassiveWisdom());
        inspirationRadioButton.setSelected(MainPanel.sheet.s1.isInspiration());

        experienceField.setText(MainPanel.sheet.s1.getExperiencePoints());
    }
}