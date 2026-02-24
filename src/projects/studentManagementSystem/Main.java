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

        Student s1 = new Student("S1", "Alice");
        s1.addGrade(3.5);
        s1.addGrade(4.0);

        System.out.println(s1.toString());
        System.out.println("Student GPA: " + s1.calculateGPA());

        Student s2 = new Student("S2", "Bob");
        s2.addGrade(3.0);
        s2.addGrade(3.5);
          System.out.println(s2.toString());
        System.out.println("Student GPA: " + s2.calculateGPA());

        course.enrollStudent(s1);
        course.enrollStudent(s2);

        course.printCourseRoster();
        System.out.println("Class Average GPA: " + course.calculateClassAverageGPA());
    }
}
