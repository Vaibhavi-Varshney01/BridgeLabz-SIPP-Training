package Day2_Constructors;
public class VehicleApp {

   
    static class Vehicle {
         
        String ownerName;
        String vehicleType;
 
        static double registrationFee = 5000.0;  // default fee

      
        public Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }
 
        public void displayVehicleDetails() {
            System.out.println("\n--- Vehicle Details ---");
            System.out.println("Owner Name     : " + ownerName);
            System.out.println("Vehicle Type   : " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
 
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
            System.out.println("✅ Registration Fee Updated to: ₹" + registrationFee);
        }
    }

    
    public static void main(String[] args) {
 
        Vehicle v1 = new Vehicle("Vaibhavi", "Scooter");
        Vehicle v2 = new Vehicle("Aryan", "Car");

      
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

   
        Vehicle.updateRegistrationFee(6000.0);
 
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
