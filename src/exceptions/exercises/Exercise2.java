package exceptions.exercises;

/**
 *  Exercise 2:
 *  Create an array of 5 elements.
 *  Try to access index 10.
 *  Catch ArrayIndexOutOfBoundsException and print a message.
 */

public class Exercise2
{
        public static void main(String[] args)
        {
            int[] arr = new int[5];
    
            try {
                int value = arr[10];
                System.out.println("Value at index 10: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bound");
            }
        }
}
