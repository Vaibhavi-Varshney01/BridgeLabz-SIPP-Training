package Day3_KeyWords;
public class ShoppingCartSystem {
 
    static class Product {
        private final String productID;
 
        private String productName;
        private double price;
        private int quantity;

  
        static double discount = 10.0;  

       
        public Product(String productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

         
        public static void updateDiscount(double newDiscount) {
            if (newDiscount >= 0 && newDiscount <= 100) {
                discount = newDiscount;
                System.out.println("✅ Discount updated to " + discount + "%");
            } else {
                System.out.println("❌ Invalid discount value!");
            }
        }
 
        public double getTotalPrice() {
            double total = price * quantity;
            double discounted = total - (total * discount / 100);
            return discounted;
        }
 
        public void displayProductDetails() {
            if (this instanceof Product) {
                System.out.println("\n--- Product Details ---");
                System.out.println("Product ID   : " + productID);
                System.out.println("Name         : " + productName);
                System.out.println("Price        : ₹" + price);
                System.out.println("Quantity     : " + quantity);
                System.out.println("Discount     : " + discount + "%");
                System.out.println("Total Price  : ₹" + getTotalPrice());
            } else {
                System.out.println("❌ Not a valid Product object.");
            }
        }
    }
 
    public static void main(String[] args) {
        
        System.out.println("🛒 Current Discount: " + Product.discount + "%");
 
        Product p1 = new Product("P101", "Wireless Mouse", 799, 2);
        Product p2 = new Product("P102", "Mechanical Keyboard", 2499, 1);

         
        p1.displayProductDetails();
        p2.displayProductDetails();

      
        Product.updateDiscount(15);
 
        p1.displayProductDetails();
        p2.displayProductDetails();

        
        System.out.println("\nIs p1 a Product? " + (p1 instanceof Product));
    }
}
