package inheritance.exercises;

/**
 TODO:
 1. Create a superclass Person with fields name and age.
 2. Create subclasses Student and Teacher.
      - Student has field grade (double).
      - Teacher has field subject (String).
 3. Create a method introduce() in Person that prints a generic introduction.
      - Override introduce() in Student and Teacher with specialized messages.
 4. In main():
      - Create a List<Person>.
      - Add multiple Students and Teachers.
      - Loop through the list and call introduce() on each object.
        (Demonstrates polymorphism + inheritance).
*/

public class Person
{
     protected String name;
     private int age;
     
     public Person(String name, int age)
     {
          this.name = name;
          this.age = age;
     }
     
     public void introduce()
     {
          System.out.printf("Hi, I'm %s and I'm %d years old.%n", name, age);
     }
}

class Student extends Person
{
     private double grade;
     
     public Student(String name, int age, double grade)
     {
          super(name, age);
          this.grade = grade;
     }
     
     @Override
     public void introduce()
     {
          System.out.printf("Hi, I'm %s, a student with grade %.2f%n", super.name, grade);
     }
}

class Teacher extends Person
{
     private String subject;
     
     public Teacher(String name, int age, String subject)
     {
          super(name, age);
          this.subject = subject;
     }
     
     @Override
     public void introduce()
     {
          System.out.printf("Hi, I'm %s, a teacher of %s%n", super.name, subject);
     }
}
