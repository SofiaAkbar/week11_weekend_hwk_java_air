import AirlineEmployee.AirlineEmployee;
import AirlineEmployee.Pilot;
import Enums.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirlineEmployeeTest {

    AirlineEmployee airlineEmployee;

    @Before
    public void before(){
        airlineEmployee = new Pilot("Fred", Rank.CAPTAIN, "PLN123");
    }

    @Test
    public void airlineEmployeeHasName(){
        assertEquals("Fred", airlineEmployee.getName());
    }

    @Test
    public void airlineEmployeeHasRank(){
        assertEquals(Rank.CAPTAIN, airlineEmployee.getRank());
    }

}
