package Day3_KeyWords;
public class Vehicles {
 
    static class Vehicle {
     
        private final String registrationNumber;
 
        private String ownerName;
        private String vehicleType;

      
        static double registrationFee = 1500.0;
 
        public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }
 
        public static void updateRegistrationFee(double newFee) {
            if (newFee > 0) {
                registrationFee = newFee;
                System.out.println(" Registration fee updated to ₹" + registrationFee);
            } else {
                System.out.println(" Invalid fee amount.");
            }
        }

     
        public void displayVehicleDetails() {
            if (this instanceof Vehicle) {
                System.out.println("\n--- Vehicle Registration Details ---");
                System.out.println("Registration Number : " + registrationNumber);
                System.out.println("Owner Name          : " + ownerName);
                System.out.println("Vehicle Type        : " + vehicleType);
                System.out.println("Registration Fee    : ₹" + registrationFee);
            } else {
                System.out.println("Not a valid Vehicle object.");
            }
        }
    }

    
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("UP32 AB 1234", "Vaibhavi Sharma", "Car");
        Vehicle v2 = new Vehicle("DL01 CD 5678", "Aryan Mehta", "Bike");

        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
 
        Vehicle.updateRegistrationFee(2000);

       
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
 
        System.out.println("\n Is v1 a Vehicle? " + (v1 instanceof Vehicle));
    }
}
