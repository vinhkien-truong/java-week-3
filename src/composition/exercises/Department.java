package composition.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create class Employee with fields: name, role.
 2. Create class Department that HAS-A List<Employee>.
 3. Create class Company that HAS-A List<Department>.
 4. Add methods to:
      - Add employee to a department
      - List employees by department
 5. Test with multiple departments and employees.
*/

public class Department
{
     private List<Employee> employees;

     public Department() {
          this.employees = new ArrayList<Employee>();
     }

     public List<Employee> getEmployees() {
          return employees;
     }

     public void addEmployee(Employee employee) {
          this.employees.add(employee);
     }
}

class Employee {
     private String name;
     private String role;
     
     public Employee(String name, String role) {
          this.name = name;
          this.role = role;
     }
     public String getName() {
          return name;
     }
     public String getRole() {
          return role;
     }
}

class Company 
{
     private List<Department> departments;

     public Company() {
          this.departments = new ArrayList<Department>();
     }

     public List<Department> getDepartments() {
          return departments;
     }

     public void addDepartment(Department department) {
          this.departments.add(department);
     }
}