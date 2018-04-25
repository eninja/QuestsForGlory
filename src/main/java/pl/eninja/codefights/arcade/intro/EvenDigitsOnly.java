/* Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise. */

package pl.eninja.codefights.arcade.intro;

class EvenDigitsOnly {

  static boolean isAllDigitsEven(int n) {
    String value = Integer.toString(n);

    char[] charArray = value.toCharArray();
    for (char c : charArray) {
      if (Character.getNumericValue(c) % 2 != 0) {
        return false;
      }
    }
    return true;
  }
}
