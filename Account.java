import java.util.ArrayList;
import java.util.List;
/**
 * @author YARED MEKONNEN
 * The Account class represents a bank account with a unique account number, balance, owner ID,
 * and a list of associated transactions.
 */
public class Account implements BankOperations{
    private int accountNumber;          // Unique account number.
    private double balance;             // Current balance in the account.
    private int ownerId;                // ID of the user who owns the account.
    private List<Transaction> transactions; // List of transactions associated with this account.

    /**
     * Creates a new account with the specified account number and owner ID.
     *
     * @param accountNumber The unique account number.
     * @param ownerId The ID of the user who owns the account.
     */
    public Account (int accountNumber, int ownerId) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.ownerId = ownerId;
        this.transactions = new ArrayList<>();
    }

    // Getters and setters for account properties

    /**
     * Get the account number.
     *
     * @return The unique account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the account number.
     *
     * @param accountNumber The new account number.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Get the current balance of the account.
     *
     * @return The current balance in the account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the balance of the account.
     *
     * @param balance The new balance of the account.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get the ID of the account owner (user).
     *
     * @return The ID of the user who owns the account.
     */
    public int getOwnerId() {
        return ownerId;
    }

    /**
     * Set the ID of the account owner (user).
     *
     * @param ownerId The new ID of the user who owns the account.
     */
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Get the transaction history associated with this account.
     *
     * @return The list of transactions associated with this account.
     */
    public List<Transaction> getTransactionHistory() {
        return transactions;
    }

    /**
     * Set the transaction history for this account.
     *
     * @param transactions The list of transactions to associate with this account.
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * Deposit a specified amount into the account and record it as a transaction.
     *
     * @param amount The amount to deposit into the account.
     */
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(transactions.size() + 1, accountNumber, amount));
    }

    /**
     * Withdraw a specified amount from the account and record it as a transaction.
     *
     * @param amount The amount to withdraw from the account.
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(transactions.size() + 1, accountNumber, -amount));
        } else {
            System.out.println("Insufficient balance"); // Display an error message if there's not enough balance.
        }
    }
}
