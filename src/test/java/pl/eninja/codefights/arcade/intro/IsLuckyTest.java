package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsLuckyTest {

  @Test
  public void checkTest1() {
    assertTrue(IsLucky.check(1230));
  }

  @Test
  public void checkTest2() {
    assertFalse(IsLucky.check(239017));
  }

  @Test
  public void checkTest3() {
    assertTrue(IsLucky.check(134008));
  }

  @Test
  public void checkTest4() {
    assertFalse(IsLucky.check(10));
  }

  @Test
  public void checkTes5() {
    assertTrue(IsLucky.check(11));
  }

  @Test
  public void checkTes6() {
    assertTrue(IsLucky.check(1010));
  }
}