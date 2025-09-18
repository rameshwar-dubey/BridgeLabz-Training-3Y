package Object_Oriented_Design_Principle.Object_Modelling;

import java.util.ArrayList;
import java.util.List;

class Account {
    private static int nextAccNo = 1001;
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(Bank bank, double initialDeposit) {
        this.accountNumber = nextAccNo++;
        this.balance = initialDeposit;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\n Balances for customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() +
                    " | Bank: " + acc.getBank().getBankName() +
                    " | Balance: " + acc.getBalance());
        }
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(this, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() +
                " at " + bankName +
                " | Account No: " + newAccount.getAccountNumber());
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank of India");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Ramesh");
        Customer c2 = new Customer("Suresh");

        bank1.openAccount(c1, 5000);
        bank1.openAccount(c1, 2000);
        bank2.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

