package models;

public class Person {
    private String name;
    private short age;
    private static int studentsNumber = 0;

    public Person() { studentsNumber++; }

    public Person(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
