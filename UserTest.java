import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User("Jane Doe", "456 Oak St", 25, 2);
        assertEquals("Jane Doe", user.getName());
    }

    // Add more tests for other methods in the User class if needed.
}