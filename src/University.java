import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Faculty> faculties;

    public University() {}

    public University(String name) {
        this.name = name;
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

    public static void main(String[] args) {
        UI.printMainMenu();
        UI.printMainMenu();
    }
}