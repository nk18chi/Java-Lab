package Lab3;

import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {

    // 3. Create the following Pawns
    Pawn[] pawnList = new Pawn[] {
        new Pawn(true, true, "Queen"),
        new Pawn(true, false, null),
        new Pawn(false, false, null),
        new Pawn(false, true, "Queen"),
        new Pawn(true, true, "Knight")
    };

    for (Pawn p : pawnList) {
      System.out.println(p.toString());
    }

    // 4. Use equals() method to compare the following
    System.out.println(pawnList[0].equals(pawnList[1])); // false
    System.out.println(pawnList[0].equals(pawnList[3])); // false
    System.out.println(pawnList[0].equals(pawnList[4])); // false
    System.out.println(pawnList[1].equals(pawnList[2])); // false
    System.out.println(pawnList[3].equals(pawnList[4])); // false
  }
}
