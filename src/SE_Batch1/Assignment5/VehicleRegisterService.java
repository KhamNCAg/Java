package SE_Batch1.Assignment5;

import java.io.*;
import java.util.*;

public class VehicleRegisterService {
    public VehicleDao vehicleDao = new VehicleDao();


    public void registerVehicle(BufferedReader br) throws Exception {
    	System.out.print("Enter Model: ");
        String model = br.readLine();
        System.out.print("Enter Brand: ");
        String brand = br.readLine();
        vehicleDao.create(registerWithInfo(model, brand, br));
    }

    public Vehicle registerWithInfo(String model, String Brand, BufferedReader br) throws Exception {
        return null;
    }

    @SuppressWarnings("static-access")
	public void displayAllVehicles() {
        System.out.println("\nDisplaying all registered vehicles:");
        Vehicle[] tmpDB = vehicleDao.getAll();
        for (int i=0;i<vehicleDao.vehicleCount;i++) {
            tmpDB[i].displayInfo();
            System.out.println("---------------------------------------------------");;
        }
    }
}
