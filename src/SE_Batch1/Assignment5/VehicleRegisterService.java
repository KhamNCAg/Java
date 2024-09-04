package SE_Batch1.Assignment5;

import java.io.*;
import java.util.*;

public class VehicleRegisterService {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private Vehicle curVehicle;
    
    public void commonInfo(BufferedReader br ) throws IOException{
        System.out.print("Enter Model: ");
        String model = br.readLine();
        System.out.print("Enter Brand: ");
        String brand = br.readLine();
        curVehicle = new Vehicle(model, brand);
    }

    public void registerVehicle(BufferedReader br) throws Exception {
        commonInfo(br);
        vehicles.add(registerWithInfo(curVehicle, br));
    }

    public Vehicle registerWithInfo(Vehicle curVeh,BufferedReader br) throws Exception {
    	return null;
    }

    public void displayAllVehicles() {
        System.out.println("Displaying all registered vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String flag = "";
        	VehicleRegisterService vehicleRegisterService = null;
            do {
            System.out.println("Enter Vehicle Type (1.Car / 2.Truck / 3.Motorcycle): ");
            int type = Integer.parseInt(br.readLine());


            switch (type) {
                case 1:
                    vehicleRegisterService = new CarRegisterService();
                    break;
                case 2:
                    vehicleRegisterService = new TruckRegisterService();
                    break;
                case 3:
                    vehicleRegisterService = new MotorcycleRegisterService();
                    break;
                default:
                    System.out.println("Invalid vehicle type.");
                    return;
            }

            if (vehicleRegisterService != null) {
                vehicleRegisterService.registerVehicle(br);
            }
            System.out.println("Do you want to add another vehicle? (yes/no)");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));

            vehicleRegisterService.displayAllVehicles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}