package Day4_Aggregation;

import java.util.ArrayList;

 
class Patient {
 String name;
 ArrayList<Doctor> consultedDoctors;

 Patient(String name) {
     this.name = name;
     consultedDoctors = new ArrayList<>();
 }

 void addDoctor(Doctor d) {
     consultedDoctors.add(d);
 }

 void showDoctors() {
     System.out.println("Patient " + name + " has consulted:");
     for (Doctor d : consultedDoctors) {
         System.out.println("- Dr. " + d.name);
     }
 }
}

 
class Doctor {
 String name;
 ArrayList<Patient> patients;

 Doctor(String name) {
     this.name = name;
     patients = new ArrayList<>();
 }

 void consult(Patient p) {
     System.out.println("Dr. " + name + " is consulting patient " + p.name);
     patients.add(p);
     p.addDoctor(this); 
 }

 void showPatients() {
     System.out.println("Dr. " + name + " has consulted:");
     for (Patient p : patients) {
         System.out.println("- " + p.name);
     }
 }
}

class Hospital {
 String name;
 ArrayList<Doctor> doctors;
 ArrayList<Patient> patients;

 Hospital(String name) {
     this.name = name;
     doctors = new ArrayList<>();
     patients = new ArrayList<>();
 }

 void addDoctor(Doctor d) {
     doctors.add(d);
 }

 void addPatient(Patient p) {
     patients.add(p);
 }

 void showAllDoctors() {
     System.out.println("\nDoctors in " + name + ":");
     for (Doctor d : doctors) {
         System.out.println("- Dr. " + d.name);
     }
 }

 void showAllPatients() {
     System.out.println("\nPatients in " + name + ":");
     for (Patient p : patients) {
         System.out.println("- " + p.name);
     }
 }
}

 
public class HospitalMgmt {
 public static void main(String[] args) {
      
     Hospital apollo = new Hospital("Apollo Hospital");
 
     Doctor d1 = new Doctor("Vaibhavi");
     Doctor d2 = new Doctor("Rohan");
 
     Patient p1 = new Patient("Meena");
     Patient p2 = new Patient("Suresh");
 
     apollo.addDoctor(d1);
     apollo.addDoctor(d2);
     apollo.addPatient(p1);
     apollo.addPatient(p2);

      
     d1.consult(p1);
     d1.consult(p2);
     d2.consult(p1);
 
     apollo.showAllDoctors();
     apollo.showAllPatients();
 
     d1.showPatients();
     d2.showPatients();
 
     p1.showDoctors();
     p2.showDoctors();
 }
}
