package projects.studentManagementSystem;
public class Teacher {
    private final String name;



    public Teacher(String id, String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Teacher : " + name + "";
    }
}
