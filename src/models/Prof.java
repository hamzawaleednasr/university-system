package models;

public class Prof extends Person {
    private int id;

    public Prof() {}
    
    public Prof(int id, String name, int age) {
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
