package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AreSimilarTest {

  @Test
  public void checkTest1() {
    int[] a = new int[]{1, 2, 3};
    int[] b = new int[]{1, 2, 3};
    assertTrue(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest2() {
    int[] a = new int[]{1, 2, 3};
    int[] b = new int[]{2, 1, 3};
    assertTrue(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest3() {
    int[] a = new int[]{1, 2, 2};
    int[] b = new int[]{2, 1, 1};
    assertFalse(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest4() {
    int[] a = new int[]{1, 1, 4};
    int[] b = new int[]{1, 2, 3};
    assertFalse(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest5() {
    int[] a = new int[]{1, 2, 3};
    int[] b = new int[]{1, 10, 2};
    assertFalse(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest6() {
    int[] a = new int[]{2, 3, 1};
    int[] b = new int[]{1, 3, 2};
    assertTrue(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest7() {
    int[] a = new int[]{2, 3, 9};
    int[] b = new int[]{10, 3, 2};
    assertFalse(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest8() {
    int[] a = new int[]{4, 6, 3};
    int[] b = new int[]{3, 4, 6};
    assertFalse(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest9() {
    int[] a = new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
    int[] b = new int[]{832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
    assertTrue(AreSimilar.check(a, b));
  }

  @Test
  public void checkTest10() {
    int[] a = new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
    int[] b = new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
    assertFalse(AreSimilar.check(a, b));
  }
}