import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    // Member variables 
    private double checkingBalance;
    private double savingsBalance;
    private static int numberAccounts;
    private long accountNumber;

    // Constructor 
    public BankAccount () { 
        this.numberAccounts ++;
        this.accountNumber = createAccountNumber();
    }

    // Methods
    public static void getAccounts () {
        System.out.println ("There are: " + numberAccounts + " accounts.");
    }

    public void depositMoney (double amount, String typeAccount) {
        if (typeAccount == "check") {
            this.checkingBalance += amount;
        }
        if (typeAccount == "saving") {
            this.savingsBalance += amount;
        }
    }

    public void withdrawMoney (double amount) {
        if (this.checkingBalance > amount) {
            this.checkingBalance -= amount;
        }
        else if (this.savingsBalance > amount) {
            this.savingsBalance =- amount;
        }
        else {
            System.out.println ("Insufficient funds ...");
        }
    }

    public void display () {
        System.out.println ("Checking Balance: " + this.checkingBalance + " $");
        System.out.println ("Savings Balance: " + this.savingsBalance + " $");
    }

    public static long createAccountNumber() {
        int m = (int) Math.pow(10, 10 - 1);
        return m + new Random().nextInt(9 * m);
    }

    // Getters & Setters
    public double getCheckingBalance () {
        return this.checkingBalance;
    }

    public double getSavingsBalance () {
        return this.savingsBalance;
    }

    public long getAccountNumber () {
        return this.accountNumber;
    }
}