package pl.eninja.codefights.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstNotRepeatingCharacterTest {
  private String string = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
  private char expected = 'g';

  @Test
  public void findUsingArray() {
    assertEquals(expected, FirstNotRepeatingCharacter.findUsingArray(string));
  }

  @Test
  public void findUsingMap() {
    assertEquals(expected, FirstNotRepeatingCharacter.findUsingMap(string));
  }
}