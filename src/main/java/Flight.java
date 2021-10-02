import AirlineEmployee.CabinCrewMember;
import AirlineEmployee.Pilot;

import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Pilot pilot, CabinCrewMember cabinCrewMember, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public CabinCrewMember getCabinCrewMember() {
        return cabinCrewMember;
    }

    public void setCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMember = cabinCrewMember;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int numberOfPassengers(){
        return this.passengers.size();
    }

    public int availableSeats(){
        return this.plane.getCapacityFromEnum() - numberOfPassengers();
    }

    public void addPassenger(Passenger passenger){
        if (availableSeats() > 0){
            this.passengers.add(passenger);
        }
    }

}
