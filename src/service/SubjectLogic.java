package service;

import core.AppConfig;
import models.Faculty;
import models.Subject;
import ui.MainMenu;
import ui.SubjectMenu;
import util.Terminal;

public class SubjectLogic {
    public static void show() {
        MainMenu.printHeader("Subjects");

        for (Faculty faculty : AppConfig.university.getFaculties()) {
            for (Subject subject : faculty.getSubjects()) {
                SubjectMenu.printSubjectRecord(subject);
            }
        }

        System.out.println("=============================================================");
    }

    public static void add() {
        MainMenu.printHeader("Add Subject");

        Faculty faculty = FacultyLogic.find();

        Subject newSubject = SubjectMenu.readSubjectInfo();
        faculty.getSubjects().add(newSubject);

        System.out.println("=============================================================");
    }

    public static Subject find() {
        String subjectCode;

        while (true) {
            subjectCode = Terminal.readString("Enter subject code: ");
            
            for (Faculty faculty : AppConfig.university.getFaculties()) {
                for (Subject subject : faculty.getSubjects()) {
                    if (subject.getCode() == subjectCode) {
                        return subject;
                    }
                }
            }
            
        }
    }

    public static void update() {
        MainMenu.printHeader("Update Subject");

        Subject subject = find();

        if (subject != null) {
            SubjectMenu.printSubjectCard(subject);
            System.out.println();
            subject = SubjectMenu.readSubjectInfo();
        }

        System.out.println("=============================================================");
    }

    public static void delete() {
        MainMenu.printHeader("Delete Subject");

        Subject subject = find();

        if (subject != null) {
            SubjectMenu.printSubjectCard(subject);

            int accepted = Terminal.readInt("Are you sure delete this subject? [1/0]: ");

            if (accepted == 1) {
                for (Faculty faculty : AppConfig.university.getFaculties()) {
                    for (Subject subj : faculty.getSubjects()) {
                        if (subj.getCode() == subject.getCode()) {
                            faculty.getSubjects().remove(subj);
                        }
                    }
                }
            } else {
                System.out.println("Operation canceled!");
            }
        }

        System.out.println("=============================================================");
    }
}
