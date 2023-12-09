import static org.junit.Assert.*;
import org.junit.Test;

public class CheckingTest {

    @Test
    public void testOverdraft() {
        Checking checking = new Checking(101, 1, 50.0);
        checking.withdraw(100.0);
        assertEquals(-50.0, checking.getBalance(), 0.001);
    }

    // Add more tests for other methods in the Checking class if needed.
}
