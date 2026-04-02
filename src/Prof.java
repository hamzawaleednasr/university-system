import java.util.ArrayList;

public class Prof extends Person {
    private int id;
    private ArrayList<Subject> subjects;

    public Prof() {}
    
    public Prof(String name, short age, int id) {
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
