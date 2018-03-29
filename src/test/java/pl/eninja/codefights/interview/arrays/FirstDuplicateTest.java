package pl.eninja.codefights.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstDuplicateTest {
  private int[] ints = new int[]{2, 3, 3, 1, 5, 2};
  private int expected = 3;

  @Test
  public void findUsingArray() {
    assertEquals(expected, FirstDuplicate.findUsingArray(ints));
  }

  @Test
  public void findUsingSet() {
    assertEquals(expected, FirstDuplicate.findUsingSet(ints));
  }
}