package net.dpunosevac.adventofcode.year2015.day05;

public class ImprovedStringValidator {

  static boolean isNice(String input) {
    if (input.length() < 3) {
      return false;
    }

    final char[] chars = input.toCharArray();
    char antepenultimate = chars[0];
    char previous = chars[1];
    boolean containsBrace = false;
    boolean containsRepeatingPair = false;

    for (int i = 2; i < chars.length; i++) {
      final char current = chars[i];

      if (!containsRepeatingPair) {
        final String pair = String.format("%c%c", antepenultimate, previous);
        if (input.indexOf(pair, i) != -1) {
          containsRepeatingPair = true;
        }
      }

      if (!containsBrace && isBrace(antepenultimate, current)) {
        containsBrace = true;
      }

      if (containsRepeatingPair && containsBrace) {
        return true;
      }

      antepenultimate = previous;
      previous = current;
    }

    return false;
  }

  private static boolean isBrace(char antepenultimate, char current) {
    return antepenultimate == current;
  }
}
