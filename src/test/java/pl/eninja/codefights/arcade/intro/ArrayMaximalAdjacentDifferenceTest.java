package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayMaximalAdjacentDifferenceTest {

  @Test
  public void findTest1() {
    int[] ints = new int[]{2, 4, 1, 0};
    assertEquals(3, ArrayMaximalAdjacentDifference.find(ints));
  }

  @Test
  public void findTest2() {
    int[] ints = new int[]{1, 1, 1, 1};
    assertEquals(0, ArrayMaximalAdjacentDifference.find(ints));
  }

  @Test
  public void findTest3() {
    int[] ints = new int[]{-1, 4, 10, 3, -2};
    assertEquals(7, ArrayMaximalAdjacentDifference.find(ints));
  }
}