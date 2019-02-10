import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    Plane plane2;

    @Before

    public void before(){
        passenger1 = new Passenger("Scotty",1, "None");
        passenger2 = new Passenger("Alzo",2,"None");
        passenger3 = new Passenger("Seth", 4,"None");
        plane = new Plane(PlaneType.CESSNA172);
        plane2 = new Plane(PlaneType.AIRBUS300);
        flight1 = new Flight(plane, "G23I", "London", "Glasgow","10:00");
        flight2 = new Flight(plane2, "G561P", "New York", "London", "20:00");
    }

    @Test
    public void areThereSeatsAvailable() {
        assertEquals(45, flight2.seatsAvalable());
    }

    @Test
    public void canPassengerBookSeat() {
        flight1.bookSeat(passenger1);
        assertEquals(1, flight1.seatsAvalable());
    }

    @Test
    public void cantGoOverPlaneCapacity() {
        flight1.bookSeat(passenger1);
        flight1.bookSeat(passenger2);
        flight1.bookSeat(passenger3);
        assertEquals(0, flight1.seatsAvalable());
    }
}
