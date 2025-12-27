package tp3;

public class Doctor {
        int id;
        double consultationFee;

        public Doctor(int id, double cnstfee) {
                this.id = id;
                consultationFee = cnstfee;
        }

        public void displayDoctor() {
                System.out.println("doctor's ID: " + id);
                System.out.println("consultation Fee: " + consultationFee);
        }

}
