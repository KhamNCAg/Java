package SE_Batch1.Assignment5;

public class Car extends Vehicle {
    private int doors;

    public Car(String model, String brand, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Doors: " + this.doors);
    }
}
