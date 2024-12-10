package hmmm;

public class Bike extends Vehicle {
	 protected boolean hasCarrier;
	    public Bike(String brand, double speed,boolean hasCarrier){
	        super(brand, speed);
	        this.hasCarrier = hasCarrier;
	    }
	 public void displayInfo() {
		 System.out.println("the brand of the bike is " + brand);
		 System.out.println("the speed of the bike is "+ speed);
		 System.out.println("does it has a carrier " + hasCarrier);
	 }
}
