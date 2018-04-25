/* Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Example

For inputArray = [1, 2, 1], elemToReplace = 1 and substitutionElem = 3, the output should be
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
0 ≤ inputArray[i] ≤ 10.

[input] integer elemToReplace

Guaranteed constraints:
0 ≤ elemToReplace ≤ 10.

[input] integer substitutionElem

Guaranteed constraints:
0 ≤ substitutionElem ≤ 10.

[output] array.integer */

package pl.eninja.codefights.arcade.intro;

class ArrayReplace {

  static int[] subArray(int[] inputArray, int elemToReplace, int substitutionElem) {
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == elemToReplace) {
        inputArray[i] = substitutionElem;
      }
    }
    return inputArray;
  }
}
