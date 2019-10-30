package Lab3;

public class Pawn extends Piece {

  public static final String NAME = "Pawn";
  public static final String MOVE_MESSAGE = "Forward 1";

  private boolean promoted;
  private Piece newPiece;

  public Pawn(boolean isWhite, boolean promoted, Piece newPiece) {
    super(1, isWhite);
    this.promoted = promoted;
    this.newPiece = newPiece;
  }

  public boolean isPromoted() {
    return promoted;
  }

  public Piece getNewPiece() {
    return newPiece;
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
  public boolean equals(Object obj) {
    Pawn that = (Pawn) obj;
    return super.equals(that) && promoted == that.isPromoted() && newPiece.equals(that.getNewPiece());
  }

  @Override
  public String toString() {
    return String.format("%s {value=%s, isWhite=%s, newPiece='%s'}", getName(), getValue(), isWhite(), getNewPiece());
  }

}
