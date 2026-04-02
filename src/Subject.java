public class Subject {
    private String code;
    private String name;
    private int profID;
    private int studentID;
    
    public Subject() {}

    public Subject(String code, String name, int profID, int studentID) {
        this.code = code;
        this.name = name;
        this.profID = profID;
        this.studentID = studentID;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getProf() {
        return profID;
    }
    public void setProf(int profID) {
        this.profID = profID;
    }

    public int getProfID() {
        return profID;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
