/**
 * @author YARED MEKONNEN
 * The Saving class represents a savings account, extending the Account class,
 * with a specified interest rate.
 */
public class Saving extends Account {
    private double interestRate; // The interest rate for this savings account.

    /**
     * Creates a new savings account with the specified account number, owner ID, and interest rate.
     *
     * @param accountNumber The unique account number.
     * @param ownerId The ID of the user who owns the account.
     * @param interestRate The interest rate for the savings account.
     */
    public Saving(int accountNumber, int ownerId, double interestRate) {
        super(accountNumber, ownerId); // Call the constructor of the parent class (Account).
        this.interestRate = interestRate; // Initialize the interest rate for this savings account.
    }

    /**
     * Adds interest to the savings account's balance based on the interest rate.
     */
    public void addInterest() {
        double interest = getBalance() * interestRate; // Calculate the interest to be added.
        deposit(interest); // Deposit the interest into the account.
    }

    /**
     * Provides a custom string representation of the savings account.
     *
     * @return A string containing the account type, account number, balance, and interest rate.
     */
    @Override
    public String toString() {
        return "Savings Account " + getAccountNumber() + ": Balance = $" + getBalance() + ", Interest Rate = " + interestRate;
    }
}
