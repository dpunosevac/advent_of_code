package net.dpunosevac.adventofcode.year2015.day04;

import net.dpunosevac.adventofcode.common.AbstractDay;

import java.util.stream.IntStream;

public class Year2015Day04 extends AbstractDay {

  private final CoinGenerator cg = new CoinGenerator(getRiddleInput().firstLine());

  public Year2015Day04() {
    super(2015, 4);
  }

  @Override
  public String solvePart1() {
    int coinInput =
        IntStream.iterate(1, i -> i + 1).filter(cg::isAdventCoin).findFirst().orElse(-1);
    return Integer.toString(coinInput);
  }

  @Override
  public String solvePart2() {
    int coinInput =
        IntStream.iterate(1, i -> i + 1).filter(cg::isImprovedAdventCoin).findFirst().orElse(-1);
    return Integer.toString(coinInput);
  }
}
