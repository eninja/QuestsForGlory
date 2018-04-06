/*Given an array of integers, find the maximal absolute difference between any two of its
adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.*/

package pl.eninja.codefights.arcade.intro;

class ArrayMaximalAdjacentDifference {

  static int find(int[] inputArray) {
    int result = Math.abs(inputArray[0] - inputArray[1]);
    for (int i = 1; i < inputArray.length - 1; i++) {
      int firstInt = inputArray[i];
      int secondInt = inputArray[i + 1];
      if (Math.abs(firstInt - secondInt) > result) {
        result = Math.abs(firstInt - secondInt);
      }
    }

    return result;
  }
}
