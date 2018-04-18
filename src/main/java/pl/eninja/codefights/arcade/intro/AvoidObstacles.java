/*You are given an array of integers representing coordinates of obstacles situated on a straight
 line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only
to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
count(inputArray) = 4.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i] ≤ 40.

[output] integer

The desired length.*/

package pl.eninja.codefights.arcade.intro;

class AvoidObstacles {

  static int count(int[] inputArray) {
    int jump = 1;
    boolean fail = true;

    while (fail) {
      jump++;
      fail = false;
      for (int i : inputArray) {
        if (i % jump == 0) {
          fail = true;
          break;
        }
      }
    }
    return jump;
  }
}
