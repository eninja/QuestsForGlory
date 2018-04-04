package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortByHeightTest {

  @Test
  public void sortTest1() {
    int[] ints = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
    int[] expected = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};
    assertArrayEquals(expected, SortByHeight.sort(ints));
  }

  @Test
  public void sortTest2() {
    int[] ints = new int[]{-1, -1, -1, -1, -1};
    int[] expected = new int[]{-1, -1, -1, -1, -1};
    assertArrayEquals(expected, SortByHeight.sort(ints));
  }

  @Test
  public void sortTest3() {
    int[] ints = new int[]{4, 2, 9, 11, 2, 16};
    int[] expected = new int[]{2, 2, 4, 9, 11, 16};
    assertArrayEquals(expected, SortByHeight.sort(ints));
  }

  @Test
  public void sortTest4() {
    int[] ints = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
    int[] expected = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};
    assertArrayEquals(expected, SortByHeight.sort(ints));
  }
}