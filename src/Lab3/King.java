package Lab3;

public class King extends Piece {

  public static final String NAME = "King";
  public static final String MOVE_MESSAGE = "One square";

  public King(boolean isWhite) {
    super(1000, isWhite);
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
