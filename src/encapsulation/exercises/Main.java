package encapsulation.exercises;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        System.out.println(employee.getName()); 
        System.out.println(employee.getSalary()); 

        employee.setSalary(55000);
        System.out.println(employee.getSalary()); 

        employee.giveRaise(5000);
        System.out.println(employee.getSalary()); 

        Temperature temp = new Temperature();
        temp.setTemperatureInCelsius(25);
        System.out.println(temp.getTemperatureInCelsius()); 
        System.out.println(temp.getFahrenheit()); 
        System.out.println(temp.getKelvin()); 

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(rectangle.getArea()); 
        System.out.println(rectangle.getPerimeter()); 

        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item 1", 29.99);
        cart.addItem("Item 2", 49.99);
        System.out.println(cart.getTotalPrice());  
        cart.removeItem("Item 1", 29.99);
        System.out.println(cart.getTotalPrice());    
    }
}
