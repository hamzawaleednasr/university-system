package controllers;

import ui.MainMenu;
import ui.FacultyMenu;

public class Controller {
    public static void performMainInput(int choice) {
        switch (choice) {
            case 1:
                FacultyMenu.printFacultyMenu();
                break;
            case 2:
                MainMenu.printProfMenu();
                break;
            case 3:
                MainMenu.printStudentMenu();
                break;
            case 4:
                MainMenu.printSubjectMenu();
                break;
            case 0:
                return;
        }
    }

    public static void performFacultyInput(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performProfInput(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performStudentInput(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performSubjectInput(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    
}
