public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int totalBaggageWeight(){
        return this.flight.plane.getTotalWeightFromEnum() / 2;
    }

    public double baggageWeightPerPassenger() {
        return totalBaggageWeight() / flight.plane.getCapacityFromEnum();
    }

    public double usedBaggageWeight(){
        return baggageWeightPerPassenger() * flight.numberOfPassengers();
    }

    public double remainingBaggageWeight(){
        return totalBaggageWeight() - usedBaggageWeight();
    }
}
