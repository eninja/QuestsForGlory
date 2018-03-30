package pl.eninja.codefights.arcade.intro;
/*Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence
 by removing no more than one element from the array.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false;

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get
the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence,
otherwise return false.*/

import java.util.HashSet;
import java.util.Set;

public class AlmostIncreasingSequence {

  public static boolean isItPossible(int[] sequence) {

    if (sequence.length <= 3) return true;
    if (sequence[sequence.length - 2] < sequence[1]) return false;

    Set<Integer> integerSet = new HashSet<>();

    boolean isPossible = true;
    int counter = 0;
    int duplicate = 0;
    for (int i = 0; i < sequence.length - 1; i++) {
      if (sequence[i + 1] <= sequence[i]) {
        counter++;
      }
      if (counter > 1) {
        return false;
      }
      if (!integerSet.add(sequence[i])) {
        duplicate++;
      }
//
//      for (int j = 0; j < sequence.length; j++) {
//        if (i != j && sequence[i] == sequence[j]) {
//          duplicate++;
//        }
//      }
      if (duplicate >= 2) {
        return false;
      }
    }

    return isPossible;
  }
}

