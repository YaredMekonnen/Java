import static org.junit.Assert.*;
import org.junit.Test;

public class TransactionTest {

    @Test
    public void testTransactionCreation() {
        Transaction transaction = new Transaction(1, 101, 50.0);
        assertNotNull(transaction.getTimestamp());
    }

    // Add more tests for other methods in the Transaction class if needed.
}
