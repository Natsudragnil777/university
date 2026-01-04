import SystemApp.UniversityManagement;

public class University {

    public static void main(String[] args) {

  
        UniversityManagement um = new UniversityManagement();
        um.createStudents();
        um.createProfessors();
        um.createCourses();
        um.createRegistrations();
        System.out.println("Total registered students: " + um.getTotalRegisteredStudents());
        System.out.println("Total courses: " + um.getTotalCourses());
        um.displayAll();
    }
}
