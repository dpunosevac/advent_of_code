package net.dpunosevac.adventofcode.year2015.day05;

import net.dpunosevac.adventofcode.common.AbstractDay;

public class Year2015Day05 extends AbstractDay {

  public Year2015Day05() {
    super(2015, 5);
  }

  @Override
  public String solvePart1() {
    long niceStringCount = getRiddleInput().lines().filter(StringValidator::isNice).count();
    return Long.toString(niceStringCount);
  }

  @Override
  public String solvePart2() {
    long niceStringCount = getRiddleInput().lines().filter(ImprovedStringValidator::isNice).count();
    return Long.toString(niceStringCount);
  }
}
