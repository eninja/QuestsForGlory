package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeRearrangingTest {

  @Test
  public void checkTest1() {
    assertTrue(PalindromeRearranging.check("aabb"));
  }

  @Test
  public void checkTest2() {
    assertFalse(PalindromeRearranging.check("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
  }

  @Test
  public void checkTest3() {
    assertTrue(PalindromeRearranging.check("abbcabb"));
  }

  @Test
  public void checkTest4() {
    assertTrue(PalindromeRearranging.check("zyyzzzzz"));
  }

  @Test
  public void checkTest5() {
    assertTrue(PalindromeRearranging.check("z"));
  }

  @Test
  public void checkTest6() {
    assertTrue(PalindromeRearranging.check("zaa"));
  }

  @Test
  public void checkTest7() {
    assertFalse(PalindromeRearranging.check("abca"));
  }
}