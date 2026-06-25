// Base Class (Demonstrating Encapsulation)
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    protected int balance; // protected taaki child classes isko use kar sakein, lekin bahar se secured rahe

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = (balance >= 0) ? balance : 0; // Validation
    }

    // Encapsulated Methods (Getters & Setters / Business Logic)
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs. " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Rs. " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

// Child Class 1 (Demonstrating Inheritance)
class SavingsAccount extends BankAccount {
    private int interestRate;

    // Constructor calling Parent Constructor using super
    public SavingsAccount(int accountNumber, String accountHolderName, int balance, int interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Specialized Method for Savings
    public void addInterest() {
        int interestAmount = (balance * interestRate) / 100;
        balance += interestAmount;
        System.out.println("Interest of Rs. " + interestAmount + " added to Savings Account.");
    }
}

// Child Class 2 (Demonstrating Inheritance & Method Overriding)
class CurrentAccount extends BankAccount {
    private int overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, int balance, int overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method to include Overdraft facility
    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance + overdraftLimit >= amount) {
            balance -= amount; // Balance can go negative up to overdraftLimit
            System.out.println("Rs. " + amount + " withdrawn successfully (Overdraft used if balance < 0).");
        } else {
            System.out.println("Transaction declined! Exceeds overdraft limit.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Standard Bank Account ===");
        BankAccount acc = new BankAccount(122, "Hamza", 1550);
        acc.deposit(300);
        acc.withdraw(500);
        acc.displayAccountInfo();

        System.out.println("\n=== Testing Savings Account ===");
        // Correct way to initialize: passing parent parameters + child parameters
        SavingsAccount sa = new SavingsAccount(123, "Ali", 5000, 5);
        sa.addInterest();
        sa.displayAccountInfo();

        System.out.println("\n=== Testing Current Account (With Overdraft) ===");
        CurrentAccount ccc = new CurrentAccount(222, "Zain", 1000, 500);
        // Trying to withdraw more than balance but within overdraft limit (1000 + 500 = 1500 max allowed)
        ccc.withdraw(1300);
        ccc.displayAccountInfo();
    }
}