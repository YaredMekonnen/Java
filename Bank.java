import java.util.ArrayList;
import java.util.List;
/**
 * @author YARED MEKONNEN
 * The Bank class represents a banking system that manages accounts and users.
 */
public class Bank {
    private List<Account> accounts; // List of accounts held by the bank.
    private List<User> users;       // List of users registered with the bank.

    /**
     * Constructs a new Bank with empty lists of accounts and users.
     */
    public Bank() {
        accounts = new ArrayList<>();
        users = new ArrayList<>();
    }

    /**
     * Adds a new user to the bank.
     *
     * @param user The user to add to the bank.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Retrieves a user by their unique user ID.
     *
     * @param userId The unique ID of the user to retrieve.
     * @return The user with the specified ID, or null if not found.
     */
    public User getUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null; // User not found
    }

    /**
     * Adds a new account to the bank.
     *
     * @param account The account to add to the bank.
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * Retrieves a list of accounts owned by a specific user.
     *
     * @param userId The ID of the user.
     * @return A list of accounts owned by the specified user.
     */
    public List<Account> getUserAccounts(int userId) {
        List<Account> userAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getOwnerId() == userId) {
                userAccounts.add(account);
            }
        }
        return userAccounts;
    }

    // Additional getters and setters for other bank properties can be added here.
}
