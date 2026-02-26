package projects.employmentSystem;

import java.util.ArrayList;
import java.util.List;

/*
Abstract class: Employee (fields: name, salary).
Subclasses: Developer, Manager.
Store employees in a List<Employee>.
Features: print payroll, give raises, list managers separately.
*/
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();   

        Developer dev1 = new Developer("Kien", 70000);
        Developer dev2 = new Developer("Truong", 75000);
        Manager mgr1 = new Manager("Vinh", 90000);
        employees.add(dev1);
        employees.add(dev2);
        employees.add(mgr1);

        System.out.println("Payroll:");
        for (Employee emp : employees) {    
            System.out.println(emp);
        }

        dev1.giveRaise(10); 
        mgr1.giveRaise(5); 
        System.out.println("\nAfter raise:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


        System.out.println("\nManagers:");
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                System.out.println(emp);
            }
        }


    }
    
}
