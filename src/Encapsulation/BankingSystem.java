package Encapsulation;
import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.printf("Balance       : $%.2f%n", balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.printf("Loan of $%.2f approved for %s%n", amount, getHolderName());
        } else {
            System.out.println("Loan not approved. Amount exceeds eligibility.");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.printf("Loan of $%.2f approved for %s%n", amount, getHolderName());
        } else {
            System.out.println("Loan not approved. Amount exceeds eligibility.");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("SA101", "Ramesh", 5000, 5);
        CurrentAccount ca = new CurrentAccount("CA202", "Anita", 2000, 1000);

        accounts.add(sa);
        accounts.add(ca);

        System.out.println("=== Bank Account Details ===\n");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.printf("Interest: $%.2f%n", acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.getClass(); // just to reference interface
                System.out.printf("Loan Eligibility: $%.2f%n", loanAcc.calculateLoanEligibility());
                loanAcc.applyForLoan(3000);
            }
            System.out.println("----------------------------\n");
        }

        // Demonstrate deposit and withdrawal
        sa.deposit(500);
        ca.withdraw(1000);
    }
}

