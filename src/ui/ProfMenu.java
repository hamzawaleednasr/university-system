package ui;

import util.Terminal;
import controllers.Controller;
import models.Prof;

public class ProfMenu {
    public static void printProfMenu() {
        Terminal.clear();
        MainMenu.printHeader("\tProf Menu");
        System.out.println("\t[1] Show Proffesors");
        System.out.println("\t[2] Add Proffesor");
        System.out.println("\t[3] Update Proffesor");
        System.out.println("\t[4] Delete Proffesor");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performProfInput(Terminal.readIntInRange(0, 4));
    }

    public static void printProfRecord(Prof prof) {
        System.out.println("Proffessor ID: " + prof.getId() + "\tName: " + prof.getName() + "\tAge: " + prof.getAge());
    }

    public static Prof readProfInfo() {
        Prof prof = new Prof(
            Terminal.readInt("Enter Proffessor ID: "),
            Terminal.readString("Enter Proffessor name: "),
            Terminal.readInt("Enter Proffessor age: ")
        );

        return prof;
    }

    public static void printProfCard(Prof prof) {
        System.out.println("======P=R=O=F===I=N=F=O=====");
        System.out.println("| ID: " + prof.getId() + "\t|");
        System.out.println("| Name: " + prof.getName() + "\t|");
        System.out.println("| Age: " + prof.getAge() + "\t|");
        System.out.println("============================");
    }
}
