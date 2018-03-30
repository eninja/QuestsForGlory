package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdjacentElementsProductTest {

  @Test
  public void findMaxAdjacent() {
    int[] ints = new int[]{-23, 4, -3, 8, -12};
    assertEquals(-12, AdjacentElementsProduct.findMaxAdjacent(ints));
  }
}