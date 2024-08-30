package SE_Batch1.Assignment5;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Doors: " + this.doors);
    }
}
