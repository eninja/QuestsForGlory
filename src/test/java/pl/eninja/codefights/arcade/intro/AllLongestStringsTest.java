package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllLongestStringsTest {

  @Test
  public void allLongestStrings() {
    String[] strings = new String[]{"aba", "aa", "ad", "vcd", "aba"};
    String[] expected = new String[]{"aba", "vcd", "aba"};
    assertEquals(expected, AllLongestStrings.print(strings));
  }

  @Test
  public void allLongestStringsTest4() {
    String[] strings = new String[]{"a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa"};
    String[] expected = new String[]{"zzzzzz", "abcdef", "aaaaaa"};
    assertEquals(expected, AllLongestStrings.print(strings));
  }
}