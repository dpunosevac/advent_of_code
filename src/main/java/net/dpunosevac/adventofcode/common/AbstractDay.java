package net.dpunosevac.adventofcode.common;

import java.time.LocalDate;

public abstract class AbstractDay implements Day {

  private final LocalDate localDate;
  private final RiddleInput riddleInput;

  protected AbstractDay(int year, int day) {
    this.localDate = LocalDate.of(year, 12, day);
    riddleInput = new RiddleInput(localDate);
  }

  public LocalDate getDate() {
    return localDate;
  }

  public RiddleInput getRiddleInput() {
    return riddleInput;
  }
}
