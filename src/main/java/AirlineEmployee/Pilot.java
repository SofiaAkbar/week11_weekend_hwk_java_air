package AirlineEmployee;

import Enums.Rank;

public class Pilot extends AirlineEmployee {

    private String pilotLicenseNumber;

    public Pilot(String name, Rank rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String flyPlane(){
        return "I am flying the plane";
    }
}
