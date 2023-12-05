/**
 * The User class represents an individual with personal information and a unique identifier.
 * @author YARED MEKONNEN
 */
public class User {
    private String name;    // The name of the user.
    private String address; // The address of the user.
    private int age;        // The age of the user.
    private int userId;     // A unique identifier for the user.

    /**
     * Creates a new user with the specified name, address, age, and unique user ID.
     *
     * @param name The name of the user.
     * @param address The address of the user.
     * @param age The age of the user.
     * @param userId A unique identifier for the user.
     */
    public User(String name, String address, int age, int userId) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.userId = userId;
    }

    // Getters and setters for user properties

    /**
     * Get the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the user.
     *
     * @param name The new name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the user.
     *
     * @return The address of the user.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the user.
     *
     * @param address The new address of the user.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the age of the user.
     *
     * @return The age of the user.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of the user.
     *
     * @param age The new age of the user.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the unique user ID.
     *
     * @return The unique user ID.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Set the unique user ID.
     *
     * @param userId The new unique user ID.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
