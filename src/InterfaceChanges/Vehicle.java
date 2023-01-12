package InterfaceChanges;

public interface Vehicle {

	public abstract void cleanVehicle();
	
	default void sensor() {
		System.out.println("Sensor Added");
	}

	static void fuelCheck() {
		System.out.println("Fuel checked");
		
	}

}
