package SE_Batch1.Assignment5;

import java.io.BufferedReader;

public class CarRegisterService extends VehicleRegisterService {
	
	@Override
    public Vehicle registerWithInfo(String model, String brand, BufferedReader br) throws Exception {
        System.out.print("Enter Number of Doors: ");
        int doors = Integer.parseInt(br.readLine());
        return new Car(model, brand, doors);
    }

}
