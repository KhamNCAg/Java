package Day6;

public class Car {
    String brand, model;
    int year;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Land Cruiser", 2023);
        System.out.println(myCar.brand + ", " + myCar.model + ", " + myCar.year);
    }

    
}
