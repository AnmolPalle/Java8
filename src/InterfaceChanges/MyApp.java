package InterfaceChanges;


public class MyApp {

	public static void main(String[] args) {
		
		I20 i20=new I20();
		i20.cleanVehicle();
		i20.sensor();
	    Vehicle.fuelCheck(); 
		
		Santro santro=new Santro();
		santro.cleanVehicle();
		santro.sensor();
		Vehicle.fuelCheck();
	}

}
