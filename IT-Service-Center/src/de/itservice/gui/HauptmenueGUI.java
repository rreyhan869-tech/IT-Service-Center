package de.itservice.gui;

import de.itservice.logic.ComputerLogik;
import de.itservice.logic.HauptmenueLogik;
import javax.swing.*;
import java.awt.*;

public class HauptmenueGUI extends JFrame {

    private JButton computerButton;
    private JButton supportButton;

    public HauptmenueGUI() {

        setTitle("IT-Service-Center");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1, 10, 10));

        JLabel titel = new JLabel("Willkommen im IT-Service-Center!", SwingConstants.CENTER);

        computerButton = new JButton("Computer Prüfen");
        supportButton = new JButton("Support Öffnen");

        add(titel);
        add(computerButton);
        add(supportButton);

        //Logik mit dieser GUI verbinden
        new HauptmenueLogik(this);
        setVisible(true);
    }

    public JButton getSupportButton() {
        return supportButton;
    }

    public JButton getComputerButton() {
        return computerButton;
    }
}
