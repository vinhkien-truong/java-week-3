package polymorphism.exercises;

/**
 TODO:
 1. Create a Calculator class.
 2. Add overloaded add() methods:
      - add(int a, int b)
      - add(double a, double b)
      - add(int a, int b, int c)
 3. Test them in main().
*/
public class Calculator
{
     public int add(int a, int b) {
          return a + b;
     }
     
     public double add(double a, double b) {
          return a + b;
     }
     
     public int add(int a, int b, int c) {
          return a + b + c;
     }
     
     public static void main(String[] args) {
          Calculator calculator = new Calculator();
          
          System.out.println(calculator.add(2, 3)); 
          System.out.println(calculator.add(2.5, 3.5)); 
          System.out.println(calculator.add(1, 2, 3)); 
     }
}
