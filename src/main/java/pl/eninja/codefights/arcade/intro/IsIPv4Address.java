package pl.eninja.codefights.arcade.intro;

class IsIPv4Address {

  static boolean check(String inputString) {
    String[] strings = inputString.split("\\.");
    if (strings.length != 4) {
      return false;
    }
    for (String string : strings) {
      int parseInt;
      try {
        parseInt = Integer.parseInt(string);
      } catch (NumberFormatException e) {
        e.printStackTrace();
        return false;
      }
      if (parseInt < 0 || parseInt > 255) {
        return false;
      }
    }

    return true;
  }
}
