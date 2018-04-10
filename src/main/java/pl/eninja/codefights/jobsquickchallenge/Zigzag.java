/* A sequence of integers is called a zigzag sequence if each of its elements is either strictly
less than all its neighbors or strictly greater than all its neighbors. For example, the sequence
 4 2 3 1 5 3 is a zigzag, but 7 3 5 5 2 and 3 8 6 4 5 aren't. Sequence of length 1 is also a
 zigzag */

package pl.eninja.codefights.jobsquickchallenge;

class Zigzag {

  static int check(int[] a) {
    int start = 0;
    int stop = 0;
    int max = 1;
    int length;

    for (int i = 1; i < a.length - 1; i++) {
      int prev = a[i - 1];
      int current = a[i];
      int next = a[i + 1];

      if ((current < prev && current < next) || (current > prev && current > next)) {
        if (start == 0) {
          start = i - 1;
        }
        stop = i + 1;
      } else {
        length = stop - start + 1;
        if (length > max) {
          max = length;
        }
        start = 0;
        stop = 0;
      }
    }

    return max;
  }
}
