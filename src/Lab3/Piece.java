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
  public abstract int getValue();
  public abstract void setValue(int value);
  public abstract boolean isWhite();

  @Override
  public String toString() {
    return String.format("%s {value='%s'}", getName(), getValue());
  }

  @Override
  public boolean equals(Object obj) {
    return value == ((Piece) obj).getValue() && isWhite == ((Piece) obj).isWhite;
  }

}
