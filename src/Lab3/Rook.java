package Lab3;

public class Rook extends Piece {

  public static final String NAME = "Rook";
  public static final String MOVE_MESSAGE = "Horizontally or vertically";

  public Rook(boolean isWhite) {
    super(5, isWhite);
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
