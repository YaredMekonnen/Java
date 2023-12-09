import static org.junit.Assert.*;
import org.junit.Test;

public class SavingTest {

    @Test
    public void testInitialBalance() {
        Saving saving = new Saving(101, 1, 0.05);
        assertEquals(0.0, saving.getBalance(), 0.001);
    }

    @Test
    public void testAddInterestMultipleTimes() {
        Saving saving = new Saving(101, 1, 0.05);
        saving.deposit(1000.0);
        saving.addInterest(); // First interest addition
        saving.addInterest(); // Second interest addition
        assertEquals(1102.5, saving.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawAfterInterest() {
        Saving saving = new Saving(101, 1, 0.05);
        saving.deposit(1000.0);
        saving.addInterest();
        saving.withdraw(200.0);
        assertEquals(847.5, saving.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawExceedingBalanceAfterInterest() {
        Saving saving = new Saving(101, 1, 0.05);
        saving.deposit(1000.0);
        saving.addInterest();
        saving.withdraw(1200.0); // Attempt to withdraw more than the balance after interest
        assertEquals(0.0, saving.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Saving class if needed.
}
