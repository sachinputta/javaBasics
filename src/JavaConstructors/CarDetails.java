package JavaConstructors;

public class CarDetails {
	
	String carName;
	static String companyName = "Maruti";
	int carMileage;
	int carTravelTime;
	double carPrice;
	int engineCC;
	int carSpeed;
	
	public CarDetails(String carName,int carMileage,int carTravelTime,
	double carPrice,int engineCC,int carSpeed) {
		
				this.carName= carName;
				this.carMileage = carMileage;
				this.carTravelTime = carTravelTime;
				this.carPrice = carPrice;
				this.engineCC = engineCC;
				this.carSpeed= carSpeed;	
			}
	
	
   // method for calculating distance
	public String distanceTravelled() {
		int x= this.carTravelTime;
		int y = this.carSpeed;
		int z = (x*y);  // distance = speed * time
		String distance = z + " Kmph";

		return distance;
		
	}
	
	
	// method for car Details
	public void car_Details() {
			
		System.out.println("Company Name: " + companyName );
		System.out.println("Car Name: " + carName );
		System.out.println("Car Mileage: " + carMileage + " cc" );
		System.out.println("Price of Car: Rs " + carPrice + " Lakhs" );
		System.out.println("Car capacity: " + engineCC);
		System.out.println("Top Speed : " + carSpeed + " Kms");
		System.out.println("Travelled Time : " + carTravelTime + " hrs" );
		System.out.println("Distance Covered : " + distanceTravelled());
		System.out.println("****-----------------******" );
			
		
	}

	public static void main(String[] args) {
		
		CarDetails m1 = new CarDetails("Swift",18,4,9.66,1197,110 );
		CarDetails m2 = new CarDetails("Baleno",21,6,7.5,1067,110 );
		CarDetails m3 = new CarDetails("Brezza",15,3,14.36,1497,120 );
		CarDetails m4 = new CarDetails("Alto 800",20,2,5.12,800,100 );
		
		m1.car_Details();
		m2.car_Details();
		m3.car_Details();
		m4.car_Details();
		

	}

}
