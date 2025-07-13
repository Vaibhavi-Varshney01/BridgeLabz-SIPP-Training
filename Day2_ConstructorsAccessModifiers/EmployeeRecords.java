package Day2_ConstructorsAccessModifiers;

public class EmployeeRecords{
 
    static class Employee {
        public int employeeID;         
        protected String department;    
        private double salary;       

        
        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }
 
        public double getSalary() {
            return salary;
        }

      
        public void setSalary(double newSalary) {
            if (newSalary >= 0) {
                this.salary = newSalary;
            } else {
                System.out.println("❌ Invalid salary amount.");
            }
        }
 
        public void displayEmployeeDetails() {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Employee ID  : " + employeeID);
            System.out.println("Department   : " + department);
            System.out.println("Salary       : ₹" + salary);
        }
    }
 
    static class Manager extends Employee {

        private String projectName;

        public Manager(int employeeID, String department, double salary, String projectName) {
            super(employeeID, department, salary);
            this.projectName = projectName;
        }

        public void displayManagerDetails() {
            System.out.println("\n--- Manager Details ---");
            System.out.println("Employee ID  : " + employeeID);     // public
            System.out.println("Department   : " + department);     // protected
            System.out.println("Salary       : ₹" + getSalary());   // private → via getter
            System.out.println("Project Name : " + projectName);
        }
    }
 
    public static void main(String[] args) {
     
        Employee emp = new Employee(101, "HR", 35000);
        emp.displayEmployeeDetails();
 
        emp.setSalary(40000);
        System.out.println("Updated Salary: ₹" + emp.getSalary());

        
        Manager mgr = new Manager(201, "IT", 60000, "Website Revamp");
        mgr.displayManagerDetails();
    }
}
