package Day2_ConstructorsAccessModifiers;
public class UniversityApp {
 
    static class Student {
        public int rollNumber;          
        protected String name;         
        private double CGPA;            

        
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }
 
        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double newCGPA) {
            if (newCGPA >= 0 && newCGPA <= 10) {
                this.CGPA = newCGPA;
            } else {
                System.out.println(" Invalid CGPA. Must be between 0 and 10.");
            }
        }

        public void displayDetails() {
            System.out.println("\n--- Student Details ---");
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name        : " + name);
            System.out.println("CGPA        : " + getCGPA());
        }
    }

    
    static class PostgraduateStudent extends Student {

        private String thesisTopic;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
            super(rollNumber, name, CGPA);
            this.thesisTopic = thesisTopic;
        }

        public void displayPGDetails() {
            System.out.println("\n--- PG Student Details ---");
            System.out.println("Roll Number   : " + rollNumber);    
            System.out.println("Name          : " + name);          
            System.out.println("CGPA          : " + getCGPA());    
            System.out.println("Thesis Topic  : " + thesisTopic);
        }
    }

    public static void main(String[] args) {
         
        Student s1 = new Student(101, "Vaibhavi", 8.6);
        s1.displayDetails();

         
        s1.setCGPA(9.1);
        s1.displayDetails();

       
        PostgraduateStudent pg = new PostgraduateStudent(202, "Aryan", 9.4, "AI in Healthcare");
        pg.displayPGDetails();

         
    }
}
