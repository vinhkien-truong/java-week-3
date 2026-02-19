package polymorphism.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create a superclass Payment with method pay(double amount).
 2. Create subclasses:
      - CreditCardPayment (prints "Paid <amount> using Credit Card").
      - PayPalPayment (prints "Paid <amount> using PayPal").
      - CashPayment (prints "Paid <amount> in cash").
 3. In main():
      - Create a List<Payment>.
      - Add different payment types.
      - Loop and call pay() → each behaves differently.
*/


public class Payment
{
     public void pay(double amount) {
          System.out.println("Paid " + amount);
     }
     
     public static void main(String[] args) {
          List<Payment> payments = new ArrayList<>();
          payments.add(new CreditCardPayment());
          payments.add(new PayPalPayment());
          payments.add(new CashPayment());
          payments.add(new Payment());
          for (Payment payment : payments) {
               payment.pay(100.0);
          }
     }
}

class CreditCardPayment extends Payment {
     @Override
     public void pay(double amount) {
          System.out.println("Paid " + amount + " using Credit Card");
     }
}

class PayPalPayment extends Payment {
     @Override
     public void pay(double amount) {
          System.out.println("Paid " + amount + " using PayPal");
     }
}

class CashPayment extends Payment {
     @Override
     public void pay(double amount) {
          System.out.println("Paid " + amount + " in cash");
     }
}
