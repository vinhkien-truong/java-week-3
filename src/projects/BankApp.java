package projects;

import java.util.HashMap;
import java.util.Map;

/*
    * Classes: `BankAccount`, `CheckingAccount`, `SavingsAccount`.
    * Use **inheritance** for account types.
    * **Encapsulation** for balance (private + getters/setters).
    * Store accounts in a `Map<String, BankAccount>`.
*/
public class BankApp {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();

        BankAccount acc1 = new CheckingAccount("123", 1000);
        BankAccount acc2 = new SavingsAccount("456", 2000);

        accounts.put(acc1.getAccountNumber(), acc1);
        accounts.put(acc2.getAccountNumber(), acc2);

        System.out.println(accounts.get("123"));
        System.out.println(accounts.get("456"));
    }
}

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
         else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
         }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
         else {
            throw new IllegalArgumentException("Withdrawal amount must be positive and less than or equal to balance.");
         }
    }

    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public String toString() {
        return "CheckingAccount{accountNumber='" + getAccountNumber() + "', balance=" + getBalance() + "}";
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public String toString() {
        return "SavingsAccount{accountNumber='" + getAccountNumber() + "', balance=" + getBalance() + "}";
    }   
}