package Day2_Constructors;
public class CourseApp {

    
    static class Course {
         
        String courseName;
        String duration;
        double fee;
 
        static String instituteName = "Tech Institute";  // default name
 
        public Course(String courseName, String duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        
        public void displayCourseDetails() {
            System.out.println("\n--- Course Details ---");
            System.out.println("Course Name   : " + courseName);
            System.out.println("Duration      : " + duration);
            System.out.println("Fee           : ₹" + fee);
            System.out.println("Institute     : " + instituteName);
        }
 
        public static void updateInstituteName(String newName) {
            instituteName = newName;
            System.out.println("✅ Institute name updated to: " + instituteName);
        }
    }
 
    public static void main(String[] args) {
       
        Course c1 = new Course("Java Programming", "3 Months", 5000);
        Course c2 = new Course("Web Development", "4 Months", 7000);
 
        c1.displayCourseDetails();
        c2.displayCourseDetails();
 
        Course.updateInstituteName("CodeChamp Academy"); 
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
