package constructors.exercises;

/**
 TODO:
 1. Create class BankAccount with:
      - private fields accountNumber, balance
      - private static field accountCount
 2. Add constructors:
      - Default constructor → sets accountNumber="0000", balance=0
      - Parameterized constructor → sets accountNumber and balance
 3. Increment accountCount whenever a new account is created.
 4. Add methods deposit(), withdraw(), getBalance().
 5. Add static method getTotalAccounts().
 6. Test creating multiple accounts and check total accounts.
*/

public class BankAccount
{
     private String accountNumber;
     private double balance;
     private static int accountCount = 0;

     public BankAccount() {
          this.accountNumber = "0000";
          this.balance = 0.0;
          accountCount++;
     }

     public BankAccount(String accountNumber, double balance) {
          this.accountNumber = accountNumber;
          this.balance = balance;
          accountCount++;
     }

     public void deposit(double amount) {
          if (amount > 0) {
               balance += amount;
          }
     }

     public void withdraw(double amount) {
          if (amount > 0 && amount <= balance) {
               balance -= amount;
          }
     }

     public double getBalance() {
          return balance;
     }

     public static int getTotalAccounts() {
          return accountCount;
     }
}
