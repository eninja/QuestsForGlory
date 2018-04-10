package pl.eninja.codefights.jobsquickchallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigzagTest {

  @Test
  public void check1() {
    assertEquals(4, Zigzag.check(new int[]{9, 8, 8, 5, 3, 5, 3, 2, 8, 6}));
  }

  @Test
  public void check2() {
    assertEquals(1, Zigzag.check(new int[]{4, 4}));
  }

  @Test
  public void check3() {
    assertEquals(6, Zigzag.check(
            new int[]{2, 1, 4, 4, 1, 4, 4, 1, 2, 0, 1, 0, 0, 3, 1, 3, 4, 1, 3, 4}));
  }
}