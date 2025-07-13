package Day1_ClassesAndObjects;

class MovieTicket {
    
    String movieName;
    String seatNumber;
    double price;
 
    MovieTicket() {
        movieName = "Not Booked";
        seatNumber = "None";
        price = 0.0;
    }
 
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("✅ Ticket booked successfully!");
    }


    void displayTicket() {
        System.out.println("\n--- Movie Ticket Details ---");
        System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : ₹" + price);
    }
}
