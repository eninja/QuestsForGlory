/*Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky
 if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
IsLucky(n) = true;
For n = 239017, the output should be
IsLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.*/

package pl.eninja.codefights.arcade.intro;

class IsLucky {

  static boolean check(int n) {
    String value = String.valueOf(n);

    int sum1 = 0;
    for (int i = 0; i < value.length() / 2; i++) {
      sum1 = sum1 + Character.getNumericValue(value.charAt(i));
    }
    int sum2 = 0;
    for (int j = value.length() / 2; j < value.length(); j++) {
      sum2 = sum2 + Character.getNumericValue(value.charAt(j));
    }

    return sum1 == sum2;
  }
}
