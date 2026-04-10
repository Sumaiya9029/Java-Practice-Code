
// 18. Railway Reservation System

// Create a class RailwayReservation. Use synchronization to
// avoid double booking.
// Output: &#39;Ticket booked successfully&#39; or &#39;No tickets available&#39;



public class _18Eighteen {

    int availableTickets = 1;

    // Synchronized method to avoid double booking
    synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            availableTickets--;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }

    public static void main(String[] args) {

        _18Eighteen obj = new _18Eighteen();

        // Create threads
        Thread t1 = new Thread(() -> obj.bookTicket("Passenger 1"));
        Thread t2 = new Thread(() -> obj.bookTicket("Passenger 2"));

        // Start threads
        t1.start();
        t2.start();
    }
}