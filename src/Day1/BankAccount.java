package Day1;

public class BankAccount {

private double currentBalance;

public BankAccount(double initialBalance) {
	super();
	this.currentBalance = initialBalance;
}
	
public double getBalance() {
	return this.currentBalance;
}

public void deposit(double amount) {
	System.out.println("Depositing $" + amount + "...");
	this.currentBalance += amount;
}

public void withdraw(double amount) throws Exception {
	if(this.currentBalance>=amount) {
		System.out.println("Withdrawing $" + amount + "...");
		this.currentBalance -= amount;
	}else {
		throw new Exception("Insufficient Balance!" );
	}
}
	
}	