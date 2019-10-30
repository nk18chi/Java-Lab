package Lab3;

public abstract class Piece {
  int value;
  boolean isWhite;

  public Piece(int value, boolean isWhite) {
    this.value = value;
    this.isWhite = isWhite;
  }

  public abstract void move();
  public abstract String getName();

  @Override
  public String toString() {
    return String.format("%s {value=%s, isWhite=%s}", getName(), getValue(), isWhite());
  }

  @Override
  public boolean equals(Object obj) {
    return value == ((Piece) obj).getValue() && isWhite == ((Piece) obj).isWhite;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean isWhite() {
    return isWhite;
  }

}
