package Day6_Encapsulation;
import java.util.*;

 
interface Taxable {
 double calculateTax();
 String getTaxDetails();
}
 
abstract class Product {
 private int productId;
 private String name;
 private double price;

 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }
 
 public int getProductId() {
     return productId;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }
 
 public abstract double calculateDiscount();

 public void displayProduct() {
     System.out.println("Product ID: " + productId);
     System.out.println("Name: " + name);
     System.out.println("Base Price: ₹" + price);
 }
}
 
class Electronics extends Product implements Taxable {
 private int warrantyMonths;

 public Electronics(int productId, String name, double price, int warrantyMonths) {
     super(productId, name, price);
     this.warrantyMonths = warrantyMonths;
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.1; // 10% discount
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.18; // 18% GST
 }

 @Override
 public String getTaxDetails() {
     return "Electronics GST: 18%";
 }

 public void displayCategory() {
     System.out.println("Category: Electronics");
     displayProduct();
     System.out.println("Warranty: " + warrantyMonths + " months");
 }
}

 
class Clothing extends Product implements Taxable {
 private String size;

 public Clothing(int productId, String name, double price, String size) {
     super(productId, name, price);
     this.size = size;
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.2; // 20% discount
 }

 @Override
 public double calculateTax() {
     return getPrice() * 0.05; // 5% tax
 }

 @Override
 public String getTaxDetails() {
     return "Clothing Tax: 5%";
 }

 public void displayCategory() {
     System.out.println("Category: Clothing");
     displayProduct();
     System.out.println("Size: " + size);
 }
}

 
class Groceries extends Product {
 private double weight;  

 public Groceries(int productId, String name, double price, double weight) {
     super(productId, name, price);
     this.weight = weight;
 }

 @Override
 public double calculateDiscount() {
     return getPrice() * 0.05; 
 }

 public void displayCategory() {
     System.out.println("Category: Groceries");
     displayProduct();
     System.out.println("Weight: " + weight + " kg");
 }
}

 
public class ECommerce{
 
 public static void printFinalPrice(List<Product> products) {
     for (Product product : products) {
         System.out.println("\n----------------------------");
         if (product instanceof Electronics) {
             Electronics e = (Electronics) product;
             e.displayCategory();
             double tax = e.calculateTax();
             double discount = e.calculateDiscount();
             double finalPrice = e.getPrice() + tax - discount;
             System.out.println(e.getTaxDetails());
             System.out.println("Discount: ₹" + discount);
             System.out.println("Final Price: ₹" + finalPrice);
         } else if (product instanceof Clothing) {
             Clothing c = (Clothing) product;
             c.displayCategory();
             double tax = c.calculateTax();
             double discount = c.calculateDiscount();
             double finalPrice = c.getPrice() + tax - discount;
             System.out.println(c.getTaxDetails());
             System.out.println("Discount: ₹" + discount);
             System.out.println("Final Price: ₹" + finalPrice);
         } else if (product instanceof Groceries) {
             Groceries g = (Groceries) product;
             g.displayCategory();
             double discount = g.calculateDiscount();
             double finalPrice = g.getPrice() - discount;
             System.out.println("Discount: ₹" + discount);
             System.out.println("Final Price: ₹" + finalPrice);
         }
     }
 }

 public static void main(String[] args) {
     List<Product> cart = new ArrayList<>();

     cart.add(new Electronics(101, "Smartphone", 25000, 12));
     cart.add(new Clothing(102, "Jeans", 2000, "M"));
     cart.add(new Groceries(103, "Rice", 600, 5));

     printFinalPrice(cart);
 }
}
