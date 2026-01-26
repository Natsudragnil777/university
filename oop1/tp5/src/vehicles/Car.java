package vehicles;

public class Car extends Vehicle {
int numberOfDoors;

public Car(String brand, String model, int year, double price, int numberOfDoors) {
    super(brand, model, year, price);
    this.numberOfDoors = numberOfDoors;
}



@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("number Of Doors : " + numberOfDoors);
}

@Override
public double calculateTax() {

    return super.price * 0.12;
}




@Override
 public String getType() {
        return "Car";
 }


}
