public class Subject {
    private String code;
    private String name;
    private Prof prof;
    
    public Subject() {}

    public Subject(String code, String name, Prof prof) {
        this.code = code;
        this.name = name;
        this.prof = prof;
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
    public Prof getProf() {
        return prof;
    }
    public void setProf(Prof prof) {
        this.prof = prof;
    }
}
