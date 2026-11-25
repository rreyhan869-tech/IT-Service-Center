package de.itservice.gui;

import de.itservice.logic.ComputerLogik;

import javax.swing.*;
import java.awt.*;

public class ComputerGUI extends JFrame {

    private JButton pruefenButton;
    private JButton zurueckButton;
    private JLabel ergebnisLabel;

    public ComputerGUI() {

        setTitle("Computerprüfung");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1, 10, 10));

        pruefenButton = new JButton("Computer prüfen");
        zurueckButton = new JButton("Zurück");

        ergebnisLabel = new JLabel(
                "Noch keine Prüfung durchgeführt",
                SwingConstants.CENTER
        );

        add(ergebnisLabel);
        add(pruefenButton);
        add(zurueckButton);

        new ComputerLogik(this);

        setVisible(true);
    }

    public JButton getPruefenButton() {
        return pruefenButton;
    }

    public JButton getZurueckButton() {
        return zurueckButton;
    }

    public JLabel getErgebnisLabel() {
        return ergebnisLabel;
    }
}