import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA172);
        passenger1 = new Passenger("Scotty", 1, "none");
        passenger2 = new Passenger("Alzo", 2, "none");
        flight = new Flight(plane, "G23I", "London", "Glasgow","10:00");
        flightManager= new FlightManager(flight);
    }

    @Test
    public void getFlightAddedToFlightManager() {
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void canCheckFlightStorageCapacity() {
        assertEquals(10, flightManager.storageCapacity());
    }

    @Test
    public void canCheckPassengerStorage() {
        flightManager.addPassengerToFlight(passenger1);
        flightManager.addPassengerToFlight(passenger2);
        assertEquals(5.0, flightManager.passengerStorage(),1.00);
    }

    @Test
    public void canCheckWightOfPassengerBaggage() {
        assertEquals(4, flightManager.checkWightOfBaggage(passenger2));
    }

    @Test
    public void canCheckWightOfPassengersBaggageOnFlight() {
        flightManager.addPassengerToFlight(passenger1);
        flightManager.addPassengerToFlight(passenger2);
        assertEquals(6, flightManager.checkWightOfBaggageOnFlight(flight));
    }

    @Test
    public void canCheckRemainingStorageCapacityForPassengers() {
        flightManager.addPassengerToFlight(passenger1);
        flightManager.addPassengerToFlight(passenger2);
        assertEquals(4.0, flightManager.checkBagageStorageRemainingOnFlight(flight),1.00);
    }

    @Test
    public void canAddFlightNumberToPassenger() {
        flightManager.addPassengerToFlight(passenger1);
        assertEquals("G23I", passenger1.getFlight());
    }

    @Test
    public void canAddSeatNumberToPassenger() {
        flightManager.addPassengerToFlight(passenger1);
        assertEquals(1, passenger1.countSeatnumber());
    }
}
