package inheritance.exercises;

import java.util.List;

public class Main {
        public static void main(String[] args)
        {
            Dog dog = new Dog();
            Cat cat = new Cat();
    
            dog.makeSound(); 
            cat.makeSound(); 

            Employee emp = new Employee("Truong", 50000);
            Developer dev = new Developer("Vinh", 60000);
            Manager mgr = new Manager("Kien", 70000);    
            emp.work();
            dev.work();
            mgr.work();

            List<Person> people = List.of(
                new Student("Alice", 20, 3.5),
                new Teacher("Bob", 40, "Math"),
                new Student("Charlie", 22, 3.8),
                new Teacher("Diana", 35, "History")
            ); // immutable list of Person no need to import arrayList.

            for (Person person : people)
            {
                person.introduce();
            }

            Shape circle = new Circle(5);
            Shape rectangle = new Rectangle(4, 6);
            System.out.printf("Circle area: %.2f%n", circle.getArea());
            System.out.printf("Rectangle area: %.2f%n", rectangle.getArea());
        }
}
