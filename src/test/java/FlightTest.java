import AirlineEmployee.CabinCrewMember;
import AirlineEmployee.Pilot;
import Enums.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS);
        flight = new Flight(pilot, cabinCrewMember, plane, "123", "GLA", "EDI", "1300");
    }

    @Test
    public void flightHasPilot(){
        assertEquals(flight.pilot, flight.getPilot());
    }

    @Test
    public void flightHasCabinCrewMember(){
        assertEquals(flight.cabinCrewMember, flight.getCabinCrewMember());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(flight.plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("123", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("1300", flight.getDepartureTime());
    }

    @Test
    public void returnNumberOfAvailableSeatsWhenNoPassengers(){
        assertEquals(2, flight.availableSeats());
    }

    @Test
    public void returnNumberOfAvailableSeatsWhenCapacityFull(){
        Passenger passenger1 = new Passenger("Sam", 1);
        Passenger passenger2 = new Passenger("Sarah", 1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(0, flight.availableSeats());
    }

    @Test
    public void canAddPassengerWhenSeatsAvailable(){
        Passenger passenger = new Passenger("Sam", 1);
        flight.addPassenger(passenger);
        assertEquals(1, flight.numberOfPassengers());
    }

    @Test
    public void canNotAddPassengerWhenNoSeatsAvailable(){
        Passenger passenger1 = new Passenger("Sam", 1);
        Passenger passenger2 = new Passenger("Sarah", 1);
        Passenger passenger3 = new Passenger("Debbie", 1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.numberOfPassengers());
    }
}
