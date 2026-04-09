package controllers;

import ui.MainMenu;
import ui.ProfMenu;
import ui.FacultyMenu;
import ui.StudentMenu;
import ui.SubjectMenu;
import util.Terminal;
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
                Terminal.clear();
                MainMenu.printHeader("\t\tFaculities");
                FacultyLogic.show();
                System.out.println("==============================================");
                System.out.println("Press Enter to return faculty menu . . . ");
                Terminal.pause();
                FacultyMenu.printFacultyMenu();
                break;
            case 2:
                Terminal.clear();
                MainMenu.printHeader("\tAdd Faculty");
                FacultyLogic.add();
                System.out.println("==============================================");
                System.out.println("Press Enter to return faculty menu . . . ");
                Terminal.pause();
                FacultyMenu.printFacultyMenu();
                break;
            case 3:
                Terminal.clear();
                MainMenu.printHeader("\tUpdate Faculty");
                FacultyLogic.update();
                System.out.println("==============================================");
                System.out.println("Press Enter to return faculty menu . . . ");
                Terminal.pause();
                FacultyMenu.printFacultyMenu();
                break;
            case 4:
                Terminal.clear();
                MainMenu.printHeader("\tDelete Faculty");
                FacultyLogic.delete();
                System.out.println("==============================================");
                System.out.println("Press Enter to return faculty menu . . . ");
                Terminal.pause();
                FacultyMenu.printFacultyMenu();
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performProfInput(int choice) {
        switch (choice) {
            case 1:
                Terminal.clear();
                MainMenu.printHeader("Proffessors");
                ProfLogic.show();
                System.out.println("==============================================");
                System.out.println("Press Enter to return prof menu . . . ");
                Terminal.pause();
                ProfMenu.printProfMenu();
                break;
            case 2:
                Terminal.clear();
                MainMenu.printHeader("Add Proffessor");
                ProfLogic.add();
                System.out.println("==============================================");
                System.out.println("Press Enter to return prof menu . . . ");
                Terminal.pause();
                ProfMenu.printProfMenu();
                break;
            case 3:
                Terminal.clear();
                MainMenu.printHeader("Update Proffessor");
                ProfLogic.update();
                System.out.println("==============================================");
                System.out.println("Press Enter to return prof menu . . . ");
                Terminal.pause();
                ProfMenu.printProfMenu();
                break;
            case 4:
                Terminal.clear();
                MainMenu.printHeader("Delete Proffessor");
                ProfLogic.delete();
                System.out.println("==============================================");
                System.out.println("Press Enter to return prof menu . . . ");
                Terminal.pause();
                ProfMenu.printProfMenu();
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performStudentInput(int choice) {
        switch (choice) {
            case 1:
                Terminal.clear();
                MainMenu.printHeader("\tStudents");
                StudentLogic.show();
                System.out.println("==============================================");
                System.out.println("Press Enter to return student menu . . . ");
                Terminal.pause();
                StudentMenu.printStudentMenu();
                break;
            case 2:
                Terminal.clear();
                MainMenu.printHeader("\tAdd Student");
                StudentLogic.add();
                System.out.println("==============================================");
                System.out.println("Press Enter to return student menu . . . ");
                Terminal.pause();
                StudentMenu.printStudentMenu();
                break;
            case 3:
                Terminal.clear();
                MainMenu.printHeader("\tUpdate Student");
                StudentLogic.update();
                System.out.println("==============================================");
                System.out.println("Press Enter to return student menu . . . ");
                Terminal.pause();
                StudentMenu.printStudentMenu();
                break;
            case 4:
                Terminal.clear();
                MainMenu.printHeader("\tDelete Student");
                StudentLogic.delete();
                System.out.println("==============================================");
                System.out.println("Press Enter to return student menu . . . ");
                Terminal.pause();
                StudentMenu.printStudentMenu();
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    

    public static void performSubjectInput(int choice) {
        switch (choice) {
            case 1:
                Terminal.clear();
                MainMenu.printHeader("\tSubjects");
                SubjectLogic.show();
                System.out.println("==============================================");
                System.out.println("Press Enter to return subject menu . . . ");
                Terminal.pause();
                SubjectMenu.printSubjectMenu();
                break;
            case 2:
                Terminal.clear();
                MainMenu.printHeader("\tAdd Subject");
                SubjectLogic.add();
                System.out.println("==============================================");
                System.out.println("Press Enter to return subject menu . . . ");
                Terminal.pause();
                SubjectMenu.printSubjectMenu();
                break;
            case 3:
                Terminal.clear();
                MainMenu.printHeader("\tUpdate Subjects");
                SubjectLogic.update();
                System.out.println("==============================================");
                System.out.println("Press Enter to return subject menu . . . ");
                Terminal.pause();
                SubjectMenu.printSubjectMenu();
                break;
            case 4:
                Terminal.clear();
                MainMenu.printHeader("\tDelete Subjects");
                SubjectLogic.delete();
                System.out.println("==============================================");
                System.out.println("Press Enter to return subject menu . . . ");
                Terminal.pause();
                SubjectMenu.printSubjectMenu();
                break;
            case 0:
                MainMenu.printMainMenu();
                break;
        }
    }    
}
