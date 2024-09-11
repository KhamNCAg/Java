package SE_Batch1.Assignment5;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String brand, String model, double payloadCapacity) {
        super(model, brand);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Payload Capacity: " + this.payloadCapacity);
    }
}
