package InterfaceChanges;

public class I20 implements Vehicle{

	@Override
	public void cleanVehicle() {
		System.out.println("Vechile washing through automated machines");
		
	}

	@Override
	public void sensor() {
	System.out.println("Special sensor");
	}

}
