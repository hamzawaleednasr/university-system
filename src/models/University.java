package models;

import java.util.ArrayList;
import ui.Menus;

public class University {
    private String name;
    private ArrayList<Faculty> faculties;
    private ArrayList<Student> students;

    public University() {}

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<Faculty>();
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public static void main(String[] args) {
        Menus.printMainMenu();
        Menus.printMainMenu();
    }
}