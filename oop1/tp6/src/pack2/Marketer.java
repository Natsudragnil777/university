package pack2;

public class Marketer extends Employee {

    private double turnover;

    public Marketer(String firstName, String lastName, int yearOfRecruitment, double turnover) {
        super(firstName, lastName, yearOfRecruitment);
        this.turnover = turnover;
    }

    public double Calcul_sal() {
        double salary = 500 + (turnover * 0.10);
        return salary + Seniority_bonus();
    }

    @Override
    public String toString() {
        return "Marketer: " + firstName + ", Salary = " + Calcul_sal();
    }
}
