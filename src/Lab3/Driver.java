package Lab3;

import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {

    // 1. Create an ArrayList<Piece> to include all types of pieces
    ArrayList<Piece> pieces = new ArrayList<Piece>() {
      {
        add(new Pawn(true, false, null));
        add(new Knight(true));
        add(new Bishop(true));
        add(new Rook(true));
        add(new Queen(true));
        add(new King(true));
      }
    };

    for (Piece p :pieces) {
      System.out.println(p);
    }



    // 3. Create the following Pawns
    Pawn[] pawns = new Pawn[] {
        new Pawn(true, true, "Queen"),
        new Pawn(true, false, null),
        new Pawn(false, false, null),
        new Pawn(false, true, "Queen"),
        new Pawn(true, true, "Knight")
    };

    // 4. Use equals() method to compare the following
    System.out.println(pawns[0].equals(pawns[1])); // false
    System.out.println(pawns[0].equals(pawns[3])); // false
    System.out.println(pawns[0].equals(pawns[4])); // false
    System.out.println(pawns[1].equals(pawns[2])); // false
    System.out.println(pawns[3].equals(pawns[4])); // false
  }
}
