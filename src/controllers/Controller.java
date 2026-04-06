package controllers;

import ui.Menus;

public class Controller {
    public static void performMainInput(int choice) {
        switch (choice) {
            case 1:
                Menus.printFacultyMenu();
                break;
            case 2:
                Menus.printProfMenu();
                break;
            case 3:
                Menus.printStudentMenu();
                break;
            case 4:
                Menus.printSubjectMenu();
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
                Menus.printMainMenu();
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
                Menus.printMainMenu();
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
                Menus.printMainMenu();
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
                Menus.printMainMenu();
                break;
        }
    }    
}
