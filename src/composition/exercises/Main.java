package composition.exercises;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processData();

        Department department1 = new Department();
        Department department2 = new Department();
        Employee employee1 = new Employee("Kien", "Developer");
        Employee employee2 = new Employee("Truong", "Tester");
        Employee employee3 = new Employee("Vinh", "Manager");
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        Company company = new Company();
        company.addDepartment(department1);
        company.addDepartment(department2); 
        System.out.println("Department 1 Employees:");
        for (Employee emp : department1.getEmployees()) {
            System.out.println(emp.getName() + " - " + emp.getRole());
        }
        System.out.println("Department 2 Employees:");
        for (Employee emp : department2.getEmployees()) {
            System.out.println(emp.getName() + " - " + emp.getRole());
        }

        House house = new House(5, 4);
        house.printRoomArea();

        Library library = new Library();
        library.addBook(new Book("title 1", "Kien"));
        library.addBook(new Book("title 2", "Vinh"));
        System.out.println("Books in the library:");
        for (Book book : library.listBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
