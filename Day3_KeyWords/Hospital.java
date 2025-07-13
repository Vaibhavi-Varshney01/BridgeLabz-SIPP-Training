package Day3_KeyWords;
public class Hospital {
 
    static class Patient {
        
        private final String patientID;

         
        private String name;
        private int age;
        private String ailment;
 
        static String hospitalName = "CityCare Hospital";
 
        static int totalPatients = 0;

         
        public Patient(String patientID, String name, int age, String ailment) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            totalPatients++;
        }
 
        public static void getTotalPatients() {
            System.out.println("\n👥 Total Patients Admitted: " + totalPatients);
        }

        
        public void displayPatientDetails() {
            if (this instanceof Patient) {
                System.out.println("\n--- Patient Details ---");
                System.out.println("Hospital Name : " + hospitalName);
                System.out.println("Patient ID    : " + patientID);
                System.out.println("Name          : " + name);
                System.out.println("Age           : " + age);
                System.out.println("Ailment       : " + ailment);
            } else {
                System.out.println("❌ Invalid Patient object.");
            }
        }
    }

 
    public static void main(String[] args) {
         
        Patient p1 = new Patient("P101", "Vaibhavi Sharma", 22, "Flu");
        Patient p2 = new Patient("P102", "Aryan Mehta", 28, "Fracture");
 
        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();

     
        System.out.println("\nIs p1 a Patient? " + (p1 instanceof Patient));
    }
}
