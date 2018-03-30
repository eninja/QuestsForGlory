package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeArrayConsecutive2Test {
  private int[] statues = {6, 2, 3, 8};
  private int expected = 3;
  private int[] statuesFull = {5, 4, 6};
  private int expectedZero = 0;

  @Test
  public void findNoOfMissedStatues() {
    assertEquals(expected, MakeArrayConsecutive2.findNoOfMissedStatues(statues));
  }

  @Test
  public void findNoOfMissedStatuesInFull() {
    assertEquals(expectedZero, MakeArrayConsecutive2.findNoOfMissedStatues(statuesFull));
  }
}