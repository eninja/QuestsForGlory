package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlmostIncreasingSequenceTest {

  @Test
  public void isItPossibleSimplyFalse() {
    int[] seqImpossible = {1, 3, 2, 1};
    assertFalse(AlmostIncreasingSequence.isItPossible(seqImpossible));
  }

  @Test
  public void isItPossibleSimplyTrue() {
    int[] seqPossible = {5, 4, 6};
    assertTrue(AlmostIncreasingSequence.isItPossible(seqPossible));
  }

  @Test
  public void isItPossibleTrue123436() {
    int[] seqPossible = {1, 2, 3, 4, 3, 6};
    assertTrue(AlmostIncreasingSequence.isItPossible(seqPossible));
  }

  @Test
  public void isItPossibleTrue3567983() {
    int[] seqPossible = {3, 5, 67, 98, 3};
    assertTrue(AlmostIncreasingSequence.isItPossible(seqPossible));
  }

  @Test
  public void isItPossibleTenAndDuplicateOne() {
    int[] seqPossible = {10, 1, 2, 3, 4, 5, 1};
    assertFalse(AlmostIncreasingSequence.isItPossible(seqPossible));
  }

  @Test
  public void isItPossibleTwoDuplicateNum() {
    int[] seqPossible = {1, 2, 1, 2};
    assertFalse(AlmostIncreasingSequence.isItPossible(seqPossible));
  }

  @Test
  public void isItPossibleMultiplyBy10() {
    int[] seqPossible = {40, 50, 60, 10, 20, 30};
    assertFalse(AlmostIncreasingSequence.isItPossible(seqPossible));
  }
}