package pl.eninja.codefights.arcade.intro;

class AllLongestStrings {

  static String[] print(String[] inputArray) {
    int max = inputArray[0].length();

    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i].length() > max) {
        max = inputArray[i].length();
      }
    }

    int counter = 0;
    for (String s : inputArray) {
      if (s.length() == max) {
        counter++;
      }
    }

    String[] result = new String[counter];
    int index = 0;
    for (String s : inputArray) {
      if (s.length() == max) {
        result[index] = s;
        index++;
      }
    }
    return result;
  }
}