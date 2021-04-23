package net.dpunosevac.adventofcode.year2015.day01;

import net.dpunosevac.adventofcode.common.AbstractDay;

public class Year2015Day01 extends AbstractDay {

  public Year2015Day01() {
    super(2015, 1);
  }

  @Override
  public String solvePart1() {
    final long finalFloor = getFinalFloor(getRiddleInput().firstLine());
    return Long.toString(finalFloor);
  }

  @Override
  public String solvePart2() {
    final long firstTimeIntoBasement = getFirstTimeIntoBasement(getRiddleInput().firstLine());
    return Long.toString(firstTimeIntoBasement);
  }

  static long getFinalFloor(String input) {
    return input.chars().map(c -> parseInstruction((char) c)).sum();
  }

  static long getFirstTimeIntoBasement(String input) {
    int currentFloor = 0;

    for (int i = 0; i < input.length(); i++) {
      currentFloor += parseInstruction(input.charAt(i));
      if (currentFloor == -1) {
        return i + 1;
      }
    }

    return -1;
  }

  private static int parseInstruction(char instruction) {
    switch (instruction) {
      case '(':
        return 1;
      case ')':
        return -1;
      default:
        throw new IllegalArgumentException("Not a valid instruction");
    }
  }
}
