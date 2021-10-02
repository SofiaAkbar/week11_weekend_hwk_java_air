import Enums.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS);
    }

    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.AIRBUS, plane.getPlaneType());
    }

    @Test
    public void planeHasPlaneTypeCapacity(){
        assertEquals(2, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasPlaneTypeTotalWeight(){
        assertEquals(25000, plane.getTotalWeightFromEnum());
    }
}
