package service;

import ui.MainMenu;
import ui.StudentMenu;
import core.AppConfig;
import util.Terminal;
import models.Student;

public class StudentLogic {
    public static void show() {
        MainMenu.printHeader("Students");

        for (Student student : AppConfig.university.getStudents()) {
            StudentMenu.printStudentRecord(student);
        }

        System.out.println("=============================================================");
    }

    public static void add() {
        MainMenu.printHeader("Add Student");

        Student newStudent = StudentMenu.readStudentInfo();
        AppConfig.university.addStudent(newStudent);

        System.out.println("=============================================================");
    }

    public static Student find() {
        int studentID;

        while (true) {
            studentID = Terminal.readInt("Enter student id: ");
            
            for (Student student : AppConfig.university.getStudents()) {
                if (student.getId() == studentID) {
                    return student;
                }
            }
            
        }
    }

    public static void update() {
        MainMenu.printHeader("Update Student");

        Student student = find();

        if (student != null) {
            StudentMenu.printStudentCard(student);
            System.out.println();
            student = StudentMenu.readStudentInfo();
        }

        System.out.println("=============================================================");
    }

    public static void delete() {
        MainMenu.printHeader("Delete Student");

        Student student = find();

        if (student != null) {
            StudentMenu.printStudentCard(student);

            int accepted = Terminal.readInt("Are you sure delete this student? [1/0]: ");

            if (accepted == 1) {
                AppConfig.university.getStudents().remove(student);
            } else {
                System.out.println("Operation canceled!");
            }
        }

        System.out.println("=============================================================");
    }

}
