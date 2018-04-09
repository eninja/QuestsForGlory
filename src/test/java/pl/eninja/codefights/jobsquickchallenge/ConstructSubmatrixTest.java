package pl.eninja.codefights.jobsquickchallenge;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConstructSubmatrixTest {

  @Test
  public void constructTest1() {
    int[][] matrix = {{1, 0, 0, 2}, {0, 5, 0, 1}, {0, 0, 3, 5}};
    int[] rowsToDelete = {1};
    int[] columnsToDelete = {0, 2};
    int[][] expected = {{0, 2}, {0, 5}};
    assertArrayEquals(expected,
                      ConstructSubmatrix.construct(matrix, rowsToDelete, columnsToDelete));
  }

  @Test
  public void constructTest2() {
    int[][] matrix = {{1, 0, 0, 2}, {0, 5, 0, 1}, {0, 0, 3, 5}};
    int[] rowsToDelete = {};
    int[] columnsToDelete = {0};
    int[][] expected = {{0, 0, 2}, {5, 0, 1}, {0, 3, 5}};
    assertArrayEquals(expected,
                      ConstructSubmatrix.construct(matrix, rowsToDelete, columnsToDelete));
  }

  @Test
  public void constructTest3() {
    int[][] matrix = {{1}};
    int[] rowsToDelete = {};
    int[] columnsToDelete = {};
    int[][] expected = {{1}};
    assertArrayEquals(expected,
                      ConstructSubmatrix.construct(matrix, rowsToDelete, columnsToDelete));
  }
}