package calcul;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Motorcycle;


public class Help {
    

    public double totalTaxes(Vehicle[] vehicles){
       double sum = 0;
       for(Vehicle v : vehicles){
        sum += v.calculateTax();
       }
       return sum;

    } 

    public void displayAllVehicles(Vehicle[] vehicles){
       
       for(Vehicle v : vehicles){
         v.displayInfo();
         v.calculateTax();
       }
    } 



public static int countVehiclesOfType(Vehicle[] vehicles, String type) {
    int count = 0;
    for (Vehicle v : vehicles) {
        if (v.getType().equalsIgnoreCase(type)) {
            count++;
        }
    }
    return count;
}



}



