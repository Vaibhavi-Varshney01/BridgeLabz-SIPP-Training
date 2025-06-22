import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeam Member " + (i + 1) + ":");

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25.0) {
                status[i] = "Normal";
            } else if (bmi[i] < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\n BMI Report");
        for (int i = 0; i < n; i++) {
            System.out.printf("Team Member %d:\n", (i + 1));
            System.out.printf("Height: %.2f m\n", height[i]);
            System.out.printf("Weight: %.2f kg\n", weight[i]);
            System.out.printf("BMI: %.2f\n", bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}
