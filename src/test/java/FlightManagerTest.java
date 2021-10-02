import AirlineEmployee.CabinCrewMember;
import AirlineEmployee.Pilot;
import Enums.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Plane plane;
    Flight flight;
    FlightManager flightManager;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING474);
        flight = new Flight(pilot, cabinCrewMember, plane, "123", "GLA", "EDI", "1300");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasReservedBaggageWeight(){
        assertEquals(15000, flightManager.totalBaggageWeight());
    }

    @Test
    public void hasBaggageWeightPerPassenger(){
        assertEquals(30.00, flightManager.baggageWeightPerPassenger(), 0.01);
    }

    @Test
    public void calculatesUsedBaggageWeightWhenNoPassengers(){
        assertEquals(0.00, flightManager.usedBaggageWeight(), 0.01);
    }

    @Test
    public void calculatesUsedBaggageWeightOnePassenger(){
        Passenger passenger = new Passenger("Bob", 1);
        flight.addPassenger(passenger);
        assertEquals(30.00, flightManager.usedBaggageWeight(), 0.01);
    }

    @Test
    public void calculatesUsedBaggageWeightTwoPassengers(){
        Passenger passenger1 = new Passenger("Bob", 1);
        Passenger passenger2 = new Passenger("Sally", 1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(60.00, flightManager.usedBaggageWeight(), 0.01);
    }

    @Test
    public void calculatesRemainingBaggageWeightWhenNoPassengers(){
        assertEquals(15000.00, flightManager.remainingBaggageWeight(), 0.01);
    }

    @Test
    public void calculatesRemainingBaggageWeightOnePassenger(){
        Passenger passenger = new Passenger("Bob", 1);
        flight.addPassenger(passenger);
        assertEquals(14970.00, flightManager.remainingBaggageWeight(), 0.01);
    }

    @Test
    public void calculatesRemainingBaggageWeightTwoPassengers(){
        Passenger passenger1 = new Passenger("Bob", 1);
        Passenger passenger2 = new Passenger("Sally", 1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(14940.00, flightManager.remainingBaggageWeight(), 0.01);
    }

}
