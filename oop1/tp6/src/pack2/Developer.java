package pack2;

public class Developer extends Employee {

    private int workedHours;

    public Developer(String firstName, String lastName, int yearOfRecruitment, int workedHours) {
        super(firstName, lastName, yearOfRecruitment);
        this.workedHours = workedHours;
    }


 public double Calcul_sal() {
  if(workedHours <= 40){
    return workedHours * 25 + Seniority_bonus();
  }else{
    return 40 * 25 + (workedHours - 40) * 35 + Seniority_bonus();
  }





 }


    @Override
    public String toString() {
        return "Developer: " + firstName + ", Salary = " + Calcul_sal();
    }
}
