import static org.junit.Assert.*;
import org.junit.Test;

public class SavingTest {

    @Test
    public void testAddInterest() {
        Saving saving = new Saving(101, 1, 0.05);
        saving.deposit(1000.0);
        saving.addInterest();
        assertEquals(1050.0, saving.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Saving class if needed.
}
