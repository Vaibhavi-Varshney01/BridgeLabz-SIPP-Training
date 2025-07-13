package Day5_Inheritance;
class Employee {
    String name;
    int id;
    double salary;
 
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

 
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

 
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

 
class Intern extends Employee {
    int duration;  

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

 
public class EmployeeMgmt{
    public static void main(String[] args) {
         
        Manager m1 = new Manager("Amit", 101, 90000.0, 5);
        Developer d1 = new Developer("Priya", 102, 75000.0, "Java");
        Intern i1 = new Intern("Ravi", 103, 20000.0, 6);
 
        System.out.println("=== Manager Details ===");
        m1.displayDetails();

        System.out.println("\n=== Developer Details ===");
        d1.displayDetails();

        System.out.println("\n=== Intern Details ===");
        i1.displayDetails();
    }
}
