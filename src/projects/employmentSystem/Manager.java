package projects.employmentSystem;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', salary=" + getSalary() + "}";
    }
}
