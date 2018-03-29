package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class adjacentElementsProductTest {
  private int[] ints = new int[]{-23, 4, -3, 8, -12};

  @Test
  public void findMaxAdjacent() {
    assertEquals(-12, adjacentElementsProduct.findMaxAdjacent(ints));
  }
}