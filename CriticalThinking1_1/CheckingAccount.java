package criticalThinking1_1;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	// constructor
	public CheckingAccount() {
		super();
		interestRate = 0.0;
	}
	// getter
	public double getInterestRate() { return interestRate; }
	// setter
	public void setInterestRate(double rate) { interestRate = rate; }
	// allows overdraft with a fee
	public void processWithdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("ERROR: Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Overdraft! A $30 fee has been applied.");
            balance -= (amount + 30); // Subtract withdrawal and $30 fee
            System.out.printf("New balance after overdraft: %.2f%n", balance);
        } else {
            super.withdrawal(amount); // Call superclass withdrawal
        }
    }
	
	public void displayAccount() {
		super.accountSummary();
		System.out.println(", Interest rate: " + (interestRate * 100) + "%.");
	}	
}