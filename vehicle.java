//how can i be homophobic ? //
public class vehicle
{
    String brand;
    double speed;

    vehicle(String brand,double speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
    
    public void display()
    {
        System.out.println("brand is : " + brand + " and speed is : " + speed);
    }    
    public static void main(String[] args) {
        Car a = new Car("toyota",2014,4);
        Bike b = new Bike("bmx",2020,true);
        a.display();
        b.display();
        

    }
}
class Car extends vehicle
{
    int numberOfDoors;
    Car(String brand,double speed,int numberOfDoors)
    {
        super(brand, speed);
        this.numberOfDoors=numberOfDoors;
    }
    
    @Override
    public void display()
    {
        System.out.println("brand is : " + brand + " speed is : " + speed + " and the number of doors are : " + numberOfDoors);
    }
}
class Bike extends vehicle
{
    boolean hasCarrier;
    Bike(String brand,double speed,boolean hasCarrier)
    {
        super(brand, speed);
        this.hasCarrier=hasCarrier;
    }
    @Override
    public void display()
    {
        System.out.println("brand is : " + brand + " speed is : " + speed + " has carrier : " + hasCarrier);
    }
}
