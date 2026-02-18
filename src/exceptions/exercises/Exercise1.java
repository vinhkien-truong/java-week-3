package exceptions.exercises;

/**
 * Exercise 1:
 * Write a program that divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message.
 */

public class Exercise1
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 0; 

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}




