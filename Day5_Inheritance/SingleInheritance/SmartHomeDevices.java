package Day5_Inheritance.SingleInheritance;
 
class Device {
 String deviceId;
 String status;   

 Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}

 
class Thermostat extends Device {
 int temperatureSetting;

 Thermostat(String deviceId, String status, int temperatureSetting) {
     super(deviceId, status);  // initialize superclass fields
     this.temperatureSetting = temperatureSetting;
 }

 @Override
 void displayStatus() {
     super.displayStatus();   
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}

 
public class SmartHomeDevices {
 public static void main(String[] args) {
      
     Thermostat livingRoomThermostat = new Thermostat("THM101", "On", 24);
 
     System.out.println("=== Thermostat Device Status ===");
     livingRoomThermostat.displayStatus();
 }
}

