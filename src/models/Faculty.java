package models;

import java.util.ArrayList;

public class Faculty {
    private int id;
    private String name;
    private ArrayList<Integer> students;
    private ArrayList<Subject> subjects;

    public Faculty() {}

    public Faculty(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<Integer>();
        this.subjects = new ArrayList<Subject>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getStudents() {
        return students;
    }
    public void addStudent(int studentID) {
        students.add(studentID);
    }
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public int getId() {
        return id;
    }
}
