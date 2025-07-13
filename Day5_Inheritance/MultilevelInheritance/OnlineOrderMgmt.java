package Day5_Inheritance.MultilevelInheritance;
 
class Order {
 String orderId;
 String orderDate;

 Order(String orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 String getOrderStatus() {
     return "Order placed";
 }

 void displayInfo() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Order Date: " + orderDate);
     System.out.println("Status: " + getOrderStatus());
 }
}
 
class ShippedOrder extends Order {
 String trackingNumber;

 ShippedOrder(String orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 String getOrderStatus() {
     return "Order shipped";
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Tracking Number: " + trackingNumber);
 }
}

 
class DeliveredOrder extends ShippedOrder {
 String deliveryDate;

 DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 @Override
 String getOrderStatus() {
     return "Order delivered";
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Delivery Date: " + deliveryDate);
 }
}
 
public class OnlineOrderMgmt {
 public static void main(String[] args) {
      
     Order order = new Order("ORD101", "2025-07-10");
     ShippedOrder shipped = new ShippedOrder("ORD102", "2025-07-11", "TRK123456");
     DeliveredOrder delivered = new DeliveredOrder("ORD103", "2025-07-12", "TRK654321", "2025-07-13");

     System.out.println("=== Basic Order ===");
     order.displayInfo();

     System.out.println("\n=== Shipped Order ===");
     shipped.displayInfo();

     System.out.println("\n=== Delivered Order ===");
     delivered.displayInfo();
 }
}
