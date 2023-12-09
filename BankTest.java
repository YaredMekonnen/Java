import static org.junit.Assert.*;
import org.junit.Test;

public class BankTest {

    @Test
    public void testAddUser() {
        Bank bank = new Bank();
        User user = new User("John Doe", "123 Main St", 30, 1);
        bank.addUser(user);
        assertEquals(user, bank.getUser(1));
    }

    @Test
    public void testAddAccount() {
        Bank bank = new Bank();
        Account account = new Account(101, 1);
        bank.addAccount(account);
        assertEquals(account, bank.getUserAccounts(1).get(0));
    }

    // Add more tests for other methods in the Bank class if needed.
}
