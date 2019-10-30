package Lab3;

public class Bishop extends Piece {

  public static final String NAME = "Bishop";
  public static final String MOVE_MESSAGE = "Diagonally";

  public Bishop(boolean isWhite) {
    super(3, isWhite);
  }

  @Override
  public void move() {
    System.out.println(MOVE_MESSAGE);
  }

  @Override
  public String getName() {
    return NAME;
  }

}
