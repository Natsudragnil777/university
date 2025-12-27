package tp3;

public class Patient {
   
        int id ; 
        int days;
        double dailyCost;
        Doctor doctor;
  
        public  Patient(int id , int days , double dailyCost , Doctor doctor){
        this.id = id;
        this.days = days;
        this.dailyCost = dailyCost;
        this.doctor = doctor;
        }
     
        public double calculateBill(){
            return (days * dailyCost) + doctor.consultationFee;
        }

        public void displayPatient(){
           System.out.println("Patient ID: " + id);
           System.out.println("Days: " + days);
           System.out.println("Daily Cost: " + dailyCost);
           System.out.println("Doctor ID: " + doctor.id);
           System.out.println("Total Bill: " + calculateBill());

        }

}
