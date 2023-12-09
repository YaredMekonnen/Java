import static org.junit.Assert.*;
import org.junit.Test;

public class CheckingTest {

    @Test
    public void testInitialBalance() {
        Checking checking = new Checking(101, 1, 50.0);
        assertEquals(0.0, checking.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawWithinOverdraftLimit() {
        Checking checking = new Checking(101, 1, 50.0);
        checking.withdraw(30.0);
        assertEquals(-30.0, checking.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawExactlyAtOverdraftLimit() {
        Checking checking = new Checking(101, 1, 50.0);
        checking.withdraw(50.0);
        assertEquals(-50.0, checking.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawExceedingOverdraftLimit() {
        Checking checking = new Checking(101, 1, 50.0);
        checking.withdraw(80.0); // Attempt to withdraw beyond the overdraft limit
        assertEquals(0.0, checking.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        Checking checking = new Checking(101, 1, 50.0);
        checking.deposit(30.0);
        assertEquals(30.0, checking.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Checking class if needed.
}

