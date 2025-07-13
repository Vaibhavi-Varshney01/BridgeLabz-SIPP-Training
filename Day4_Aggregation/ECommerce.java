package Day4_Aggregation;
import java.util.ArrayList;

 
class Product {
 String name;
 double price;

 Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 void display() {
     System.out.println("Product: " + name + ", Price: ₹" + price);
 }
}
 
class Order {
 int orderId;
 ArrayList<Product> products;
 static int idCounter = 1;

 Order() {
     this.orderId = idCounter++;
     products = new ArrayList<>();
 }

 void addProduct(Product p) {
     products.add(p);
 }

 void showOrderDetails() {
     System.out.println("\nOrder ID: " + orderId);
     double total = 0;
     for (Product p : products) {
         p.display();
         total += p.price;
     }
     System.out.println("Total Amount: ₹" + total);
 }
}

 
class Customer {
 String name;
 ArrayList<Order> orders;

 Customer(String name) {
     this.name = name;
     orders = new ArrayList<>();
 }

 void placeOrder(Order o) {
     orders.add(o);
     System.out.println("\n" + name + " placed Order ID: " + o.orderId);
 }

 void showMyOrders() {
     System.out.println("\nCustomer: " + name + " - Order History:");
     for (Order o : orders) {
         o.showOrderDetails();
     }
 }
}

 
public class ECommerce {
 public static void main(String[] args) {
     
     Product p1 = new Product("Laptop", 55000);
     Product p2 = new Product("Smartphone", 20000);
     Product p3 = new Product("Earbuds", 2000);
 
     Customer c1 = new Customer("Vaibhavi");

 
     Order order1 = new Order();
     order1.addProduct(p1);
     order1.addProduct(p3);
 
     Order order2 = new Order();
     order2.addProduct(p2);
 
     c1.placeOrder(order1);
     c1.placeOrder(order2);

     c1.showMyOrders();
 }
}
