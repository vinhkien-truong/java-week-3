package constructors.exercises;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("1234", 1000);
        BankAccount account3 = new BankAccount("5678", 500);
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        account1.deposit(200);
        account2.withdraw(300);
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Account 3 balance: " + account3.getBalance());

        Car car1 = new Car();
        Car car2 = new Car("Toyota", 2020);
        car1.printCarInfo();
        car2.printCarInfo();    

        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(4);
        System.out.println("Rectangle 1 area: " + rect1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rect1.getPerimeter());
        System.out.println("Rectangle 2 area: " + rect2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rect2.getPerimeter());

        Student student1 = new Student("Kien");
        Student student2 = new Student("Vinh");
        student1.getStudentInfo();
        student2.getStudentInfo();
        System.out.println("Total students: " + Student.getTotalStudents());
    }
}
