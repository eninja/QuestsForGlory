package pl.eninja.codefights.arcade.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneCallTest {

    private PhoneCall phoneCall = new PhoneCall();

    @Test
    public void phoneCallTest1() {
        assertEquals(14, phoneCall.phoneCall(3,1,2,20));
    }
    @Test
    public void phoneCallTest2() {
        assertEquals(1, phoneCall.phoneCall(2,2,1,2));
    }
    @Test
    public void phoneCallTest3() {
        assertEquals(11, phoneCall.phoneCall(10,1,2,22));
    }
    @Test
    public void phoneCallTest4() {
        assertEquals(14, phoneCall.phoneCall(2,2,1,24));
    }
    @Test
    public void phoneCallTest5() {
        assertEquals(3, phoneCall.phoneCall(1,2,1,6));
    }

}