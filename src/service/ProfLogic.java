package service;

import ui.MainMenu;
import ui.ProfMenu;
import core.AppConfig;
import util.Terminal;
import models.Prof;

public class ProfLogic {
    public static void show() {
        MainMenu.printHeader("Proffessors");

        for (Prof prof : AppConfig.university.getProfs()) {
            ProfMenu.printProfRecord(prof);
        }

        System.out.println("=============================================================");
    }

    public static void add() {
        MainMenu.printHeader("Add Proffessor");

        Prof newProf = ProfMenu.readProfInfo();
        AppConfig.university.addProf(newProf);

        System.out.println("=============================================================");
    }

    public static Prof find() {
        int profID;

        while (true) {
            profID = Terminal.readInt("Enter proffessor id: ");
            
            for (Prof prof : AppConfig.university.getProfs()) {
                if (prof.getId() == profID) {
                    return prof;
                }
            }
            
        }
    }

    public static void update() {
        MainMenu.printHeader("Update Proffessor");

        Prof prof = find();

        if (prof != null) {
            ProfMenu.printProfCard(prof);
            System.out.println();
            prof = ProfMenu.readProfInfo();
        }

        System.out.println("=============================================================");
    }

    public static void delete() {
        MainMenu.printHeader("Delete Proffessor");

        Prof prof = find();

        if (prof != null) {
            ProfMenu.printProfCard(prof);

            int accepted = Terminal.readInt("Are you sure delete this proffessor? [1/0]: ");

            if (accepted == 1) {
                AppConfig.university.getProfs().remove(prof);
            } else {
                System.out.println("Operation canceled!");
            }
        }

        System.out.println("=============================================================");
    }

}
