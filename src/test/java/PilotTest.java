import AirlineEmployee.Pilot;
import Enums.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Fred", Rank.CAPTAIN, "PLN123");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Fred", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasPilotLicenseNumber(){
        assertEquals("PLN123", pilot.getPilotLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("I am flying the plane", pilot.flyPlane());
    }

}
