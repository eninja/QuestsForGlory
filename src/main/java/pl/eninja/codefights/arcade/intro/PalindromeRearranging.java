/*Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.*/

package pl.eninja.codefights.arcade.intro;

import java.util.HashMap;
import java.util.Map;

class PalindromeRearranging {

  static boolean check(String inputString) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      char charAt = inputString.charAt(i);
      if (map.containsKey(charAt)) {
        map.replace(charAt, map.get(charAt) + 1);
      } else {
        map.putIfAbsent(charAt, 1);
      }
    }
    int counter = 0;
    if (inputString.length() % 2 == 0) {
      for (Integer integer : map.values()) {
        if (integer % 2 == 1) {
          return false;
        }
      }
    } else {
      for (Integer integer : map.values()) {
        if (integer % 2 == 1) {
          counter++;
        }

        if (counter > 1) {
          return false;
        }
      }
    }

    return true;
  }
}
