package pack2;


public class Employee {

    protected String firstName;
    protected String lastName;
    protected int yearOfRecruitment;

    public Employee(String firstName, String lastName, int yearOfRecruitment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfRecruitment = yearOfRecruitment;
    }


    public int Seniority_bonus() {
        int seniority = 2025 - yearOfRecruitment;
        return seniority * 10;
    }


    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName
                + ", Recruitment Year: " + yearOfRecruitment;
    }
}






