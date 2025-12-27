package tp3;

public class Patient {

    private int id;
    private int days;
    private double dailyCost;
    private Doctor doctor;

    public Patient(int id, int days, double dailyCost, Doctor doctor) {
        this.id = id;
        this.days = days;
        this.dailyCost = dailyCost;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public int getDays() {
        return days;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public double calculateBill() {
        return (days * dailyCost) + doctor.getConsultationFee();
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + id);
        System.out.println("Days: " + days);
        System.out.println("Daily Cost: " + dailyCost);
        System.out.println("Doctor ID: " + doctor.getId());
        System.out.println("Total Bill: " + calculateBill());
    }

}
