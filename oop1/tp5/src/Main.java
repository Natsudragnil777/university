
import vehicles.*;
import calcul.*;
import java.util.Scanner;


public class Main {


public static void main(String[] args) {
String brand;
String  model;
int year;
double price;
int numberOfDoors;
double loadCapacity;
boolean hasSidecar;


   Scanner inp = new Scanner(System.in);
   System.out.println("enter details for Car : ");
   System.out.println("brand : ");
   brand = inp.next();
   System.out.println("model : ");
   model = inp.next();
   System.out.println("year : ");
   year = inp.nextInt();
   System.out.println("price : ");
   price = inp.nextDouble();
   System.out.println("numberOfDoors : ");
   numberOfDoors = inp.nextInt();
   Car car = new Car(brand, model, year, price, numberOfDoors);

   System.out.println("enter details for Truck : ");
   System.out.println("brand : ");
   brand = inp.next();
   System.out.println("model : ");
   model = inp.next();
   System.out.println("year : ");
   year = inp.nextInt();
   System.out.println("price : ");
   price = inp.nextDouble();
   System.out.println("loadCapacity : ");
   loadCapacity = inp.nextDouble();
   Truck truck = new Truck(brand, model, year, price, loadCapacity);

   System.out.println("enter details for Motorcycle : ");
   System.out.println("brand  : ");
   brand  = inp.next();
   System.out.println("model : ");
   model = inp.next();
   System.out.println("year : ");
   year = inp.nextInt();
   System.out.println("price : ");
   price = inp.nextDouble();
   System.out.println("Has sidecar ?(true/false) ");
   hasSidecar = inp.nextBoolean();
   Motorcycle motorcycle = new Motorcycle(brand, model, year, price, hasSidecar);
   
   Vehicle vehicles[] = {car , truck , motorcycle };

   Help help = new Help();

   System.out.println(" display All vehicles ");
   help.displayAllVehicles(vehicles);
   
   double sumTax = 0;
   for(Vehicle v : vehicles){
    sumTax += v.calculateTax();
   }
   System.out.println("total tax : " + sumTax);

   System.out.println("number of Cars : " + help.countVehiclesOfType(vehicles , "Car") );
   System.out.println("number of Truck : " + help.countVehiclesOfType(vehicles , "Truck") );
   System.out.println("number of Motorcycle : " + help.countVehiclesOfType(vehicles , "Motorcycle") );




}

}






