package SE_Batch1.Assignment5;

import java.io.BufferedReader;

public class MotorcycleRegisterService extends VehicleRegisterService {
	
	@Override
    public Vehicle registerWithInfo(String model, String brand, BufferedReader br) throws Exception {
		System.out.print("Does it have a sidecar? (yes/no): ");
        boolean hasSidecar = br.readLine().equalsIgnoreCase("yes") ? true : false;
        return new Motorcycle(model, brand, hasSidecar);
    }

}
