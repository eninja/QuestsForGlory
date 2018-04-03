package pl.eninja.codefights.interview.arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

  private final int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  private final int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

  @Test
  public void rotate() {
    //noinspection deprecation
    Assert.assertArrayEquals(expected, RotateImage.rotate(a));
  }
}