package ui;

import util.Terminal;
import controllers.Controller;
import models.Subject;

public class SubjectMenu {
    public static void printSubjectMenu() {
        Terminal.clear();
        MainMenu.printHeader("\t\tSubject Menu");
        System.out.println("\t[1] Show Subjects");
        System.out.println("\t[2] Add Subject");
        System.out.println("\t[3] Update Subject");
        System.out.println("\t[4] Delete Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
        Controller.performSubjectInput(Terminal.readIntInRange(0, 4));
    }

    public static void printSubjectRecord(Subject subject) {
        System.out.println("Subject Code: " + subject.getCode() + "\tName: " + subject.getName());
    }

    public static Subject readSubjectInfo() {
        Subject subject = new Subject(
            Terminal.readString("Enter Subject code: "),
            Terminal.readString("Enter Subject name: ")
        );

        return subject;
    }

    public static void printSubjectCard(Subject subject) {
        System.out.println("\n===S=U=B=J=E=C=T==I=N=F=O===");
        System.out.println("| Code: " + subject.getCode());
        System.out.println("| Name: " + subject.getName());
        System.out.println("============================");
    }
}
