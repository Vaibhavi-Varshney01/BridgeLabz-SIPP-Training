package Day6_Encapsulation;
import java.util.*;
 
interface Department {
 void assignDepartment(String departmentName);
 String getDepartmentDetails();
}
 
abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 
 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }
 
 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }
 
 public abstract double calculateSalary();
 
 public void displayDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: ₹" + baseSalary);
 }
}
 
class FullTimeEmployee extends Employee implements Department {
 private String departmentName;
 private double fixedBonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
     super(employeeId, name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + fixedBonus;
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.departmentName = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Department: " + departmentName;
 }

 public void displayRole() {
     System.out.println("Role: Full-Time Employee");
     displayDetails();
     System.out.println("Bonus: ₹" + fixedBonus);
     System.out.println("Total Salary: ₹" + calculateSalary());
     System.out.println(getDepartmentDetails());
 }
}
 
class PartTimeEmployee extends Employee implements Department {
 private String departmentName;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
     super(employeeId, name, baseSalary);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.departmentName = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Department: " + departmentName;
 }

 public void displayRole() {
     System.out.println("Role: Part-Time Employee");
     displayDetails();
     System.out.println("Hours Worked: " + hoursWorked);
     System.out.println("Hourly Rate: ₹" + hourlyRate);
     System.out.println("Total Salary: ₹" + calculateSalary());
     System.out.println(getDepartmentDetails());
 }
}

 
public class EmployeeMgmt {
 public static void main(String[] args) {
  
     List<Employee> employeeList = new ArrayList<>();

   
     FullTimeEmployee fte = new FullTimeEmployee(101, "Vaibhavi Sharma", 50000, 10000);
     fte.assignDepartment("Software Development");

     
     PartTimeEmployee pte = new PartTimeEmployee(102, "Rohan Mehta", 0, 40, 500);
     pte.assignDepartment("Support");

     employeeList.add(fte);
     employeeList.add(pte);
 
     for (Employee emp : employeeList) {
         System.out.println("=================================");
         if (emp instanceof FullTimeEmployee) {
             ((FullTimeEmployee) emp).displayRole();
         } else if (emp instanceof PartTimeEmployee) {
             ((PartTimeEmployee) emp).displayRole();
         }
     }
 }
}
