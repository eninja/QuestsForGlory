package pl.eninja.codefights.interview.arrays;

public class RotateImage {

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
