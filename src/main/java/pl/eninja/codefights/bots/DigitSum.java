package pl.eninja.codefights.bots;

class DigitSum {

  static int sum(int n) {
    if (n < 10) {
      return n;
    }
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n = n / 10;
    }
    return sum(sum);
  }
}
