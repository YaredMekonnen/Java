import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account(101, 1);
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(101, 1);
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Account class if needed.
}
