package Workshop.CabInvoiceGenerator;
public class Ride {
    private String rideType;  
    private double distance;   
    private int time;          
 
    private static final double NORMAL_COST_PER_KM = 10;
    private static final double NORMAL_COST_PER_MIN = 1;
    private static final double NORMAL_MIN_FARE = 50;

   
    private static final double PREMIUM_COST_PER_KM = 15;
    private static final double PREMIUM_COST_PER_MIN = 2;
    private static final double PREMIUM_MIN_FARE = 80;

    public Ride(String rideType, double distance, int time) {
        this.rideType = rideType.toUpperCase();
        this.distance = distance;
        this.time = time;
    }

    public double calculateFare() {
        if (rideType.equals("PREMIUM")) {
            double fare = (distance * PREMIUM_COST_PER_KM) + (time * PREMIUM_COST_PER_MIN);
            return Math.max(fare, PREMIUM_MIN_FARE);
        } else {
            double fare = (distance * NORMAL_COST_PER_KM) + (time * NORMAL_COST_PER_MIN);
            return Math.max(fare, NORMAL_MIN_FARE);
        }
    }
}
