package net.dpunosevac.adventofcode.year2015.day03;

import net.dpunosevac.adventofcode.common.AbstractDay;

public class Year2015Day03 extends AbstractDay {

  public Year2015Day03() {
    super(2015, 3);
  }

  @Override
  public String solvePart1() {
    HouseGrid grid = new HouseGrid();
    grid.deliverPresents(getRiddleInput().firstLine());
    int houseVisited = grid.countHousesVisited();
    return Integer.toString(houseVisited);
  }

  @Override
  public String solvePart2() {
    HouseGrid grid = new HouseGrid();
    grid.deliverPresentsUsingRoboSanta(getRiddleInput().firstLine());
    int houseVisited = grid.countHousesVisited();
    return Integer.toString(houseVisited);
  }
}
