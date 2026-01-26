package vehicles;

public class Vehicle {

String brand;
String  model;
int year;
double price;


public Vehicle(String brand, String model, int year, double price) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.price = price;
}
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public String getModel() {
    return model;
}
public void setModel(String model) {
    this.model = model;
}
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}


public void displayInfo(){

System.out.println("brand : " + brand);
System.out.println("model : " + model);
System.out.println("year : " + year);
System.out.println("price : " + price);

}

public double calculateTax(){
    return price * 0.1;
}


  public String getType() {
        return "Vehicle";
    }


}
