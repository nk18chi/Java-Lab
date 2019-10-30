package Lab3;

public class Knight extends Piece  {

  public static final String NAME = "Knight";
  public static final String MOVE_MESSAGE = "Like an L";

  public Knight(boolean isWhite) {
    super(2, isWhite);
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
