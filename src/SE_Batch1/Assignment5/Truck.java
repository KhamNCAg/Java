package SE_Batch1.Assignment5;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String brand, String model, double payloadCapacity) {
        super(brand, model);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Payload Capacity: " + this.payloadCapacity);
    }
}
