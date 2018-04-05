/*Two arrays are called similar if one can be obtained from another by swapping at most one pair
of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.*/

package pl.eninja.codefights.arcade.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AreSimilar {

  static boolean check(int[] a, int[] b) {
    int counter = 0;
    List<Integer> mismatchInA = new ArrayList<>();
    List<Integer> mismatchInB = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        counter++;
        mismatchInA.add(a[i]);
        mismatchInB.add(b[i]);

        if (counter > 2) {
          return false;
        }
      }
    }

    Collections.sort(mismatchInA);
    Collections.sort(mismatchInB);

    for (int i = 0; i < mismatchInA.size(); i++) {
      if (!mismatchInA.get(i)
                      .equals(mismatchInB.get(i))) {
        return false;
      }
    }

    return true;
  }
}
