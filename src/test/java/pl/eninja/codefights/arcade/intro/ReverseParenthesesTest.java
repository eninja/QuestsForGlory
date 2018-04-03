package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseParenthesesTest {

  @Test
  public void reverseTest1() {
    String string = "a(bc)de";
    String expected = "acbde";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest2() {
    String string = "a(bcdefghijkl(mno)p)q";
    String expected = "apmnolkjihgfedcbq";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest3() {
    String string = "co(de(fight)s)";
    String expected = "cosfighted";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest4() {
    String string = "Code(Cha(lle)nge)";
    String expected = "CodeegnlleahC";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest5() {
    String string = "Where are the parentheses?";
    String expected = "Where are the parentheses?";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest6() {
    String string = "abc(cba)ab(bac)c";
    String expected = "abcabcabcabc";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }

  @Test
  public void reverseTest7() {
    String string = "The ((quick (brown) (fox) jumps over the lazy) dog)";
    String expected = "The god quick nworb xof jumps over the lazy";
    assertEquals(expected, ReverseParentheses.reverse(string));
  }
}