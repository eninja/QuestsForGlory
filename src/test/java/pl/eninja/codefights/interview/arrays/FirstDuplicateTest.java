package pl.eninja.codefights.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstDuplicateTest {

  private final static int expected = 3;
  private final int[] ints = new int[]{2, 3, 3, 1, 5, 2};

  @Test
  public void findUsingArray() {
    assertEquals(expected, FirstDuplicate.findUsingArray(ints));
  }

  @Test
  public void findUsingSet() {
    assertEquals(expected, FirstDuplicate.findUsingSet(ints));
  }
}