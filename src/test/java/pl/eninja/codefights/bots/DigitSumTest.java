package pl.eninja.codefights.bots;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitSumTest {

  @Test
  public void digitSum1() {
    assertEquals(3, DigitSum.sum(111));
  }
  @Test
  public void digitSum3() {
    assertEquals(1, DigitSum.sum(100));
  }
  @Test
  public void digitSum2() {
    assertEquals(0, DigitSum.sum(0));
  }
}