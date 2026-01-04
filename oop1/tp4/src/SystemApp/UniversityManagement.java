package SystemApp;

import Models.Student;
import Models.Professor;
import Models.Course;

public class UniversityManagement {


    private Student student1, student2, student3;
    private Professor professor1, professor2;
    private Course course1, course2;
    private Registration registration1, registration2, registration3;


    public void createStudents() {
        student1 = new Student(1, "Ali", "Ben", "MAT001", "ali@email.com", 15.5);
        student2 = new Student(2, "Sara", "Ben", "MAT002", "sara@email.com", 16.0);
        student3 = new Student(3, "Omar", "Ben", "MAT003", 14.5); 
    }

    

    public void createProfessors() {
        professor1 = new Professor("CS", 10, 1, "Dr", "Ahmed");
        professor2 = new Professor("Math", 8, 2, "Dr", "Laila");

    }


    public void createCourses() {
        course1 = new Course(101, "Programming", 3, 30, 0);
        course2 = new Course(102, "Mathematics", 4, 25, 0);
    }


    public void createRegistrations() {
        registration1 = new Registration(student1, course1, "Active");
        registration2 = new Registration(student2, course2, "Active");
        registration3 = new Registration(student3, course1, "Active");
    }


 public int getTotalRegisteredStudents() {
    return Registration.getCounter() -1 ;
}

public int getTotalCourses() {
    return Course.getCourseCounter();
}

  
     public void displayAll() {
        System.out.println(" ####### Professors  #######");
        professor1.displayInfo();
        professor2.displayInfo();

        System.out.println(" ####### Students #######");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        System.out.println(" ####### Courses #######");
        course1.displayInfo();
         course2.displayInfo();

        System.out.println(" ####### Registrations ####### ");
        registration1.displayInfo();
        registration2.displayInfo();
        registration3.displayInfo();
    }
}




