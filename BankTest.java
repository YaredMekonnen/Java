import static org.junit.Assert.*;
import org.junit.Test;

public class BankTest {

    @Test
    public void testGetNonExistingUser() {
        Bank bank = new Bank();
        assertNull(bank.getUser(1)); // Ensure that getting a non-existing user returns null
    }

    @Test
    public void testGetNonExistingUserAccounts() {
        Bank bank = new Bank();
        assertTrue(bank.getUserAccounts(1).isEmpty()); // Ensure that getting accounts for a non-existing user returns an empty list
    }

    @Test
    public void testAddMultipleUsers() {
        Bank bank = new Bank();
        User user1 = new User("John Doe", "123 Main St", 30, 1);
        User user2 = new User("Jane Smith", "456 Elm St", 25, 2);
        bank.addUser(user1);
        bank.addUser(user2);
        assertEquals(user1, bank.getUser(1));
        assertEquals(user2, bank.getUser(2));
    }

    @Test
    public void testAddMultipleAccounts() {
        Bank bank = new Bank();
        Account account1 = new Account(101, 1);
        Account account2 = new Account(102, 1);
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(account1, bank.getUserAccounts(1).get(0));
        assertEquals(account2, bank.getUserAccounts(1).get(1));
    }

    // Add more tests for other methods in the Bank class if needed.
}
