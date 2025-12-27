package tp3;

public class Doctor {
        private int id;
        private double consultationFee;

        public Doctor(int id, double cnstfee) {
                this.id = id;
                consultationFee = cnstfee;
        }

        public int getId() {
                return id;
        }

        public double getConsultationFee() {
                return consultationFee;
        }

        public void setConsultationFee(double fee) {
                consultationFee = fee;
        }


        public void displayDoctor() {
                System.out.println("doctor's ID: " + id);
                System.out.println("consultation Fee: " + consultationFee);
        }


}
