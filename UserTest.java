import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserAddress() {
        User user = new User("John Smith", "789 Pine St", 30, 3);
        assertEquals("789 Pine St", user.getAddress());
    }

    @Test
    public void testUserAge() {
        User user = new User("Alice Johnson", "101 Maple St", 40, 4);
        assertEquals(40, user.getAge());
    }

    @Test
    public void testUserId() {
        User user = new User("Bob Miller", "202 Birch St", 35, 5);
        assertEquals(5, user.getUserId());
    }

    @Test
    public void testSetName() {
        User user = new User("Charlie Brown", "303 Cedar St", 28, 6);
        user.setName("Charlie White");
        assertEquals("Charlie White", user.getName());
    }

    @Test
    public void testSetAddress() {
        User user = new User("Eva Green", "404 Walnut St", 32, 7);
        user.setAddress("404 Oak St");
        assertEquals("404 Oak St", user.getAddress());
    }

    @Test
    public void testSetAge() {
        User user = new User("David Johnson", "505 Pine St", 45, 8);
        user.setAge(50);
        assertEquals(50, user.getAge());
    }

    @Test
    public void testSetUserId() {
        User user = new User("Grace Lee", "606 Elm St", 22, 9);
        user.setUserId(10);
        assertEquals(10, user.getUserId());
    }

    // Add more tests for other methods in the User class if needed.
}
