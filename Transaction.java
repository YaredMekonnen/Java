/**
 * @author YARED MEKONNEN
 * The Transaction class represents a financial transaction with a unique transaction ID,
 * associated account ID, transaction amount, and timestamp.
 */
public class Transaction {
    private int transactionId;       // Unique identifier for the transaction.
    private int accountId;           // ID of the account associated with the transaction.
    private double amount;           // The amount of money involved in the transaction.
    private java.util.Date timestamp; // The timestamp representing when the transaction occurred.

    /**
     * Creates a new transaction with the specified transaction ID, account ID, and amount.
     * The timestamp is automatically set to the current date and time.
     *
     * @param transactionId The unique transaction ID.
     * @param accountId The ID of the account associated with the transaction.
     * @param amount The amount of money involved in the transaction.
     */
    public Transaction(int transactionId, int accountId, double amount) {
        this.transactionId = transactionId; // Initialize the transaction ID.
        this.accountId = accountId;         // Initialize the account ID.
        this.amount = amount;               // Initialize the transaction amount.
        this.timestamp = new java.util.Date(); // Initialize the timestamp to the current date and time.
    }

    /**
     * Get the transaction ID.
     *
     * @return The unique transaction ID.
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Get the account ID associated with the transaction.
     *
     * @return The ID of the account associated with the transaction.
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Get the amount of money involved in the transaction.
     *
     * @return The amount of money associated with the transaction.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Get the timestamp when the transaction occurred.
     *
     * @return The timestamp representing the date and time of the transaction.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
}
