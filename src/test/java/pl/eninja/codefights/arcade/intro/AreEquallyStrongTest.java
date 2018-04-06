package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AreEquallyStrongTest {

  @Test
  public void checkTest1() {
    assertTrue(AreEquallyStrong.check(10, 15, 15, 10));
  }

  @Test
  public void checkTest2() {
    assertTrue(AreEquallyStrong.check(15, 10, 15, 10));
  }

  @Test
  public void checkTest3() {
    assertFalse(AreEquallyStrong.check(15, 10, 15, 9));
  }

  @Test
  public void checkTest4() {
    assertTrue(AreEquallyStrong.check(10, 5, 5, 10));
  }

  @Test
  public void checkTest5() {
    assertFalse(AreEquallyStrong.check(10, 15, 5, 20));
  }

  @Test
  public void checkTest6() {
    assertTrue(AreEquallyStrong.check(10, 20, 10, 20));
  }

  @Test
  public void checkTest7() {
    assertTrue(AreEquallyStrong.check(5, 20, 20, 5));
  }

  @Test
  public void checkTest8() {
    assertFalse(AreEquallyStrong.check(20, 15, 5, 20));
  }

  @Test
  public void checkTest9() {
    assertTrue(AreEquallyStrong.check(5, 10, 5, 10));
  }

  @Test
  public void checkTest10() {
    assertFalse(AreEquallyStrong.check(1, 10, 10, 0));
  }

  @Test
  public void checkTest11() {
    assertFalse(AreEquallyStrong.check(5, 5, 10, 10));
  }

  @Test
  public void checkTest12() {
    assertFalse(AreEquallyStrong.check(10, 5, 10, 6));
  }

  @Test
  public void checkTest13() {
    assertTrue(AreEquallyStrong.check(1, 1, 1, 1));
  }
}