package pl.eninja.codefights.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateImageTest {

  private final int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  private final int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

  @Test
  public void rotate() {
    //noinspection deprecation
    assertEquals(expected, RotateImage.rotate(a));
  }
}