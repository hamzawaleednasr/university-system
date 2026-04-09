package ui;

import util.Terminal;
import controllers.Controller;
import models.Student;

public class StudentMenu {
    public static void printStudentMenu() {
        Terminal.clear();
        MainMenu.printHeader("\tStudent Menu");
        System.out.println("\t[1] Show Students");
        System.out.println("\t[2] Add Student");
        System.out.println("\t[3] Update Student");
        System.out.println("\t[4] Delete Student");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performStudentInput(Terminal.readIntInRange(0, 4));
    }

    public static void printStudentRecord(Student student) {
        System.out.println("Student ID: " + student.getId() + "\tName: " + student.getName() + "\tAge: " + student.getAge());
    }

    public static Student readStudentInfo() {
        Student student = new Student(
            Terminal.readInt("Enter Student ID: "),
            Terminal.readString("Enter Student name: "),
            Terminal.readInt("Enter Student age: ")
        );

        return student;
    }

    public static void printStudentCard(Student student) {
        System.out.println("===S=T=U=D=E=N=T==I=N=F=O===");
        System.out.println("| ID: " + student.getId() + "\t|");
        System.out.println("| Name: " + student.getName() + "\t|");
        System.out.println("| Age: " + student.getAge() + "\t|");
        System.out.println("============================");
    }
}
