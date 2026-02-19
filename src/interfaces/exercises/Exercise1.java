package interfaces.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO:
 * Exercise 1:
 * Create a Student class with name and grade.
 * Implement Comparable<Student> so that students are sorted by grade.
 * In main(), add some students to a List and sort them using Collections.sort().
 * Print the sorted list.
 * Note : Comparable<T> interface (built-in in Java).
 */

public class Exercise1
{
        public static void main(String[] args)
        {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Vinh", 3.5));
            students.add(new Student("Truong", 3.8));
            students.add(new Student("Kien", 3.2));
    
            Collections.sort(students);
            for (Student student : students)
            {
                System.out.println(student);
            }
        }
}

class Student implements Comparable<Student>
{
     private String name;
     private double grade;
     
     public Student(String name, double grade)
     {
          this.name = name;
          this.grade = grade;
     }
     
     @Override
     public int compareTo(Student other)
     {
          return  Double.compare(this.grade, other.grade); // https://www.geeksforgeeks.org/java/double-compare-method-in-java-with-examples/
     }
     
     @Override
     public String toString()
     {
          return  this.name + " grade : " + this.grade;
     }
}