/* Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.



For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.



Input/Output

[execution time limit] 3 seconds (java)

[input] string cell1

[input] string cell2

[output] boolean

true if both cells have the same color, false otherwise. */

package pl.eninja.codefights.arcade.intro;

class ChessBoardCellColor {

  static boolean isSameColor(String cell1, String cell2) {
    return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(
            cell1.charAt(1) - cell2.charAt(1)) % 2;
  }
}
