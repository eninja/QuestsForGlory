package pl.eninja.codefights.arcade.intro;

/*After they became famous, the CodeBots all decided to move to a new building and live together.
 The building is
represented by a rectangular matrix of rooms. Each cell in the matrix contains an integer that
represents the price
of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted,
 so all the bots are
 afraid of them. That is why any room that is free or is located anywhere below a free room in
 the same column is not
  considered suitable for the bots to live in.

Help the bots calculate the total price of all the rooms that are suitable for them.

Example

For
matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
the output should be
sum(matrix) = 9.

Here's the rooms matrix with unsuitable rooms marked with 'x':

[[x, 1, 1, 2],
 [x, 5, x, x],
 [x, x, x, x]]
Thus, the answer is 1 + 5 + 1 + 2 = 9.

For
matrix = [[1, 1, 1, 0],
          [0, 5, 0, 1],
          [2, 1, 3, 10]]
the output should be
sum(matrix) = 9.

Here's the rooms matrix with unsuitable rooms marked with 'x':

[[1, 1, 1, x],
 [x, 5, x, x],
 [x, 1, x, x]]
Note that the free room in the first row make the full column unsuitable for bots.

Thus, the answer is 1 + 1 + 1 + 5 + 1 = 9.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

A 2-dimensional array of integers representing a rectangular matrix of the building.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
1 ≤ matrix[i].length ≤ 5,
0 ≤ matrix[i][j] ≤ 10.

[output] integer

The total price of all the rooms that are suitable for the CodeBots to live in.*/
class MatrixElementsSum {

  static int sum(int[][] matrix) {
    int sum = 0;
    for (int i = matrix.length - 1; i >= 0; i--) {
      for (int j = matrix[i].length - 1; j >= 0; j--) {
        int countZero = 0;
        for (int k = i - 1; k >= 0; k--) {

          if (matrix[k][j] == 0) {
            countZero++;
            break;
          }
        }
        if (countZero == 0) {
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }
}
