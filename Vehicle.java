package hmmm;

public class Vehicle {
    protected String brand;
    protected double speed;

    public Vehicle(String brand, double speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo(){
        System.out.println(brand);
        System.out.println(speed);
    }
}