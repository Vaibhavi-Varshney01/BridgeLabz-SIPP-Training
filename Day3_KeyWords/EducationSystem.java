package Day3_KeyWords;
public class EducationSystem {
 
    static class Student {
        
        private final int rollNumber;

        
        private String name;
        private String grade;

        
        static String universityName = "GLA University";

     
        static int totalStudents = 0;
 
        public Student(int rollNumber, String name, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
            totalStudents++;
        }
        public static void displayTotalStudents() {
            System.out.println("\n Total Students Enrolled: " + totalStudents);
        }
 
        public void updateGrade(String newGrade) {
            if (this instanceof Student) {
                this.grade = newGrade;
                System.out.println(" Grade updated for " + name);
            } else {
                System.out.println(" Invalid Student object.");
            }
        }

     
        public void displayDetails() {
            if (this instanceof Student) {
                System.out.println("\n--- Student Details ---");
                System.out.println("University   : " + universityName);
                System.out.println("Roll Number  : " + rollNumber);
                System.out.println("Name         : " + name);
                System.out.println("Grade        : " + grade);
            } else {
                System.out.println(" Not a valid Student instance.");
            }
        }
    }
 
    public static void main(String[] args) {
       
        Student s1 = new Student(101, "Vaibhavi Varshney", "A");
        Student s2 = new Student(102, "Aryan Mehta", "B");
 
        s1.displayDetails();
        s2.displayDetails();
 
        s2.updateGrade("A+");
 
        s2.displayDetails();

        Student.displayTotalStudents();
 
        System.out.println("\n Is s1 a Student? " + (s1 instanceof Student));
    }
}
