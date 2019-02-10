import java.util.ArrayList;

public class Passenger {

    private String name;
    private int bags;
    private String flight;
    private ArrayList<Integer> seatNumber;

    public Passenger(String name, int bags, String flight){
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seatNumber = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public void addFlight(String flightNumber) {
        this.flight = flightNumber ;
    }

    public String getFlight() {
        return flight;
    }

    public int countSeatnumber() {
        return seatNumber.size();
    }

    public void addSeatNumber(int seatNumber) {
        this.seatNumber.add(seatNumber);
    }
}
