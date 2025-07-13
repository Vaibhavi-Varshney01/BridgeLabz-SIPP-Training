package Day1_ClassesAndObjects;
import java.util.Scanner;

class Item {
   
    int itemCode;
    String itemName;
    double price;

   
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

 
    void displayDetails() {
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }
 
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class TrackOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
 
        Item item = new Item(code, name, price);
 
        item.displayDetails();
 
        System.out.print("\nEnter quantity to purchase: ");
        int quantity = sc.nextInt();

        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Total Cost for " + quantity + " item(s): ₹" + totalCost);

        sc.close();
    }
}
