package com.dndcharacters.s1project.Panels;

import com.dndcharacters.s1project.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** JPanel class: represents the first panel to be displayed on program startup */
public class MainPanel extends JPanel {
    /**
     * JFrame object
     */
    public static JFrame frame = new JFrame("D&D Character Editor");
    /**
     * Sheet object
     */
    public static Sheet sheet;
    /**
     * Background image
     */
    public static BufferedImage backgroundImage;
    public static BufferedImage icon;

    public static Sheet1Panel s1p = null;
    public static Sheet2Panel s2p = null;

    private static final File f = new File("C:\\Users\\parzival3719\\Desktop\\Code\\Java\\S1Project\\src\\main\\java\\com\\dndcharacters\\s1project\\Panels\\save.dat");

    //Constructor, called in main()
    public MainPanel() throws IOException {
        //JFrame config
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        icon = ImageIO.read(new File("C:\\Users\\parzival3719\\Desktop\\Code\\Java\\S1Project\\src\\main\\java\\com\\dndcharacters\\s1project\\Panels\\D&D Logo.png"));
        frame.setIconImage(icon);

        Constants.labels = new Font("Serif", Font.BOLD, 20);
        Constants.buttons = new Font("Serif", Font.BOLD, 30);
        Constants.saveFont = new Font("Serif", Font.BOLD, 20);

        //JPanel config
        setSize(1920, 1080);
        setLayout(null);

        //Initializes image from local disk
        backgroundImage = ImageIO.read(new File("C:\\Users\\parzival3719\\Desktop\\Code\\Java\\S1Project\\src\\main\\java\\com\\dndcharacters\\s1project\\Panels\\Background.jpg"));

        //JButtons
        JButton newFile = new JButton("Create a new file");
        JButton loadFile = new JButton("Load an existing file");
        //JButton bounds
        newFile.setBounds(400, 465, 300, 150);
        loadFile.setBounds(1220, 465, 300, 150);
        Sheet1Panel.saveButton.setBounds(0, 0, 100, 75);
        //setting fonts
        newFile.setFont(Constants.buttons);
        loadFile.setFont(Constants.buttons);
        Sheet1Panel.saveButton.setFont(Constants.saveFont);
        //ActionListeners
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sheet = new Sheet();
                setVisible(false);
                s1p = new Sheet1Panel();
                s2p = new Sheet2Panel();
                s2p.setVisible(false);
            }
        });
        loadFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });

        //final additions
        add(newFile);
        add(loadFile);

        //frame setup
        frame.add(this);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, this);
    }

    public static void serialize() throws IOException {
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

    private static void deserialize() throws IOException, ClassNotFoundException {
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
}