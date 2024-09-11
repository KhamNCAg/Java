package SE_Batch1.Assignment5;

public class VehicleDao {
    private static Vehicle[] VehicleDB = new Vehicle[Vehicle.MAX_Vehicle_Count];
    public static int vehicleCount = 0;

    public void create(Vehicle vehicle){
    	VehicleDB[vehicleCount] = vehicle;
    	VehicleDB[vehicleCount].setId(vehicleCount++);    	
    }

    public Vehicle[] getAll() {
        return VehicleDB;
    }

    public Vehicle findById(int id){
        for (int i=0;i<vehicleCount;i++){
            if (VehicleDB[i].getId() == id){
                return VehicleDB[i];
            }
        }
        return null;
    }

}