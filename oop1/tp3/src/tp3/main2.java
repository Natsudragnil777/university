package tp3;
import java.util.Scanner;


public class main2 {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in); 

       int doctorId ; 
       double consultationFee;

       System.out.println("enter the folowing values:");
       System.out.println("doctor's id :");
       doctorId = inp.nextInt();
       System.out.println("doctor's consultationFee :");
       consultationFee = inp.nextInt();
       Doctor dctr = new Doctor(doctorId, consultationFee);

        int patientId ; 
        int days;
        double dailyCost;

       System.out.println("patient Id:");
       patientId = inp.nextInt();
       System.out.println("days");
       days = inp.nextInt();       
       System.out.println("dailyCost");
       dailyCost = inp.nextDouble(); 


       Patient ptint = new Patient(patientId, days, dailyCost, dctr);

       dctr.displayDoctor();
       ptint.displayPatient();
       ptint.calculateBill();

    }
}