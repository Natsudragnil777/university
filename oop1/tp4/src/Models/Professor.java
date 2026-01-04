package Models;

public class Professor extends Person {
  private String department;
  private int experienceYears;

  public Professor( String department, int experienceYears , int id, String name, String surname){
   super(id,name,surname);
   this.department=department;
   this.experienceYears = experienceYears ;
  }

  public String getDepartment(){
    return this.department;
  }

    public int getExperienceYears(){
    return this.experienceYears;
  }

  public void setDepartment(String department){
    this.department =  department;
  }

    public void setExperienceYears(int experienceYears){
    this.experienceYears =  experienceYears;
  }

  @Override
  public void displayInfo(){
    System.out.println("department : " + this.department);
    System.out.println("experience Years : " + this.experienceYears);
} 

}
