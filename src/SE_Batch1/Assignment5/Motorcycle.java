package SE_Batch1.Assignment5;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Has Sidecar: " + this.hasSidecar);
    }
}
