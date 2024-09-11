package SE_Batch1.Assignment5;

public class CustomerDao {

	private static Customer[] customerDB = new Customer[Customer.MAX_Customer_Count];

	public static Customer[] getAll() {
		return customerDB;
	}
	
	public static void displayAllCustomer() {
		for (int i=0;i<Customer.getCount();i++){
			System.out.println(customerDB[i]);
		}
	}
}