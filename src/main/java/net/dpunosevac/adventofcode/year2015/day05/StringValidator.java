package net.dpunosevac.adventofcode.year2015.day05;

public class StringValidator {

  static boolean isNice(String input) {
    final char[] chars = input.toCharArray();
    char previous = chars[0];
    int vowelCount = isVowel(previous) ? 1 : 0;
    int pairs = 0;

    for (int i = 1; i < chars.length; i++) {
      final char c = chars[i];

      if (isNaughty(previous, c)) {
        return false;
      }

      if (isVowel(c)) {
        vowelCount++;
      }

      if (previous == c) {
        pairs++;
      }

      previous = c;
    }

    return vowelCount >= 3 && pairs > 0;
  }

  private static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  private static boolean isNaughty(char previous, char current) {
    return previous == 'a' && current == 'b'
        || previous == 'c' && current == 'd'
        || previous == 'p' && current == 'q'
        || previous == 'x' && current == 'y';
  }
}
