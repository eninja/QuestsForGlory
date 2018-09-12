/*Some phone usage rate may be described as follows:

first minute of a call costs min1 cents,
each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
each minute after 10th costs min11 cents.
You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?*/

package pl.eninja.codefights.arcade.core;

class PhoneCall {
    int phoneCall(int min1, int min2_10, int min11, int s) {
        int minutes = 0;

        if (min1 > s) return minutes;

        if (min1 <= s) {
            s = s - min1;
            minutes++;
        }

        for (int i = 2; s > min2_10 && i <= 10; i++) {
            s = s - min2_10;
            minutes++;
            if (s < min2_10) return minutes;
        }

        while (s > 0 && s >= min11) {
            s = s - min11;
            minutes++;
        }

        return minutes;
    }

}
