package Day1;

public class operatingBankAccount {

	public static void main(String[] args) {
//		Step1
		BankAccount acc1 = new BankAccount(1000);
		
//		Step2
		System.out.println("Opening balance: $" + acc1.getBalance());
		
//		Step3
		acc1.deposit(500);
		System.out.println("New balance: $" + acc1.getBalance());
		
//		Step4
		try {
			acc1.withdraw(1500);
			System.out.println("New balance: $" + acc1.getBalance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.print(e.getMessage());
		}
	}

}
