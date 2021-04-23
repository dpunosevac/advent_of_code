package net.dpunosevac.adventofcode.year2015.day03;

class Santa {

  private Coordinate position;

  Santa(Coordinate startPosition) {
    this.position = startPosition;
  }

  void moveInDirection(Direction direction) {
    this.position = position.moveTo(direction);
  }

  public Coordinate getPosition() {
    return position;
  }
}
