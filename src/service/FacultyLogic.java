package service;

import core.AppConfig;
import models.Faculty;
import util.Terminal;
import ui.MainMenu;
import ui.FacultyMenu;

public class FacultyLogic {
    public static void show() {
        MainMenu.printHeader("Faculities");

        for (Faculty faculty : AppConfig.university.getFaculties()) {
            FacultyMenu.printFacultyRecord(faculty);
        }

        System.out.println("=============================================================");
    }

    public static void add() {
        MainMenu.printHeader("Add Faculty");

        Faculty newFaculty = FacultyMenu.readFacultyInfo();
        AppConfig.university.addFaculty(newFaculty);

        System.out.println("=============================================================");
    }

    public static Faculty find() {
        int facultyID;

        while (true) {
            facultyID = Terminal.readInt("Enter faculty id: ");
            
            for (Faculty faculty : AppConfig.university.getFaculties()) {
                if (faculty.getId() == facultyID) {
                    return faculty;
                }
            }
            
        }
    }

    public static void update() {
        MainMenu.printHeader("Update Faculty");

        Faculty faculty = find();

        if (faculty != null) {
            FacultyMenu.printFacultyCard(faculty);
            System.out.println();
            faculty = FacultyMenu.readFacultyInfo();
        }

        System.out.println("=============================================================");
    }

    public static void delete() {
        MainMenu.printHeader("Delete Faculty");

        Faculty faculty = find();

        if (faculty != null) {
            FacultyMenu.printFacultyCard(faculty);

            int accepted = Terminal.readInt("Are you sure delete this faculty? [1/0]: ");

            if (accepted == 1) {
                AppConfig.university.getFaculties().remove(faculty);
            } else {
                System.out.println("Operation canceled!");
            }
        }

        System.out.println("=============================================================");
    }
}
