package Workshop.CabInvoiceGenerator;
public class InvoiceGenerator {

    public void generateInvoice(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += ride.calculateFare();
        }

        int totalRides = rides.length;
        double avgFare = totalFare / totalRides;

        System.out.println("===== CAB INVOICE =====");
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Total Fare: ₹" + totalFare);
        System.out.println("Average Fare per Ride: ₹" + avgFare);
        System.out.println("=======================");
    }

    public static void main(String[] args) {
      
        Ride ride1 = new Ride("NORMAL", 3.0, 5);
        Ride ride2 = new Ride("PREMIUM", 10.0, 15);
        Ride ride3 = new Ride("NORMAL", 0.5, 2);
        Ride ride4 = new Ride("PREMIUM", 7.0, 10);

       
        Ride[] rides = { ride1, ride2, ride3, ride4 };
 
        InvoiceGenerator invoice = new InvoiceGenerator();
        invoice.generateInvoice(rides);
    }
}
