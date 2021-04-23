package net.dpunosevac.adventofcode.year2015.day04;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CoinGeneratorTest {

  @Test
  void getCoinHash() {
    final String secret = "abcdef";
    final int input = 609043;
    final String expected = "000001dbbfa";
    final CoinGenerator cg = new CoinGenerator(secret);

    final String actual = cg.getCoinHash(input);
    System.out.println(actual);
    assertTrue(actual.startsWith(expected));
  }

  @Test
  void binaryHex() {
    String input = "A";
    int decimal = Integer.parseUnsignedInt(input, 2);
    System.out.println(decimal);
  }
}
