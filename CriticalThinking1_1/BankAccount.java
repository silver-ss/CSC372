public class BankAccount {
    //updated to private
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    //default constructor
    public BankAccount() {
        firstName = "unknown";
        lastName = "unknown";
        accountID = 0;
        balance = 0.0;
    }

    // parameterized constructor
    public BankAccount(String first, String last, int id) {
        firstName = first;
        lastName = last;
        accountID = id;
        balance = 0.0;
    }

    //deposit updates balance by deposit amount and returns updated balance
    public void deposit(double money) { // not using returned value switching to void
        if (money < 0) {
            System.out.println("ERROR: Deposit amount cannot be negative.");
            return;
        }
        balance += money;
        System.out.printf("You have successfully deposited $%.2f\n", money);
    }

    //withdrawal reduces balance by withdrawal and returns updated balance
    public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("ERROR: Withdrawal amount must be positive.");
        } else if (amount > balance) { // does not allow overdraft
            System.out.println("ERROR: Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful! New balance: $%.2f%n", balance);
        }
    }

    //setters
    public void setFirstName(String first) { firstName = first; }
    public void setLastName(String last) { lastName = last; }
    public void setAccountID(int id) { accountID = id; }

    //getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAccountID() { return accountID; }
    public double getBalance() { return balance; }

    protected void accountSummary() {
        System.out.printf("Name: %s %s, Account ID: %d, Balance: $%.2f", firstName, lastName, accountID, balance);}
}