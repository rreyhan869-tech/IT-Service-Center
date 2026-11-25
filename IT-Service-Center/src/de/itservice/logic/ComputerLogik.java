package de.itservice.logic;

import de.itservice.gui.ComputerGUI;
import de.itservice.gui.HauptmenueGUI;

public class ComputerLogik {
    public ComputerLogik(ComputerGUI gui){

        //computerprüfung starten
        gui.getPruefenButton().addActionListener( e -> {
            gui.getErgebnisLabel().setText ("Ergebnis: Computer funktioniert!"); } );

        //Zurück zum Huptmenü
        gui.getZurueckButton().addActionListener( e -> {
            new HauptmenueGUI();
            gui.dispose();});
    }
}
