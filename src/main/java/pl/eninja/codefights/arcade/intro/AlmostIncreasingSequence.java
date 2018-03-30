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

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {

  public static boolean isItPossibleSecondVersion(int[] sequence) {

    boolean isPossible = true;
    int counter = 0;
    for (int i = 0; i < sequence.length - 1; i++) {
      if (sequence[i + 1] <= sequence[i]) {
        counter++;
      }
      if (counter > 1) {
        isPossible = false;
      }
    }

    for (int i = 0; i < sequence.length; i++) {
      for (int j = 0; j < sequence.length; j++) {
        if (i != j && sequence[i] == sequence[j]) {
          return false;
        }
      }
    }
    return isPossible;
  }

  public static boolean isItPossibleFirstVersion(int[] sequence) {
    boolean isPossible = true;

    if (sequence.length == 2) return true;

    for (int removeInt : sequence) {
      List<Integer> increasingSequence = new ArrayList<>();
      for (int j = 0; j < sequence.length - 1; j++) {
        if (sequence[j] != removeInt) {
          increasingSequence.add(sequence[j]);
        }
      }
      for (int i = 0; i < increasingSequence.size(); i++) {
        for (int j = 0; j < increasingSequence.size(); j++) {
          if (i != j && increasingSequence.get(i) == increasingSequence.get(j)) {
            return false;
          }
        }
      }

      for (int i = 0; i < sequence.length; i++) {
        for (int j = 1; j < sequence.length; j++) {
          if (i != j && sequence[i] == sequence[j]) {
            return false;
          }
        }
      }

      for (int k = 0; k < increasingSequence.size() - 1; k++) {
        if (increasingSequence.get(k + 1) < increasingSequence.get(k)) {
          isPossible = false;
        }
      }
      if (isPossible) {
        break;
      }
    }

    return isPossible;
  }
}
