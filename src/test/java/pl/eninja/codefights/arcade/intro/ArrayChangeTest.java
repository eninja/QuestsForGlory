package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayChangeTest {

  @Test
  public void minTest1() {
    int[] ints = new int[]{1, 1, 1};
    assertEquals(3, ArrayChange.min(ints));
  }

  @Test
  public void minTest2() {
    int[] ints = new int[]{-1000, 0, -2, 0};
    assertEquals(5, ArrayChange.min(ints));
  }

  @Test
  public void minTest3() {
    int[] ints = new int[]{2, 1, 10, 1};
    assertEquals(12, ArrayChange.min(ints));
  }

  @Test
  public void minTest4() {
    int[] ints = new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
    assertEquals(13, ArrayChange.min(ints));
  }
}