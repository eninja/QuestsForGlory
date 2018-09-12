package pl.eninja.codefights.arcade.core;

import org.junit.Test;
import pl.eninja.codefights.arcade.core.LateRide;

import static org.junit.Assert.assertEquals;

public class LateRideTest {
    private LateRide lateRide = new LateRide();

    @Test
    public void lateRideTest1() {
        assertEquals(4, lateRide.lateRide(240));
    }

    @Test
    public void lateRideTest2() {
        assertEquals(14, lateRide.lateRide(808));
    }
    @Test
    public void lateRideTest3() {
        assertEquals(19, lateRide.lateRide(1439));
    }
    @Test
    public void lateRideTest4() {
        assertEquals(0, lateRide.lateRide(0));
    }
    @Test
    public void lateRideTest5() {
        assertEquals(5, lateRide.lateRide(23));
    }
    @Test
    public void lateRideTest6() {
        assertEquals(8, lateRide.lateRide(8));
    }
}