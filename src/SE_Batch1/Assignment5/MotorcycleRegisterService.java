package SE_Batch1.Assignment5;

import java.io.BufferedReader;

public class MotorcycleRegisterService extends VehicleRegisterService {
	
	@Override
    public Vehicle registerWithInfo(Vehicle curVeh, BufferedReader br) throws Exception {
		System.out.print("Does it have a sidecar? (true/false): ");
        boolean hasSidecar = Boolean.parseBoolean(br.readLine());
        return new Motorcycle(curVeh.brand,curVeh.model, hasSidecar);
    }

}
