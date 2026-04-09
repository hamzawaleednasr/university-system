package ui;

import models.Faculty;
import util.Terminal;
import controllers.Controller;

public class FacultyMenu {
    public static void printFacultyMenu() {
        Terminal.clear();
        MainMenu.printHeader("\tFaculty Menu");
        System.out.println("\t[1] Show Faculties");
        System.out.println("\t[2] Add Faculty");
        System.out.println("\t[3] Update Faculty");
        System.out.println("\t[4] Delete Faculty");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performFacultyInput(Terminal.readIntInRange(0, 4));
    }

    public static void printFacultyRecord(Faculty faculty) {
        System.out.println("Faculty ID: " + faculty.getId() + "\tName: " + faculty.getName());
    }

    public static Faculty readFacultyInfo() {
        Faculty faculty = new Faculty(
            Terminal.readInt("Enter Faculty ID: "),
            Terminal.readString("Enter Faculty name: ")
        );

        return faculty;
    }

    public static void printFacultyCard(Faculty faculty) {
        System.out.println("===F=A=C=U=L=T=Y==I=N=F=O===");
        System.out.println("| ID: " + faculty.getId() + "\t|");
        System.out.println("| Name: " + faculty.getName() + "\t|");
        System.out.println("============================");
    }
}
