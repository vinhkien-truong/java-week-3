package projects.employmentSystem;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{name='" + getName() + "', salary=" + getSalary() + "}";
    }
    
}
