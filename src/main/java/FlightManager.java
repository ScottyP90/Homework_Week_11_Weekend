import java.util.ArrayList;

public class FlightManager {
//    has methods that take in Flights
//    Flights have a Plane
//    Plane has a PlaneType
//    PlaneType has a Weight

//    Flights also have a list of passengers
//    Half of that weight divided by the number of passengers on the Flight

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight (){
        return this.flight;
    }

    public void addPassengerToFlight( Passenger passenger) {
        Flight chosenFlight = this.flight;
        chosenFlight.bookSeat(passenger);
    }

    public int storageCapacity() {
        Flight flight = this.flight;
        Plane plane = flight.getPlane();
        return plane.getWeight() / 2;
    }

    public double passengerStorage() {
        int storageCap =  this.storageCapacity();
        int numberOfPassengers = this.flight.passengerCount();
        return storageCap / numberOfPassengers;
    }


    public int checkWightOfBaggage(Passenger passenger) {
        int bagWight = passenger.getBags();
        return bagWight * 2;
    }

    public int checkWightOfBaggageOnFlight(Flight flight) {
        int baggageTotal = 0;
        for (Passenger passenger: flight.getPassengers()) {
            baggageTotal += this.checkWightOfBaggage(passenger);
        }
        return baggageTotal;
    }

    public double checkBagageStorageRemainingOnFlight(Flight flight) {
        return storageCapacity() - checkWightOfBaggageOnFlight(flight);
    }
}
