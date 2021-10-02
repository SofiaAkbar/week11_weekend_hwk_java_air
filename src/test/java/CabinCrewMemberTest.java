import AirlineEmployee.CabinCrewMember;
import Enums.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Sally", Rank.FIRSTOFFICER);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Sally", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(Rank.FIRSTOFFICER, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewCanRelayMessage(){
        assertEquals("Relay: Hello", cabinCrewMember.relayMessage("Hello"));
    }
}
