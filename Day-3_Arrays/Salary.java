import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        int[] yearsOfService = new int[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter current salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] >= 0) break;
                System.out.println("Invalid salary. Please enter a non-negative number.");
            }

            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextInt();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid input. Please enter a non-negative number.");
            }


            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d:\n", (i + 1));
            System.out.printf("Old Salary: %.2f\n", salary[i]);
            System.out.printf("Years of Service: %d\n", yearsOfService[i]);
            System.out.printf("Bonus: %.2f\n", bonus[i]);
            System.out.printf("New Salary: %.2f\n\n", newSalary[i]);
        }

        System.out.println("=== Company Summary ===");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}
