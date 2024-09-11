package SE_Batch1.Assignment5;

import java.io.BufferedReader;

public class TruckRegisterService extends VehicleRegisterService {
	
	@Override
    public Vehicle registerWithInfo(String model, String brand, BufferedReader br) throws Exception {
		System.out.print("Enter payload capacity (in tons): ");
        double payloadCapacity = Double.parseDouble(br.readLine());
        return new Truck(model, brand, payloadCapacity);
    }

}
