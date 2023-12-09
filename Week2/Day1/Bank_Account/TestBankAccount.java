public class TestBankAccount {
    public static void main (String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Get the number of accounts existed.
        BankAccount.getAccounts();

        // Deposit money in Check Balance.
        account1.depositMoney(1000, "check");
        // Deposit money in Savings Balance.
        account1.depositMoney(500, "saving");
        // Withdraw money from one Balance.
        account1.withdrawMoney(2000);
        // Display Balances Status.
        account1.display();

        // Ninja Bonus
        System.out.println(account1.getAccountNumber());
    }
}