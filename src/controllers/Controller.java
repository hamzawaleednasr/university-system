package controllers;

import ui.MainMenu;
import ui.ProfMenu;
import ui.FacultyMenu;
import ui.StudentMenu;
import ui.SubjectMenu;
import service.FacultyLogic;
import service.ProfLogic;
import service.StudentLogic;
import service.SubjectLogic;

public class Controller {
    public static void performMainInput(int choice) {
        switch (choice) {
            case 1:
                FacultyMenu.printFacultyMenu();
                break;
            case 2:
                ProfMenu.printProfMenu();
                break;
            case 3:
                StudentMenu.printStudentMenu();
                break;
            case 4:
                SubjectMenu.printSubjectMenu();
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
                ProfLogic.show();
                break;
            case 2:
                ProfLogic.add();
                break;
            case 3:
                ProfLogic.update();
                break;
            case 4:
                ProfLogic.delete();
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
                SubjectLogic.show();
                break;
            case 2:
                SubjectLogic.add();
                break;
            case 3:
                SubjectLogic.update();
                break;
            case 4:
                SubjectLogic.delete();
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    
}
