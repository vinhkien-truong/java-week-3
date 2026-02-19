package interfaces.exercises;

/**
 * TODO:
 * Exercise 2:
 * Define an interface Payment with a method pay(double amount).
 * Implement classes: PaypalPayment, BankTransferPayment.
 * Each class should print a custom payment message.
 * Write a Demo that processes both payments.
 */

public class Exercise2
{
        public static void main(String[] args)
        {
            Payment paypal = new PaypalPayment();
            Payment bankTransfer = new BankTransferPayment();
            
            paypal.pay(100.00);
            bankTransfer.pay(250.50);
        }

}

interface Payment
{
     void pay(double amount);
}

class PaypalPayment implements Payment
{
     @Override
     public void pay(double amount)
     {
          System.out.printf("Processing PayPal payment of %.2f€%n", amount);
     }
}

class BankTransferPayment implements Payment
{
     @Override
     public void pay(double amount)
     {
          System.out.printf("Processing Bank Transfer payment of %.2f€%n", amount);
     }
}