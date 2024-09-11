package SE_Batch1.Assignment5;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String model, String brand, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Has Sidecar: " + this.hasSidecar);
    }
}
