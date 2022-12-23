package com.dndcharacters.s1project.Panels;

import com.dndcharacters.s1project.Components.Button;
import com.dndcharacters.s1project.Components.Label;
import com.dndcharacters.s1project.Constants;
import com.dndcharacters.s1project.Sheets.Sheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**MainPanel: extends JPanel and shows the screen with the first 2 buttons; represents the first panel to be displayed on program startup
 * Also contains serialization and deserialization functions
 * @author S. Mahon
 * @version 12.15.2022
 * */
public class MainPanel extends JPanel {
    /** JFrame object */
    public static JFrame frame = new JFrame("D&D Character Editor");
    /** Sheet object */
    public static Sheet sheet;
    /** Background image */
    public static BufferedImage backgroundImage;
    /** Application icon, appears on taskbar and top left corner */
    public static BufferedImage icon;

    //JPanels for each page
    public static Sheet1Panel s1p = null;
    public static Sheet2Panel s2p = null;
    public static DicePanel dicePanel = null;

    //Buttons
    private static Button newFile;
    private static Button loadFile;
    private static Button diceButton;

    //Label
    private static Label title;

    //Serialization/deserialization file
    private static final File f = new File("save.dat");

    /** Constructor, called in main: sets up default options for the frame and the panels */
    public MainPanel() throws IOException {
        //JFrame config
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        icon = ImageIO.read(new File("./src/main/java/com/dndcharacters/s1project/Resources/Logo.png"));
        frame.setIconImage(icon);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //MainPanel config
        setSize(1920, 1080);
        setLayout(null);

        //Initializes image from local disk
        backgroundImage = ImageIO.read(new File("./src/main/java/com/dndcharacters/s1project/Resources/Background.jpg"));

        initializeButtons();
        initializeLabels();
        addComponents();


        //final JFrame setup
        frame.add(this); //adds panel to frame
        frame.setVisible(true);
        setVisible(true);
    }

    /** Overrides JPanel paintComponent method and draws background image */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, this);
        int brightness = (int) (256 - 256 * 0.85f);
        g2d.setColor(new Color(0, 0, 0, brightness));
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    /** Serialization method: writes 'sheet' to file */
    public static void serialize() {
        try {
            FileOutputStream fileOut = new FileOutputStream(f);
            ObjectOutputStream sheetOut = new ObjectOutputStream(fileOut);

            sheetOut.writeObject(sheet);

            sheetOut.close();
            fileOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /** Deserialization method: loads serialized object from file into 'sheet' object */
    private static void deserialize() {
        try {
            FileInputStream fileIn = new FileInputStream(f);
            ObjectInputStream sheetIn = new ObjectInputStream(fileIn);

            MainPanel.sheet = (Sheet) sheetIn.readObject();

            sheetIn.close();
            fileIn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** initializes buttons: sets text, boundaries, fonts, and action listeners */
    private void initializeButtons() {
        //JButtons
        newFile = new Button("Create a new file");
        loadFile = new Button("Load an existing file");
        diceButton = new Button("Roll dice");
        //JButton bounds
        newFile.setBounds(300, 465, 300, 150);
        loadFile.setBounds(810, 465, 300, 150);
        diceButton.setBounds(1320, 465, 300, 150);
        //ActionListeners
        newFile.addActionListener(e -> {
            sheet = new Sheet();
            setVisible(false);
            s1p = new Sheet1Panel();
            s2p = new Sheet2Panel();
            s2p.setVisible(false);
            dicePanel = new DicePanel();
            dicePanel.setVisible(false);
        });
        loadFile.addActionListener(e -> {
            try {
                deserialize();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            setVisible(false);
            s1p = new Sheet1Panel();
            s1p.load();
            s2p = new Sheet2Panel();
            s2p.setVisible(false);
            s2p.load();
            dicePanel = new DicePanel();
            dicePanel.setVisible(false);
        });
        diceButton.addActionListener(e -> {
            dicePanel = new DicePanel();
            setVisible(false);
        });
    }

    /** initializes labels: title */
    private void initializeLabels() {
        title = new Label("D&D Character Editor");
        title.setFont(Constants.titleFont);
        title.setBounds(420, 0, 1080, 150);
    }

    /** Adds all components to the panel*/
    private void addComponents() {
        add(newFile);
        add(loadFile);
        add(diceButton);
        add(title);
    }
}