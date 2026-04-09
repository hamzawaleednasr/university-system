package ui;

import util.Terminal;
import controllers.Controller;
import core.AppConfig;

public class MainMenu {
    public static void printHeader(String header) {
        System.out.println("==============================================");
        System.out.println(header);
        System.out.println("==============================================");
    }

    public static void printMainMenu() {
        Terminal.clear();
        printHeader("\tWelcome to " + AppConfig.university.getName() + " University!");
        System.out.println("\t[1] Faculty Menu");
        System.out.println("\t[2] Prof Menu");
        System.out.println("\t[3] Student Menu");
        System.out.println("\t[4] Subject Menu");
        System.out.println("=============================================");
        System.out.println("\t[0] Exit");
        System.out.println("=============================================");
        Controller.performMainInput(Terminal.readIntInRange(0, 4));
    }
}
