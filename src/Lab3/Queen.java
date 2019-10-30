package Lab3;

public class Queen extends Piece {

  public static final String NAME = "Queen";
  public static final String MOVE_MESSAGE = "Like bishop and rook";

  public Queen(boolean isWhite) {
    super(9, isWhite);
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
