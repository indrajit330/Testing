package Assignment;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank account class
class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount + ". Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Sorry, insufficient balance, you need more 500 Rs.: " + 500);
    }

    public double getBalance() {
        return balance;
    }
}

// Main class
public class P30 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 2000);

        try {
            account.withdraw(2500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}