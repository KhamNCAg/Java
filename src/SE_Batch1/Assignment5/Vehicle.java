package SE_Batch1.Assignment5;

public class Vehicle {
	public static final int MAX_Vehicle_Count = 100;
	private int id;
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
    	
    }
    
	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
