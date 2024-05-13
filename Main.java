import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance ");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankCustomer {
    private String customerName;
    private BankAccount savingsAccount;
    private BankAccount checkingAccount;

    public BankCustomer(String customerName) {
        this.customerName = customerName;
        this.savingsAccount = new SavingsAccount();
        this.checkingAccount = new CheckingAccount();
    }

    public void depositToSavings(double amount) {
        savingsAccount.deposit(amount);
    }

    public void withdrawFromSavings(double amount) {
        savingsAccount.withdraw(amount);
    }

    public void depositToChecking(double amount) {
        checkingAccount.deposit(amount);
    }

    public void withdrawFromChecking(double amount) {
        checkingAccount.withdraw(amount);
    }

    public double getSavingsBalance() {
        return savingsAccount.getBalance();
    }

    public double getCheckingBalance() {
        return checkingAccount.getBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name :");
        String customerName = scanner.nextLine();
        BankCustomer customer = new BankCustomer(customerName);

        System.out.println("Enter amount to deposit into savings account:");
        double depositSavings = scanner.nextDouble();
        customer.depositToSavings(depositSavings);
        System.out.println("Enter amount to withdraw from savings account:");
        double withdrawSavings = scanner.nextDouble();
        customer.withdrawFromSavings(withdrawSavings);

        System.out.println("Enter amount to deposit into checking account:");
        double depositChecking = scanner.nextDouble();
        customer.depositToChecking(depositChecking);
        System.out.println("Enter amount to withdraw from checking account:");
        double withdrawChecking = scanner.nextDouble();
        customer.withdrawFromChecking(withdrawChecking);

        System.out.println("Savings Account Balance: " + customer.getSavingsBalance());
        System.out.println("Checking Account Balance: " + customer.getCheckingBalance());

        scanner.close();
    }
}
