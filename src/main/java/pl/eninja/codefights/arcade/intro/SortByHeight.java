/*Some people are standing in a row in a park. There are trees between them which cannot be moved
. Your task is to rearrange the people by their heights in a non-descending order without moving
the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a
person standing in the ith position.

Guaranteed constraints:
5 ≤ a.length ≤ 15,
-1 ≤ a[i] ≤ 200.

[output] array.integer

Sorted array a with all the trees untouched.*/

package pl.eninja.codefights.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SortByHeight {

  static int[] sort(int[] a) {
    int[] sorted = Arrays.copyOf(a, a.length);
    Arrays.sort(sorted);
    int[] result = new int[a.length];
    List<Integer> indexOfHuman = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      if (a[i] == -1) {
        result[i] = a[i];
      } else {
        indexOfHuman.add(i);
      }
    }
    int counter = 0;
    for (int i : sorted) {
      if (i > -1) {
        result[indexOfHuman.get(counter)] = i;
        counter++;
      }
    }

    return result;
  }
}
