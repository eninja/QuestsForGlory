/*Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.*/

package pl.eninja.codefights.arcade.intro;

class AllLongestStrings {

  static String[] print(String[] inputArray) {
    int max = inputArray[0].length();

    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i].length() > max) {
        max = inputArray[i].length();
      }
    }

    int counter = 0;
    for (String s : inputArray) {
      if (s.length() == max) {
        counter++;
      }
    }

    String[] result = new String[counter];
    int index = 0;
    for (String s : inputArray) {
      if (s.length() == max) {
        result[index] = s;
        index++;
      }
    }
    return result;
  }
}