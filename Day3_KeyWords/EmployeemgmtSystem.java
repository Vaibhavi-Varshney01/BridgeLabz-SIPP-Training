package Day3_KeyWords;
public class EmployeemgmtSystem {
 
    static class Employee {
        
        private final int id;
 
        private String name;
        private String designation;
 
        static String companyName = "CodeVerse Solutions";
 
        static int totalEmployees = 0;

         
        public Employee(int id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            totalEmployees++;
        }
 
        public static void displayTotalEmployees() {
            System.out.println("\n👥 Total Employees in " + companyName + ": " + totalEmployees);
        }
 
        public void displayEmployeeDetails() {
            if (this instanceof Employee) {
                System.out.println("\n--- Employee Details ---");
                System.out.println("ID          : " + id);
                System.out.println("Name        : " + name);
                System.out.println("Designation : " + designation);
                System.out.println("Company     : " + companyName);
            } else {
                System.out.println("Not a valid Employee instance.");
            }
        }
    }

   
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Vaibhavi Sharma", "Software Engineer");
        Employee emp2 = new Employee(102, "Aryan Mehta", "Data Analyst");
 
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
 
        Employee.displayTotalEmployees();
 
        System.out.println("\nIs emp1 an instance of Employee? " + (emp1 instanceof Employee));
    }
}
