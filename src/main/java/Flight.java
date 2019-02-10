import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public int seatsAvalable(){
        int freeSeats = plane.getCapacity() - this.passengerCount();
        return freeSeats;
    }


    public void bookSeat(Passenger passenger) {
        if(seatsAvalable() > 0){
            this.passengers.add(passenger);
        }
    }
}
