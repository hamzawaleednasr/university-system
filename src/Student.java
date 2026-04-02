import java.util.ArrayList;

import javax.security.auth.Subject;

public class Student extends Person {   
    private int id; 
    private ArrayList<Subject> subjects;

    public Student() {}
    
    public Student(String name, short age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
