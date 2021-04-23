package net.dpunosevac.adventofcode.year2015.day02;

import net.dpunosevac.adventofcode.common.AbstractDay;

import java.util.List;
import java.util.stream.Collectors;

public class Year2015Day02 extends AbstractDay {

  private List<Package> packages;

  public Year2015Day02() {
    super(2015, 2);
  }

  private List<Package> getPackages() {
    if (packages == null) {
      packages = getRiddleInput().lines().map(Package::fromString).collect(Collectors.toList());
    }

    return packages;
  }

  @Override
  public String solvePart1() {
    final int totalPaperNeeded = getTotalPaperNeeded();
    return Integer.toString(totalPaperNeeded);
  }

  @Override
  public String solvePart2() {
    final int totalRibbon = getTotalRibbonNeeded();
    return Integer.toString(totalRibbon);
  }

  private int getTotalPaperNeeded() {
    return getPackages().stream().mapToInt(Package::getAreaOfPackingPaperNeeded).sum();
  }

  private int getTotalRibbonNeeded() {
    return getPackages().stream().mapToInt(Package::getLengthOfRibbonNeeded).sum();
  }
}
