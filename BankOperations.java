import java.util.List;

interface BankOperations {
    void deposit(double amount);

    void withdraw(double amount);

    List<Transaction> getTransactionHistory();

    // Additional getters and setters
    int getAccountNumber();

    void setAccountNumber(int accountNumber);

    double getBalance();

    void setBalance(double balance);

    int getOwnerId();

    void setOwnerId(int ownerId);

    void setTransactions(List<Transaction> transactions);
}
