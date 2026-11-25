package de.itservice.gui;

import de.itservice.logic.SupportLogik;

import javax.swing.*;
import java.awt.*;

public class SupportGUI extends JFrame {

    private JButton kontaktButton;
    private JButton zurueckButton;
    private JLabel statusLabel;

    public SupportGUI() {

        setTitle("IT-Support");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1, 10, 10));

        statusLabel = new JLabel(
                "Benötigen Sie Hilfe?",
                SwingConstants.CENTER
        );

        kontaktButton = new JButton("Support kontaktieren");
        zurueckButton = new JButton("Zurück");

        add(statusLabel);
        add(kontaktButton);
        add(zurueckButton);

        new SupportLogik(this);

        setVisible(true);
    }

    public JButton getKontaktButton() {
        return kontaktButton;
    }

    public JButton getZurueckButton() {
        return zurueckButton;
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }
}
 