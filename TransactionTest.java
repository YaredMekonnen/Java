import static org.junit.Assert.*;
import org.junit.Test;

public class TransactionTest {

    @Test
    public void testTransactionAmount() {
        Transaction transaction = new Transaction(1, 101, 50.0);
        assertEquals(50.0, transaction.getAmount(), 0.001);
    }

    @Test
    public void testNegativeTransactionAmount() {
        Transaction transaction = new Transaction(2, 102, -30.0);
        assertEquals(-30.0, transaction.getAmount(), 0.001);
    }

    @Test
    public void testTransactionId() {
        Transaction transaction = new Transaction(3, 103, 75.0);
        assertEquals(3, transaction.getTransactionId());
    }

    @Test
    public void testAccountId() {
        Transaction transaction = new Transaction(4, 104, 100.0);
        assertEquals(104, transaction.getAccountId());
    }

    // Add more tests for other methods in the Transaction class if needed.
}
