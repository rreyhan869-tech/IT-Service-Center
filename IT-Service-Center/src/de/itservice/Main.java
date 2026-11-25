package de.itservice;

import de.itservice.gui.HauptmenueGUI;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{ new HauptmenueGUI();});

    }
}



