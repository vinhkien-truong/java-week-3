package encapsulation.exercises;

/**
 TODO:
 1. Create private fields: name (String), salary (double).
 2. Write a constructor to initialize both.
 3. Add getters for both fields.
 4. Add a setter for salary that does NOT allow negative values.
 5. Create a method giveRaise(double amount) that increases salary.
 */
public class Employee
{
    // your code here
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary in negative");
        }
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("raise in negative");
        }
    }
}
