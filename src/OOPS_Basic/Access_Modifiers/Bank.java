package OOPS_Basic.Access_Modifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : " + getBalance());
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("ACC123", "Ramesh Dubey", 5000);
        ba1.displayAccountDetails();
        System.out.println();

        ba1.setBalance(7000);
        System.out.println("Updated Balance: " + ba1.getBalance());
        System.out.println();

        SavingsAccount sa1 = new SavingsAccount("SAV456", "Sita Sharma", 10000, 4.5);
        sa1.displaySavingsDetails();
    }
}

