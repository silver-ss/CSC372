package criticalThinking1_1;

public class BankAccount {
	protected String firstName;
	protected String lastName;
	protected int AccountID;
	protected double balance;
	
	//default constructor
	public BankAccount() {
		firstName = "unknown";
		lastName = "unknown";
		AccountID = 0;
		balance = 0.0;
	}
	
	// parameterized constructor
	public BankAccount(String first, String last, int id) {
		firstName = first;
		lastName = last;
		AccountID = id;
		balance = 0.0;
	}
	//deposit updates balance by deposit amount and returns updated balance
	public double deposit(double money) {
		if (money < 0) {
			System.out.println("ERROR: Deposit amount cannot be negative.");
			return balance;
		}
		System.out.printf("You have successfully deposited $%.2f\n", money);
		return balance += money;
	}
	//withdrawal reduces balance by withdrawal and returns updated balance
	public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("ERROR: Withdrawal amount must be positive.");
        } else if (amount > balance) { // does not allow overdraft
            System.out.println("ERROR: Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful! New balance: %.2f%n", balance);
        }
    }
	
	//setters
	public void setFirstName(String first) { firstName = first; }
	public void setLastName(String last) { lastName = last; }
	public void setAccountID(int id) { AccountID = id; }
	
	//getters
	public String getFirstName() { return firstName; }
	public String getLastName() { return  lastName; }
	public int getAccountID() { return AccountID; }
	public double getBalance() { return balance; }
	
	//print an account summary
	protected void accountSummary() {
		System.out.printf("Name: %s %s, AccountID: %d, Balance: %.2f", firstName, lastName, AccountID, balance);
	}	
}