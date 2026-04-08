package controllers;

import ui.MainMenu;
import service.FacultyLogic;
import service.StudentLogic;
import ui.FacultyMenu;
import ui.StudentMenu;

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
                StudentMenu.printStudentMenu();
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
                FacultyLogic.show();
                break;
            case 2:
                FacultyLogic.add();
                break;
            case 3:
                FacultyLogic.update();
                break;
            case 4:
                FacultyLogic.delete();
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
                StudentLogic.show();
                break;
            case 2:
                StudentLogic.add();
                break;
            case 3:
                StudentLogic.update();
                break;
            case 4:
                StudentLogic.delete();
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
