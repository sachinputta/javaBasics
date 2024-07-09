package interfaces;

public class carDetails extends Vehicle implements VehicleFeatures {

	public carDetails(String Brand, String Model) {
		super(Brand, Model);
		
	}

	@Override
	public void vehicleMileage(int mileage) {
		System.out.println("Vehicle Mileage : " + mileage + "kmph");
		
		
	}

	@Override
	public void fuelType(String fType) {
		System.out.println("Fuel Type : " + fType);
		
	}

	@Override
	public void vehicleColor(String color) {
		System.out.println("Car Colour : " + color);
		
	}

	@Override
	public void TransmissionType(String transType) {
		System.out.println("Transmission Type : " + transType);
		
	}

	@Override
	public void yearManufactured(int year) {
		System.out.println("Year of Manufacturing : " + year);
		
	}

	@Override
	public void vehicleIdentityNo(String vin) {
		System.out.println("Vehicle ID : " + vin);
		
	}
	
	public static void main (String[] args) {
		carDetails c = new carDetails("Toyato","Fortuner");
		c.basicDetails();
		c.yearManufactured(2020);
		c.vehicleIdentityNo("TOY34RT1242E44");
		c.vehicleMileage(23);
		c.fuelType("Diesel");
		c.vehicleColor("Black");
		c.TransmissionType("Automatic");
		
		
	}
	

}

