public class Student extends Person {   
    private int id; 

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
}
