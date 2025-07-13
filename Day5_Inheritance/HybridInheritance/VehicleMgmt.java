package Day5_Inheritance.HybridInheritance;

class Vehicle {
 String model;
 int maxSpeed;

 Vehicle(String model, int maxSpeed) {
     this.model = model;
     this.maxSpeed = maxSpeed;
 }

 void displayDetails() {
     System.out.println("Model: " + model);
     System.out.println("Max Speed: " + maxSpeed + " km/h");
 }
}
 
interface Refuelable {
 void refuel();   
}

 
class ElectricVehicle extends Vehicle {
 int batteryLevel;  

 ElectricVehicle(String model, int maxSpeed, int batteryLevel) {
     super(model, maxSpeed);
     this.batteryLevel = batteryLevel;
 }

 void charge() {
     System.out.println("🔌 Charging... Battery level now at " + batteryLevel + "%");
 }

 void displayType() {
     System.out.println("Type: Electric Vehicle");
     displayDetails();
     charge();
 }
}

 
class PetrolVehicle extends Vehicle implements Refuelable {
 int fuelLevel; // in liters

 PetrolVehicle(String model, int maxSpeed, int fuelLevel) {
     super(model, maxSpeed);
     this.fuelLevel = fuelLevel;
 }

 public void refuel() {
     System.out.println("⛽ Refueling... Fuel level now at " + fuelLevel + " liters");
 }

 void displayType() {
     System.out.println("Type: Petrol Vehicle");
     displayDetails();
     refuel();
 }
}

 
public class VehicleMgmt {
 public static void main(String[] args) {
     ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 80);
     PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 35);

     System.out.println("=== Electric Vehicle Info ===");
     ev.displayType();

     System.out.println("\n=== Petrol Vehicle Info ===");
     pv.displayType();
 }
}

