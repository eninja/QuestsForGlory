/*Given a matrix (i.e. an array of arrays), find its submatrix obtained by deleting the specified
 rows and columns.

Example

For

matrix = [[1, 0, 0, 2],
          [0, 5, 0, 1],
          [0, 0, 3, 5]]
rowsToDelete = [1] and columnsToDelete = [0, 2], the output should be

constructSubmatrix(matrix, rowsToDelete, columnsToDelete) = [[0, 2],
                                                             [0, 5]]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

2-dimensional array of integers.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
1 ≤ matrix[0].length ≤ 5,
0 ≤ matrix[i][j] ≤ 15.

[input] array.integer rowsToDelete

Array of indices (0-based) of rows to be deleted.

Guaranteed constraints:
0 ≤ rowsToDelete.length ≤ 2,
0 ≤ rowsToDelete[i] < matrix.length.

[input] array.integer columnsToDelete

Array of indices (0-based) of columns to be deleted.

Guaranteed constraints:
0 ≤ columnsToDelete.length ≤ 2,
0 ≤ columnsToDelete[i] < matrix[0].length.

[output] array.array.integer*/

package pl.eninja.codefights.jobsquickchallenge;

class ConstructSubmatrix {

  static int[][] construct(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
    int newRows = matrix.length - rowsToDelete.length;
    int newColumns = matrix[0].length - columnsToDelete.length;

    int[][] matrixWithoutDeletedRows;

    if (rowsToDelete.length == 0) {
      matrixWithoutDeletedRows = matrix;
    } else {
      matrixWithoutDeletedRows = new int[newRows][];
      int newRow = 0;
      for (int i = 0; i < matrix.length; i++) {
        for (int row : rowsToDelete) {
          if (i != row) {
            matrixWithoutDeletedRows[newRow] = matrix[i];
            newRow++;
          }
        }
      }
    }
    int[][] matrixWithoutDeletedColumns;
    if (columnsToDelete.length == 0) {
      return matrixWithoutDeletedRows;
    } else {
      matrixWithoutDeletedColumns = new int[newRows][newColumns];
      for (int i = 0; i < matrixWithoutDeletedRows.length; i++) {
        int newCol = 0;
        for (int j = 0; j < matrixWithoutDeletedRows[i].length; j++) {
          boolean isValid = true;
          for (int col : columnsToDelete) {
            if (j == col) {
              isValid = false;
              break;
            }
          }
          if (isValid) {
            matrixWithoutDeletedColumns[i][newCol] = matrixWithoutDeletedRows[i][j];
            newCol++;
          }
        }
      }
    }

    return matrixWithoutDeletedColumns;
  }
}
