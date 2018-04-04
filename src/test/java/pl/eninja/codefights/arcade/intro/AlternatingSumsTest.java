package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlternatingSumsTest {

  @Test
  public void sumTest1() {
    int[] ints = new int[]{50, 60, 60, 45, 70};
    int[] expected = new int[]{180, 105};
    assertArrayEquals(expected, AlternatingSums.sum(ints));
  }

  @Test
  public void sumTest2() {
    int[] ints = new int[]{100, 50};
    int[] expected = new int[]{100, 50};
    assertArrayEquals(expected, AlternatingSums.sum(ints));
  }

  @Test
  public void sumTest3() {
    int[] ints = new int[]{80};
    int[] expected = new int[]{80, 0};
    assertArrayEquals(expected, AlternatingSums.sum(ints));
  }
}