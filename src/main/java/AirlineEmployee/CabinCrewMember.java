package AirlineEmployee;

import Enums.Rank;

public class CabinCrewMember extends AirlineEmployee{

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage(String message){
        return "Relay: " + message;
    }

}
