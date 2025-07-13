package Day5_Inheritance.HybridInheritance;
 
class Person {
 String name;
 int id;

 Person(String name, int id) {
     this.name = name;
     this.id = id;
 }

 void displayPersonInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

 
interface Worker {
 void performDuties();  
}

 
class Chef extends Person implements Worker {
 String specialty;

 Chef(String name, int id, String specialty) {
     super(name, id);
     this.specialty = specialty;
 }

 public void performDuties() {
     System.out.println(" Duty: Preparing " + specialty + " dishes in the kitchen.");
 }

 void displayRole() {
     System.out.println("Role: Chef");
     displayPersonInfo();
     System.out.println("Specialty: " + specialty);
     performDuties();
 }
}

 
class Waiter extends Person implements Worker {
 int tablesAssigned;

 Waiter(String name, int id, int tablesAssigned) {
     super(name, id);
     this.tablesAssigned = tablesAssigned;
 }

 public void performDuties() {
     System.out.println("Duty: Serving food and managing " + tablesAssigned + " tables.");
 }

 void displayRole() {
     System.out.println("Role: Waiter");
     displayPersonInfo();
     System.out.println("Tables Assigned: " + tablesAssigned);
     performDuties();
 }
}

 
public class RestrauntMgmt {
 public static void main(String[] args) {
     Chef chef = new Chef("Arjun", 101, "Italian");
     Waiter waiter = new Waiter("Neha", 202, 5);

     System.out.println("=== Chef Info ===");
     chef.displayRole();

     System.out.println("\n=== Waiter Info ===");
     waiter.displayRole();
 }
}
