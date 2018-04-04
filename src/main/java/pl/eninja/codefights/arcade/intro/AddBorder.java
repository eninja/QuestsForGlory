/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.*/

package pl.eninja.codefights.arcade.intro;

class AddBorder {

  static String[] add(String[] picture) {
    String[] draw = new String[picture.length + 2];
    StringBuilder asterisks = new StringBuilder();

    for (int i = 0; i < picture[0].length() + 2; i++) {
      asterisks.append("*");
    }
    draw[0] = draw[draw.length - 1] = asterisks.toString();

    for (int i = 0; i < picture.length; i++) {
      String s = picture[i];
      StringBuilder builder = new StringBuilder();
      draw[i + 1] = builder.append("*")
                           .append(s)
                           .append("*")
                           .toString();
    }
    return draw;
  }
}
