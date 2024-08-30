package SE_Batch1.Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleRegisterService {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void registerVehicle() {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean addAnotherVehicle = true;

			while (addAnotherVehicle) {
			    System.out.println("Enter vehicle type (Car, Truck, Motorcycle): ");
			    String vehicleType = scanner.nextLine().toLowerCase();

			    System.out.println("Enter brand: ");
			    String brand = scanner.nextLine();
			    System.out.println("Enter model: ");
			    String model = scanner.nextLine();

			    Vehicle vehicle = null;

			    switch (vehicleType) {
			        case "car":
			            System.out.println("Enter number of doors: ");
			            int doors = scanner.nextInt();
			            scanner.nextLine(); // consume the newline
			            vehicle = new Car(brand, model, doors);
			            break;
			        case "truck":
			            System.out.println("Enter payload capacity (in tons): ");
			            double payloadCapacity = scanner.nextDouble();
			            scanner.nextLine(); // consume the newline
			            vehicle = new Truck(brand, model, payloadCapacity);
			            break;
			        case "motorcycle":
			            System.out.println("Does it have a sidecar? (true/false): ");
			            boolean hasSidecar = scanner.nextBoolean();
			            scanner.nextLine(); // consume the newline
			            vehicle = new Motorcycle(brand, model, hasSidecar);
			            break;
			        default:
			            System.out.println("Invalid vehicle type.");
			    }

			    if (vehicle != null) {
			        vehicles.add(vehicle);
			        System.out.println("Vehicle added successfully!");
			    }

			    System.out.println("Do you want to add another vehicle? (yes/no): ");
			    String response = scanner.nextLine();
			    addAnotherVehicle = response.equalsIgnoreCase("yes");
			}
		}
        displayAllVehicles();
    }

    public void displayAllVehicles() {
        System.out.println("Displaying all registered vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

    public static void main(String[] args) {
        VehicleRegisterService service = new VehicleRegisterService();
        service.registerVehicle();
    }
}
