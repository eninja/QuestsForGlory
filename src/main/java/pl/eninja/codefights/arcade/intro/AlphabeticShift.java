/* Given a string, replace each its character by the next one in the English alphabet (z would be
 replaced by a).

Example

For inputString = "crazy", the output should be
alphabeticShift(inputString) = "dsbaz".

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Non-empty string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 1000.

[output] string

The result string after replacing all of its characters. */

package pl.eninja.codefights.arcade.intro;

class AlphabeticShift {
  static String plusOneChar(String inputString) {
    char[] a = inputString.toCharArray();
    for (int i = 0; i < a.length; ++i) {
      if (a[i] == 'z') {
        a[i] = 'a';
      } else {
        a[i] = (char) (a[i] + 1);
      }
    }
    return new String(a);
  }
}
