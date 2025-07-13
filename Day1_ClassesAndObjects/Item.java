package Day1_ClassesAndObjects;

import java.util.*;

public class Item{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Shopping Cart Menu ====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart and Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    cart.add(new CartItem(name, price, qty));
                    System.out.println("✅ Item added to cart.");
                    break;

                case 2:
                    
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = false;

                    Iterator<CartItem> iterator = cart.iterator();
                    while (iterator.hasNext()) {
                        CartItem item = iterator.next();
                        if (item.itemName.equalsIgnoreCase(removeName)) {
                            iterator.remove();
                            removed = true;
                            System.out.println("Item removed from cart.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("⚠️ Item not found in cart.");
                    }
                    break;

                case 3:
         
                    double total = 0;
                    System.out.println("\n--- Cart Items ---");
                    for (CartItem item : cart) {
                        System.out.println(item.itemName + " | ₹" + item.price + " x " + item.quantity + " = ₹" + item.getTotalPrice());
                        total += item.getTotalPrice();
                    }
                    System.out.println("Total Cost = ₹" + total);
                    break;

                case 4:
                
                    System.out.println("🛒 Exiting... Thanks for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}

