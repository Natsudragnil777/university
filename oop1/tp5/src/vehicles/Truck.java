package vehicles;

public class Truck extends Vehicle {

    double loadCapacity;

    public Truck(String brand, String model, int year, double price, double loadCapacity) {
        super(brand, model, year, price);
        this.loadCapacity = loadCapacity;
    }
    
@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("load Capacity : " + loadCapacity);
}

@Override
public double calculateTax() {

    return super.price * 0.15;
}





@Override
 public String getType() {
        return "Truck";
 }




}
