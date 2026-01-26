package vehicles;

public class Motorcycle extends Vehicle {

boolean hasSidecar;

public Motorcycle(String brand, String model, int year, double price, boolean hasSidecar) {
    super(brand, model, year, price);
    this.hasSidecar = hasSidecar;
}

@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Has Sidecar : " + hasSidecar);
}

@Override
public double calculateTax() {

    return super.price * 0.08;
}


@Override
 public String getType() {
        return "Motorcycle";
 }




}
