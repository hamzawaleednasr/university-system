package service;

import ui.StudentMenu;
import core.AppConfig;
import util.Terminal;
import models.Student;

public class StudentLogic {
    public static void show() {
        for (Student student : AppConfig.university.getStudents()) {
            StudentMenu.printStudentRecord(student);
        }
    }

    public static void add() {
        Student newStudent = StudentMenu.readStudentInfo();
        AppConfig.university.addStudent(newStudent);
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
        Student student = find();

        if (student != null) {
            StudentMenu.printStudentCard(student);
            System.out.println();
            student = StudentMenu.readStudentInfo();
        }
    }

    public static void delete() {
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
    }

}
