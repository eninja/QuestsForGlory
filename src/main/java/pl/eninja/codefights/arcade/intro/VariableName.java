/* Correct variable names consist only of English letters, digits and underscores and they can't
start with a digit.

Check if the given string is a correct variable name.

Example

For name = &quot;var_1__Int&quot;, the output should be
variableName(name) = true;
For name = &quot;qq-q&quot;, the output should be
variableName(name) = false;
For name = &quot;2w2&quot;, the output should be
variableName(name) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] string name

Guaranteed constraints:
1 ≤ name.length ≤ 10.

[output] boolean

true if name is a correct variable name, false otherwise. */

package pl.eninja.codefights.arcade.intro;

class VariableName {

  static boolean isCorrectName(String name) {
    for (char c : name.toCharArray()) {
      if (!Character.isDigit(c) && !Character.isLetter(c) && c != '_') {
        return false;
      }
    }
    return !Character.isDigit(name.charAt(0));
  }
}
