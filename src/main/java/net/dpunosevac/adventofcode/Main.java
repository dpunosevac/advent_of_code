package net.dpunosevac.adventofcode;

import net.dpunosevac.adventofcode.common.Day;
import net.dpunosevac.adventofcode.year2015.day01.Year2015Day01;
import net.dpunosevac.adventofcode.year2015.day02.Year2015Day02;
import net.dpunosevac.adventofcode.year2015.day03.Year2015Day03;
import net.dpunosevac.adventofcode.year2015.day04.Year2015Day04;
import net.dpunosevac.adventofcode.year2015.day05.Year2015Day05;

import java.util.List;

public class Main {

  private static final List<Day> days =
      List.of(
          new Year2015Day01(),
          new Year2015Day02(),
          new Year2015Day03(),
          new Year2015Day04(),
          new Year2015Day05());

  public static void main(String[] args) {
    final Day currentDay = days.get(days.size() - 1);
    System.out.println("Solution for " + currentDay.getDate().toString());
    System.out.println("Part 1: " + currentDay.solvePart1());
    System.out.println("Part 2: " + currentDay.solvePart2());
  }
}
