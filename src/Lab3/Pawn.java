package Lab3;

public class Pawn extends Piece {

  public static final String NAME = "Pawn";
  public static final String MOVE_MESSAGE = "Forward 1";

  boolean promoted;
  String newPiece;

  public Pawn(boolean isWhite, boolean promoted, String newPiece) {
    super(1, isWhite);
    this.promoted = promoted;
    this.newPiece = newPiece;
  }

  @Override
  public void move() {
    System.out.println(MOVE_MESSAGE);
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public int getValue() {
    return value;
  }

  @Override
  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public boolean isWhite() {
    return isWhite;
  }

}
