package models;

public class Student extends Person {   
    private int id; 

    public Student() {}
    
    public Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
