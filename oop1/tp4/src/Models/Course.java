package Models;

public class Course {
   private int courseCode;
   private String title;
   private double cridit;
   private int maxStudents;
   private int enrolledStudent;
   static int courseCounter = 0;


   public Course( int courseCode, String title, double cridit, int maxStudents , int enrolledStudent){
   this.courseCode = courseCode;
   this.title = title;
   this.cridit = cridit;
   this.maxStudents = maxStudents;
   this.enrolledStudent = enrolledStudent;
   courseCounter++;
   }

   public int getCourseCode(){
    return this.courseCode;
   }
   public String getTitle(){
    return this.title;
   }
   public double getCridit(){
    return this.cridit;
   }
   public int getMaxStudents(){
    return this.maxStudents;
   }
   public int getEnrolledStudent(){
    return this.enrolledStudent;
   }

    public static int getCourseCounter() {
    return courseCounter;
   }



   public void setCourseCode(int courseCode){
    this.courseCode = courseCode;
   }

   public void setTitle(String title){
    this.title = title;
   }

    public void setCridit(double cridit){
    this.cridit = cridit;
   }
   public void setMaxStudents(int maxStudents){
    this.maxStudents = maxStudents;
   }
    public void setEnrolledStudent(int enrolledStudent){
    this.enrolledStudent = enrolledStudent;
   }




   public boolean enrollStudent(){
    if(this.enrolledStudent < maxStudents){
        enrolledStudent++;
        return true;
    }else{
        return false;
    }
   }


   
   public boolean removeStudent(){
    if(this.enrolledStudent > 0){
        enrolledStudent--;
        return true;
    }else{
        return false;
    }
   }


    public int availablePlaces(){
    if(this.enrolledStudent < maxStudents){
        return maxStudents - enrolledStudent ;
    }else{
        return 0;
    }
   }


   public double calculateAverage(double grade1, double grade2){
    return (grade1 + grade2) / 2;
}


   public void displayInfo(){
    System.out.println("courseCode : " + this.courseCode);
    System.out.println("title : " + this.title);
    System.out.println("cridit : " + this.cridit);
    System.out.println("maxStudents : " + this.maxStudents);
    System.out.println("enrolledStudent : " + this.enrolledStudent);
   }


}
