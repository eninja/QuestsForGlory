package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixElementsSumTest {

  @Test
  public void matrixElementsSumTest1() {
    assertEquals(9, MatrixElementsSum.sum(new int[][]{{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}}));
  }

  @Test
  public void matrixElementsSumTest2() {
    assertEquals(9, MatrixElementsSum.sum(new int[][]{{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}}));
  }

  @Test
  public void matrixElementsSumTest3() {
    assertEquals(18, MatrixElementsSum.sum(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}));
  }
}