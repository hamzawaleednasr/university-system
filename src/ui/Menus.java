package ui;

import util.Terminal;

public class Menus {
    public static void printMainMenu() {
        Terminal.clear();
        System.out.println("=============================================");
        System.out.println("====    Welcome to University System!    ====");
        System.out.println("=============================================");
        System.out.println("\t[1] Faculty Menu");
        System.out.println("\t[2] Prof Menu");
        System.out.println("\t[3] Student Menu");
        System.out.println("\t[4] Subject Menu");
        System.out.println("=============================================");
        System.out.println("\t[0] Exit");
        System.out.println("=============================================");
    }

    public static void printFacultyMenu() {
        Terminal.clear();
        System.out.println("==============================================");
        System.out.println("====             Faculty Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Faculties");
        System.out.println("\t[2] Add Faculty");
        System.out.println("\t[3] Update Faculty");
        System.out.println("\t[4] Delete Faculty");
        System.out.println("\t[5] Register a Student");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printProfMenu() {
        Terminal.clear();
        System.out.println("==============================================");
        System.out.println("======             Prof Menu            ======");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Proffesors");
        System.out.println("\t[2] Add Proffesor");
        System.out.println("\t[3] Update Proffesor");
        System.out.println("\t[4] Delete Proffesor");
        System.out.println("\t[5] Register in a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printStudentMenu() {
        Terminal.clear();
        System.out.println("==============================================");
        System.out.println("====             Student Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Students");
        System.out.println("\t[2] Add Student");
        System.out.println("\t[3] Update Student");
        System.out.println("\t[4] Delete Student");
        System.out.println("\t[5] Register a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printSubjectMenu() {
        Terminal.clear();
        System.out.println("==============================================");
        System.out.println("====             Subject Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Subjects");
        System.out.println("\t[2] Add Subject");
        System.out.println("\t[3] Update Subject");
        System.out.println("\t[4] Delete Subject");
        System.out.println("\t[5] Register a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void performUserInput(int choice) {
        switch (choice) {
            case 1:
                printFacultyMenu();
                break;
            case 2:
                printProfMenu();
                break;
            case 3:
                printStudentMenu();
                break;
            case 4:
                printSubjectMenu();
                break;
            default:
                break;
        }
    }
}
