package SE_Batch1.Assignment5;

public class Customer {
    public static final int MAX_Customer_Count = 100;
    private int id;
    private String name;
    private static int customerCount;

    public Customer (int id, String name){
        this.id = id;
        this.name = name;
        customerCount++;
    }

    public static int getCount() {
        return customerCount;
    }

	@Override
	public String toString() {
		return "Customer id=" + id + ", name=" + name ;
	}
    
    
    
}