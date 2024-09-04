package SE_Batch1.Assignment5;

import java.io.BufferedReader;

public class TruckRegisterService extends VehicleRegisterService {
	
	@Override
    public Vehicle registerWithInfo(Vehicle curVeh, BufferedReader br) throws Exception {
		System.out.print("Enter payload capacity (in tons): ");
        double payloadCapacity = Double.parseDouble(br.readLine());
        return new Truck(curVeh.brand,curVeh.model, payloadCapacity);
    }

}
