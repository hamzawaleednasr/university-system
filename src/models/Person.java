package models;

public class Person {
    private String name;
    private int age;
    private static int studentsNumber = 0;

    public Person() { studentsNumber++; }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
