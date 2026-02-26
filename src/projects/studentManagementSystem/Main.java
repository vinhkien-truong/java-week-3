package projects.studentManagementSystem;
/*
    * Classes: `Student`, `Course`, `Teacher`.
    * A `Course` **HAS-A List<Student>`.
    * Store students in a `List<Student>`.
    * Features: enroll students, calculate GPA, print course rosters.
*/
public class Main {
    
    public static void main(String[] args) {
        Teacher teacher = new Teacher("T1", "Mr. Smith");
        Course course = new Course(teacher);

        Student s1 = new Student("S1", "Kien");

        System.out.println(s1);
    

        Student s2 = new Student("S2", "Truong");

        System.out.println(s2);
        System.out.println(teacher);
    
        course.enrollStudent(s1);
        course.enrollStudent(s2);

        course.printCourseRoster();
    }
}
