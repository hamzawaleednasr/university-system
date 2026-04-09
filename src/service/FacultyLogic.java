package service;

import core.AppConfig;
import models.Faculty;
import util.Terminal;
import ui.FacultyMenu;

public class FacultyLogic {
    public static void show() {
        for (Faculty faculty : AppConfig.university.getFaculties()) {
            FacultyMenu.printFacultyRecord(faculty);
        }        
    }

    public static void add() {
        Faculty newFaculty = FacultyMenu.readFacultyInfo();
        AppConfig.university.addFaculty(newFaculty);
    }

    public static Faculty find() {
        int facultyID;

        while (true) {
            facultyID = Terminal.readInt("Enter faculty ID: ");
            
            for (Faculty faculty : AppConfig.university.getFaculties()) {
                if (faculty.getId() == facultyID) {
                    return faculty;
                }
            }
            
        }
    }

    public static void update() {
        Faculty faculty = find();

        if (faculty != null) {
            FacultyMenu.printFacultyCard(faculty);
            System.out.println();
            for (int i = 0; i < AppConfig.university.getFaculties().size(); i++) {
                if (AppConfig.university.getFaculties().get(i).getId() == faculty.getId()) {
                    AppConfig.university.getFaculties().set(i, FacultyMenu.readFacultyInfo());
                }
            }
        }
    }

    public static void delete() {
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
    }
}
