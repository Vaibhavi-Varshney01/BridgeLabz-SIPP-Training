package Workshop.UniversityMgmtSystem;
//import java.util.*;

public class UniversitySystem {
    public static void main(String[] args) {

         
        Course ds = new Course("C101", "Data Structures", 3);
        Course ml = new Course("C102", "Machine Learning", 4);

        
        UnderGraduate u1 = new UnderGraduate("Vaibhavi", "UG01");
        PostGraduate p1 = new PostGraduate("Ankit", "PG01");

  
        Faculty prof = new Faculty("Dr. Sharma", "F001");
 
        Enrollment.enrollStudentInCourse(u1, ds);
        Enrollment.enrollStudentInCourse(u1, ml);
        Enrollment.enrollStudentInCourse(p1, ml);
 
        prof.assignGrade(u1, ds, 8.5);
        prof.assignGrade(u1, ml, 9.0);
        prof.assignGrade(p1, ml, 9.2);

    
        u1.viewTranscript();
        p1.viewTranscript();

 
        System.out.println("\nGPA Comparison:");
        System.out.println(u1 + " GPA > " + p1 + " ? " + (u1.getGPA() > p1.getGPA()));
    }
}

