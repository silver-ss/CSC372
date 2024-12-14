package criticalThinking1_1;

public class Test {
	public static void main(String[] args) {
		
		//create CheckingAccount Object
		CheckingAccount acct1 = new CheckingAccount();
		//use setters from BankAccount and CheckingAccount
		acct1.setFirstName("Bob");
		acct1.setLastName("Jones");
		acct1.setAccountID(1);
		acct1.setInterestRate(0.02);
		// test methods 
		acct1.displayAccount();
		acct1.deposit(100.25);
		acct1.displayAccount();
		acct1.processWithdrawal(100); //normal withdrawal
		acct1.processWithdrawal(50); //overdraft
		// test edge cases
		acct1.deposit(999999999); //large int
		acct1.deposit(-5); // negative deposit
		acct1.processWithdrawal(-10); //negative wiwithdrawalthdrwaal 
		acct1.processWithdrawal(999999999); //large int
		//should not use this method for checking accounts just for testing
		acct1.withdrawal(100); // trying to use BankAccount withdrawal directly
	}
}
 
/* OUTPUT
Name: Bob Jones, AccountID: 1, Balance: 0.00, Interest rate: 2.0%.
You have successfully deposited $100.25
Name: Bob Jones, AccountID: 1, Balance: 100.25, Interest rate: 2.0%.
Withdrawal successful! New balance: 0.25
Overdraft! A $30 fee has been applied.
New balance after overdraft: -79.75
You have successfully deposited $999999999.00
ERROR: Deposit amount cannot be negative.
ERROR: Withdrawal amount must be positive.
Overdraft! A $30 fee has been applied.
New balance after overdraft: -109.75
ERROR: Insufficient funds. Withdrawal denied.
*/