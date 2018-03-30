package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeArrayConsecutive2Test {

  @Test
  public void findNoOfMissedStatues() {
    int[] statues = {6, 2, 3, 8};
    int expected = 3;
    assertEquals(expected, MakeArrayConsecutive2.findNoOfMissedStatues(statues));
  }

  @Test
  public void findNoOfMissedStatuesInFull() {
    int[] statuesFull = {5, 4, 6};
    int expectedZero = 0;
    assertEquals(expectedZero, MakeArrayConsecutive2.findNoOfMissedStatues(statuesFull));
  }
}