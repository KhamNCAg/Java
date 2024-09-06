package SE_Batch1.Assignment5;

import java.io.*;

public class VehicleGenerator {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String flag = "";
            VehicleRegisterService vehicleRegisterService = null;

            do {
                System.out.print("Enter Vehicle Type (1.Car / 2.Truck / 3.Motorcycle): ");
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

            if (vehicleRegisterService != null) {
                vehicleRegisterService.displayAllVehicles();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
