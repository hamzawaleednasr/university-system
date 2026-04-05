package models;

import java.util.ArrayList;

public class Faculty {
    private int id;
    private String name;
    private ArrayList<Student> students;

    public Faculty() {}

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
