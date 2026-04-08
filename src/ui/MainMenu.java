package ui;

import util.Terminal;
import controllers.Controller;
import core.AppConfig;

public class MainMenu {
    public static void printHeader(String header) {
        System.out.println("==============================================");
        System.out.println("             " + header + "             ");
        System.out.println("==============================================");
    }

    public static void printMainMenu() {
        Terminal.clear();
        printHeader("Welcome to " + AppConfig.university.getName() + " University!");
        System.out.println("\t[1] Faculty Menu");
        System.out.println("\t[2] Prof Menu");
        System.out.println("\t[3] Student Menu");
        System.out.println("\t[4] Subject Menu");
        System.out.println("=============================================");
        System.out.println("\t[0] Exit");
        System.out.println("=============================================");
        Controller.performMainInput(Terminal.readIntInRange(0, 4));
    }

    public static void printProfMenu() {
        Terminal.clear();
        printHeader("Prof Menu");
        System.out.println("\t[1] Show Proffesors");
        System.out.println("\t[2] Add Proffesor");
        System.out.println("\t[3] Update Proffesor");
        System.out.println("\t[4] Delete Proffesor");
        System.out.println("\t[5] Register in a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performProfInput(Terminal.readIntInRange(0, 5));
    }

    public static void printSubjectMenu() {
        Terminal.clear();
        printHeader("Subject Menu");
        System.out.println("\t[1] Show Subjects");
        System.out.println("\t[2] Add Subject");
        System.out.println("\t[3] Update Subject");
        System.out.println("\t[4] Delete Subject");
        System.out.println("\t[5] Register a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performSubjectInput(Terminal.readIntInRange(0, 5));
    }
}
