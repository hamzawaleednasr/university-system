package models;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Faculty> faculties;
    private ArrayList<Student> students;
    private ArrayList<Prof> profs;

    public University() {}

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<Faculty>();
        this.students = new ArrayList<Student>();
        this.profs = new ArrayList<Prof>();
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
    public ArrayList<Prof> getProfs() {
        return profs;
    }
    public void addProf(Prof prof) {
        profs.add(prof);
    }
}