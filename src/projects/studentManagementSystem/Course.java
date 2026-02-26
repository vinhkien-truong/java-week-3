package projects.studentManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(Teacher teacher) {
        this.teacher = teacher;
    }   
    public void enrollStudent(Student student) {
        students.add(student);
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void printCourseRoster() {
        System.out.println("Course taught by: " + teacher.getName());
        System.out.println("Enrolled students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

}
