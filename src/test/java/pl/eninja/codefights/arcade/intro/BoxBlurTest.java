package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BoxBlurTest {

  @Test
  public void blurTest1() {
    int[][] ints = new int[][]{{1, 1, 1}, {1, 7, 1}, {1, 1, 1}};
    int[][] expected = new int[][]{{1}};
    assertArrayEquals(expected, BoxBlur.blur(ints));
  }
  @Test
  public void blurTest2() {
    int[][] ints = new int[][]{{0, 18, 9}, {27, 9, 0}, {81, 63, 45}};
    int[][] expected = new int[][]{{28}};
    assertArrayEquals(expected, BoxBlur.blur(ints));
  }
  @Test
  public void blurTest3() {
    int[][] ints = new int[][]{{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}};
    int[][] expected = new int[][]{{40, 30}};
    assertArrayEquals(expected, BoxBlur.blur(ints));
  }
  @Test
  public void blurTest4() {
    int[][] ints = new int[][]{{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}};
    int[][] expected = new int[][]{{5, 4}, {4, 4}};
    assertArrayEquals(expected, BoxBlur.blur(ints));
  }
  @Test
  public void blurTest5() {
    int[][] ints = new int[][]{{36, 0, 18, 9, 9, 45, 27},
                               {27, 0, 54, 9, 0, 63, 90},
                               {81, 63, 72, 45, 18, 27, 0},
                               {0, 0, 9, 81, 27, 18, 45},
                               {45, 45, 27, 27, 90, 81, 72},
                               {45, 18, 9, 0, 9, 18, 45},
                               {27, 81, 36, 63, 63, 72, 81}};
    int[][] expected = new int[][]{{39, 30, 26, 25, 31},
                                   {34, 37, 35, 32, 32},
                                   {38, 41, 44, 46, 42},
                                   {22, 24, 31, 39, 45},
                                   {37, 34, 36, 47, 59}};
    assertArrayEquals(expected, BoxBlur.blur(ints));
  }
}