package interfaces;

// vehicle(abstract) ===> VehicleFeatures(interface) ===> CarDetails(class)

public abstract class Vehicle {

	String Brand;
	String Model;
	
	public Vehicle(String Brand,String Model) {
		this.Brand = Brand;
		this.Model = Model;
		
	}
	
  public void basicDetails() {
	  System.out.println("Brand Name : " + Brand);
	  System.out.println("Model : " + Model);
  }
	

	public abstract void yearManufactured(int year);
	public abstract void vehicleIdentityNo(String vin);
	
		
	
	
}
