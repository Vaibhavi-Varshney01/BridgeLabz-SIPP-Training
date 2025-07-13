package Day1_ClassesAndObjects;
import java.util.Scanner;

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
        System.out.println("----- Employee Details -----");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : ₹" + salary);
    }
}

public class Question1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
 
        Employee emp = new Employee(name, id, salary);
 
        emp.displayDetails();
    }
}
