/**
 * @author YARED MEKONNEN
 * The Checking class represents a checking account, extending the Account class,
 * with a specified overdraft limit.
 */
public class Checking extends Account {
    private double overdraftLimit; // The overdraft limit for this checking account.

    /**
     * Creates a new checking account with the specified account number, owner ID, and overdraft limit.
     *
     * @param accountNumber The unique account number.
     * @param ownerId The ID of the user who owns the account.
     * @param overdraftLimit The overdraft limit for the checking account.
     */
    public Checking(int accountNumber, int ownerId, double overdraftLimit) {
        super(accountNumber, ownerId); // Call the constructor of the parent class (Account).
        this.overdraftLimit = overdraftLimit; // Initialize the overdraft limit for this checking account.
    }

    /**
     * Overrides the withdraw method to allow overdraft within the specified limit.
     *
     * @param amount The amount to withdraw from the account.
     */
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount); // Withdraw from the account, including overdraft.
        } else {
            System.out.println("Exceeded overdraft limit"); // Display an error message if the overdraft limit is exceeded.
        }
    }

    /**
     * Provides a custom string representation of the checking account.
     *
     * @return A string containing the account type, account number, balance, and overdraft limit.
     */
    @Override
    public String toString() {
        return "Checking Account " + getAccountNumber() + ": Balance = $" + getBalance() + ", Overdraft Limit = $" + overdraftLimit;
    }
}
