import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testInitialBalance() {
        Account account = new Account(101, 1);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawWithInsufficientBalance() {
        Account account = new Account(101, 1);
        account.deposit(50.0);
        account.withdraw(100.0); // Attempt to withdraw more than the balance
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testMultipleDeposits() {
        Account account = new Account(101, 1);
        account.deposit(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testMultipleWithdrawals() {
        Account account = new Account(101, 1);
        account.deposit(200.0);
        account.withdraw(50.0);
        account.withdraw(30.0);
        assertEquals(120.0, account.getBalance(), 0.001);
    }

    @Test
    public void testSetBalance() {
        Account account = new Account(101, 1);
        account.setBalance(75.0);
        assertEquals(75.0, account.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Account class if needed.
}
