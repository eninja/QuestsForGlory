/*Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll
be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees
(clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 100,
a[i].length = a.length,
1 ≤ a[i][j] ≤ 104.

[output] array.array.integer*/

package pl.eninja.codefights.interview.arrays;

class RotateImage {

  static int[][] rotate(int[][] a) {
    int length = a.length;
    int[][] result = new int[length][length];

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        result[i][j] = a[length - j - 1][i];
      }
    }
    return result;
  }
}
