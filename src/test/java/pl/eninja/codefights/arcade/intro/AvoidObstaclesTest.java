package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvoidObstaclesTest {

  @Test
  public void countTest1() {
    int[] ints = new int[]{5, 3, 6, 7, 9};
    assertEquals(4, AvoidObstacles.count(ints));
  }

  @Test
  public void countTest2() {
    int[] ints = new int[]{2, 3};
    assertEquals(4, AvoidObstacles.count(ints));
  }

  @Test
  public void countTest3() {
    int[] ints = new int[]{1, 4, 10, 6, 2};
    assertEquals(7, AvoidObstacles.count(ints));
  }
}