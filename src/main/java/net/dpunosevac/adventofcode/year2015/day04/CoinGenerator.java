package net.dpunosevac.adventofcode.year2015.day04;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class CoinGenerator {

  private final String secretKey;
  private final MessageDigest md;

  CoinGenerator(String secretKey) {
    this.secretKey = secretKey;

    try {
      md = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("Somehow there is no MD5 available", e);
    }
  }

  String getCoinHash(int input) {
    byte[] digest = getDigest(input);
    return toString(digest);
  }

  boolean isAdventCoin(int input) {
    byte[] digest = getDigest(input);
    return hasFiveLeadingZeros(digest);
  }

  boolean isImprovedAdventCoin(int input) {
    byte[] digest = getDigest(input);
    return hasSixLeadingZeros(digest);
  }

  private byte[] getDigest(int input) {
    String eatMe = secretKey + input;
    return md.digest(eatMe.getBytes());
  }

  /**
   * We are interested in 5 leading zeros in hexadecimal, therefore that should be first 2 bytes 0
   * and 3rd byte between 0 and 16 (excluded) (01, 02, 03, ..., 0F)
   */
  private boolean hasFiveLeadingZeros(byte[] digest) {
    return digest[0] == 0 && digest[1] == 0 && digest[2] >= 0 && digest[2] < 16;
  }

  private boolean hasSixLeadingZeros(byte[] digest) {
    return digest[0] == 0 && digest[1] == 0 && digest[2] == 0;
  }

  private String toString(byte[] digest) {
    return String.format("%032x", new BigInteger(1, digest));
  }
}
