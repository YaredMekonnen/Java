/**
 * The BankDriver class serves as the main driver program for simulating banking operations.
 * @author YARED MEKONNEN
 */
public class BankDriver {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create users
        User user1 = new User("John Smith", "123 Main St", 30, 1);
        User user2 = new User("Jane Doe", "456 Elm St", 25, 2);

        // Add users to the bank
        bank.addUser(user1);
        bank.addUser(user2);

        // Create accounts
        Account account1 = new Account(101, user1.getUserId());
        Account account2 = new Account(102, user1.getUserId());
        Saving account3 = new Saving(201, user2.getUserId(), 0.05); // Creating a savings account
        Checking account4 = new Checking(202, user2.getUserId(), 1000.0); // Creating a checking account

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);

        // Deposit and withdraw from accounts
        account1.deposit(1000.0);
        account2.deposit(500.0);
        account3.deposit(750.0);
        account4.deposit(1000.0);

        account1.withdraw(200.0);
        account2.withdraw(100.0);
        account3.withdraw(50.0);
        account4.withdraw(1500.0); // This will trigger the overdraft limit on the checking account

        // Add interest to the savings account
        account3.addInterest();

        // Get transaction history
        System.out.println("Transaction History for Account 1:");
        for (Transaction transaction : account1.getTransactionHistory()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId()
                    + ", Amount: " + transaction.getAmount()
                    + ", Timestamp: " + transaction.getTimestamp());
        }

        System.out.println("\nTransaction History for Savings Account:");
        for (Transaction transaction : account3.getTransactionHistory()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId()
                    + ", Amount: " + transaction.getAmount()
                    + ", Timestamp: " + transaction.getTimestamp());
        }

        System.out.println("\nTransaction History for Checking Account:");
        for (Transaction transaction : account4.getTransactionHistory()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId()
                    + ", Amount: " + transaction.getAmount()
                    + ", Timestamp: " + transaction.getTimestamp());
        }
    }
}
