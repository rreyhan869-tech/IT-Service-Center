package de.itservice.logic;

import de.itservice.gui.SupportGUI;
import de.itservice.gui.HauptmenueGUI;

public class SupportLogik {
    public SupportLogik(SupportGUI gui) {

        //Support kontaktieren
        gui.getKontaktButton().addActionListener(e -> {
            gui.getStatusLabel().setText("Support wurde informiert!");
        });

        //zurück zim Hauptmenü
        gui.getZurueckButton().addActionListener(e -> {
            new HauptmenueGUI();
            gui.dispose();
        });
    }
}
