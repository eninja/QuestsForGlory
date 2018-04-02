package pl.eninja.codefights.interview.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Note: Write a solution that only iterates over the string once and uses O(1) additional memory,
since this is what
you would be asked to do during a real interview.

Given a string s, find and return the first instance of a non-repeating character in it. If there
 is no such
character, return '_'.

Example

For s = "abacabad", the output should be
FirstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the
 string first.

For s = "abacabaabacaba", the output should be
FirstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.

 */

class FirstNotRepeatingCharacter {

  static char findUsingArray(String s) {
    char result = '_';
    for (char c : s.toCharArray()) {
      if (s.indexOf(c) == s.lastIndexOf(c)) {
        return c;
      }
    }
    return result;
  }

  static char findUsingMap(String s) {
    char result = '_';
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, 1);
      } else {
        map.put(c, 0);
      }
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 0) {
        result = entry.getKey();
        break;
      }
    }
    return result;
  }
}
