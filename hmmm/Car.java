package hmmm;

public class Car extends Vehicle{
int numberOfDoors;
    
    public Car(String brand, double speed, int numberOfDoors){
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;

    }
    public void displayInfo(){
        System.out.println("the brand of the car is " + brand);
        System.out.println("the speed limit of the car " + speed);
        System.out.println("it has " + numberOfDoors + " doors");
    }
}
