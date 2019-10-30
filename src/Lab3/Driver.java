package Lab3;

import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {

    // 1. Create an ArrayList<Piece> to include all types of pieces
    ArrayList<Piece> pieces = new ArrayList<Piece>() {
      {
        add(new Pawn(true, false, null));
        add(new Pawn(true, false, new Queen(true)));
        add(new Knight(true));
        add(new Bishop(true));
        add(new Rook(true));
        add(new Queen(true));
        add(new King(true));
      }
    };

    // 2. Using for-each loop, call move() method on each Piece to print the moves.
    for (Piece p :pieces) {
      System.out.println(p);
      p.move();
      System.out.println();
    }

    // 3. Create the following Pawns
    Pawn[] pawns = new Pawn[] {
        new Pawn(true, true, new Queen(true)),
        new Pawn(true, false, null),
        new Pawn(false, false, null),
        new Pawn(false, true, new Queen(true)),
        new Pawn(true, true, new Knight(true))
    };

    // 4. Use equals() method to compare the following
    System.out.println(pawns[0].equals(pawns[1])); // false
    System.out.println(pawns[0].equals(pawns[3])); // false
    System.out.println(pawns[0].equals(pawns[4])); // false
    System.out.println(pawns[1].equals(pawns[2])); // false
    System.out.println(pawns[3].equals(pawns[4])); // false
  }
}
