import java.util.*;
public class NumberFormat {
    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Converted number is: " + number);
    }
    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number inside try: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert into number: ");
        String userInput = sc.nextLine();

        System.out.println("\nCalling generateException() — this may crash without try-catch");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: NumberFormatException - " + e.getMessage());
        } 

        System.out.println("\nNow calling handleException() — safely handles everything");
        handleException(userInput);
        sc.close();
    }
}