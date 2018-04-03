package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonCharacterCountTest {

  @Test
  public void countTest1() {
    String string1 = "aabcc";
    String string2 = "adcaa";
    assertEquals(3, CommonCharacterCount.count(string1, string2));
  }

  @Test
  public void countTest5() {
    String string1 = "a";
    String string2 = "aaa";
    assertEquals(1, CommonCharacterCount.count(string1, string2));
  }
}