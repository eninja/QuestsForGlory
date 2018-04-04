package pl.eninja.codefights.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AddBorderTest {

  @Test
  public void addTest1() {
    String[] strings = new String[]{"abc", "ded"};
    String[] expected = new String[]{"*****", "*abc*", "*ded*", "*****"};
    assertArrayEquals(expected, AddBorder.add(strings));
  }

  @Test
  public void addTest2() {
    String[] strings = new String[]{"a"};
    String[] expected = new String[]{"***", "*a*", "***"};
    assertArrayEquals(expected, AddBorder.add(strings));
  }

  @Test
  public void addTest3() {
    String[] strings = new String[]{"aa", "**", "zz"};
    String[] expected = new String[]{"****", "*aa*", "****", "*zz*", "****"};
    assertArrayEquals(expected, AddBorder.add(strings));
  }

  @Test
  public void addTest4() {
    String[] strings = new String[]{"abcde", "fghij", "klmno", "pqrst", "uvwxy"};
    String[] expected = new String[]{"*******", "*abcde*", "*fghij*", "*klmno*", "*pqrst*",
            "*uvwxy*", "*******"};
    assertArrayEquals(expected, AddBorder.add(strings));
  }

  @Test
  public void addTest5() {
    String[] strings = new String[]{"wzy**"};
    String[] expected = new String[]{"*******", "*wzy***", "*******"};
    assertArrayEquals(expected, AddBorder.add(strings));
  }
}