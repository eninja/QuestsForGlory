/*Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ≤ s1.length ≤ 15.

[input] string s2

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ≤ s2.length ≤ 15.

[output] integer*/

package pl.eninja.codefights.arcade.intro;

import java.util.HashMap;
import java.util.Map;

class CommonCharacterCount {

  static int count(String s1, String s2) {
    Map<Character, Integer> mapS1 = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);
      if (mapS1.containsKey(c)) {
        mapS1.put(c, mapS1.get(c) + 1);
      } else {
        mapS1.put(c, 1);
      }
    }

    Map<Character, Integer> mapS2 = new HashMap<>();
    for (int j = 0; j < s2.length(); j++) {
      char c = s2.charAt(j);
      if (mapS2.containsKey(c)) {
        mapS2.put(c, mapS2.get(c) + 1);
      } else {
        mapS2.put(c, 1);
      }
    }

    int result = 0;
    for (Map.Entry<Character, Integer> entry : mapS1.entrySet()) {
      if (mapS2.containsKey(entry.getKey())) {
        if (mapS2.get(entry.getKey()) < entry.getValue()) {
          result = result + mapS2.get(entry.getKey());
        } else {
          result = result + entry.getValue();
        }
      }
    }
    return result;
  }
}
