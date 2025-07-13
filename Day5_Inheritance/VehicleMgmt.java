package Day5_Inheritance;

class Vehicle {
 int maxSpeed;
 String fuelType;

 Vehicle(int maxSpeed, String fuelType) {
     this.maxSpeed = maxSpeed;
     this.fuelType = fuelType;
 }

 void displayInfo() {
     System.out.println("Max Speed: " + maxSpeed + " km/h");
     System.out.println("Fuel Type: " + fuelType);
 }
}

 
class Car extends Vehicle {
 int seatCapacity;

 Car(int maxSpeed, String fuelType, int seatCapacity) {
     super(maxSpeed, fuelType);
     this.seatCapacity = seatCapacity;
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Seat Capacity: " + seatCapacity);
 }
}

 
class Truck extends Vehicle {
 int loadCapacity; 

 Truck(int maxSpeed, String fuelType, int loadCapacity) {
     super(maxSpeed, fuelType);
     this.loadCapacity = loadCapacity;
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity + " kg");
 }
}
 
class Motorcycle extends Vehicle {
 String type;  

 Motorcycle(int maxSpeed, String fuelType, String type) {
     super(maxSpeed, fuelType);
     this.type = type;
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Motorcycle Type: " + type);
 }
}
 
public class VehicleMgmt {
 public static void main(String[] args) {
      
     Vehicle[] vehicles = new Vehicle[3];

     vehicles[0] = new Car(180, "Petrol", 5);
     vehicles[1] = new Truck(120, "Diesel", 8000);
     vehicles[2] = new Motorcycle(150, "Petrol", "Sport");
 
     for (int i = 0; i < vehicles.length; i++) {
         System.out.println("\n=== Vehicle " + (i + 1) + " Info ===");
         vehicles[i].displayInfo();   
     }
 }
}

