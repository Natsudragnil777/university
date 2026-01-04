package Models;

public class Student extends Person {
  private String matricule;
  private String email;
  private double averageGrade;

  public Student(  int id, String name, String surname , String matricule, String email , double averageGrade ){
  super(id,name,surname);  
  this.matricule = matricule;
  this.email = email;
  this.averageGrade = averageGrade;
  }

  public Student( int id, String name, String surname , String matricule, double averageGrade){
  super(id,name,surname); 
  this.matricule = matricule;
  this.averageGrade = averageGrade;
  this.email = "----";
  }
 

  public String getMatricule(){
    return this.matricule;
  }

  

   public String getEmail(){
    return this.email;
  }

   public double getAverageGrade(){
    return this.averageGrade;
  }


@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("matricule  : " + this.matricule);
    System.out.println("email : " + this.email);
    System.out.println("averageGrade : " + this.averageGrade);
} 

public double calculateAverage(double grade1 , double grade2){
    return (grade1 + grade2) / 2;
}


}



