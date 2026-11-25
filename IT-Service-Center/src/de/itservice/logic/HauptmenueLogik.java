package de.itservice.logic;

import de.itservice.gui.HauptmenueGUI;
import de.itservice.gui.ComputerGUI;
import de.itservice.gui.SupportGUI;


public class HauptmenueLogik {

    public HauptmenueLogik(HauptmenueGUI gui){

        //ComputerButton
        gui.getComputerButton().addActionListener(e -> {
            new ComputerGUI();
            gui.dispose();          //löschen hauptmenue ligik fenster
        });

        //Support Button
        gui.getSupportButton().addActionListener(e -> {
            new SupportGUI();
            gui.dispose();});
}}
