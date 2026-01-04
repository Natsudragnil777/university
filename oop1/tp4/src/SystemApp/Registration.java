package SystemApp;

import Models.Student;
import Models.Course;

public class Registration {

    private static int counter = 1;  
    private int registrationId;

    private Student student;
    private Course course;
    private String status;

    public Registration(Student student, Course course, String status){
        this.registrationId = counter++;
        this.student = student;
        this.course = course;
        this.status = status;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public static int getCounter() {
    return counter;
   }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cancelRegistration(){
        this.status = "Canceled";
    }

    public void displayInfo() {
    System.out.println("Registration ID : " + registrationId);
    System.out.println("Student : " + student.getName() + " " + student.getSurname());
    System.out.println("Course : " + course.getTitle());
    System.out.println("Status : " + status);
    
}

}




