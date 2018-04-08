package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsIPv4AddressTest {

  @Test
  public void checkTest1() {
    assertTrue(IsIPv4Address.check("172.16.254.1"));
  }

  @Test
  public void checkTest2() {
    assertFalse(IsIPv4Address.check("172.316.254.1"));
  }

  @Test
  public void checkTest3() {
    assertFalse(IsIPv4Address.check(".254.255.0"));
  }

  @Test
  public void checkTest4() {
    assertFalse(IsIPv4Address.check("1.1.1.1a"));
  }

  @Test
  public void checkTest10() {
    assertFalse(IsIPv4Address.check("1.1.1.1.1"));
  }
}