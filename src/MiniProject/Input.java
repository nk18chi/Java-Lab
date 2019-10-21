package MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

  private String input;
  ArrayList<String> inputHistory;

  public Input(ArrayList<String> inputHistory) {
    this.inputHistory = inputHistory;
    this.setInput();
  }

  public String getInput() {
    return input;
  }

  public void setInput() {
    Scanner in = new Scanner(System.in);
    String i = "";
    boolean b = true;

    while (b) {
      System.out.print("Guess a letter: ");
      i = in.nextLine();
      b = checkInput(i);
    }

    this.input = i;
  }

  public boolean checkInput(String i){

    if (i.length() != 1) {
      System.out.println("the number of letters must be one letter.");
      return true;
    }

    // check if input is included by input history.
    for (String str:inputHistory) {
      if (str.equals(i)) {
        System.out.println(String.format("\"%s\" is already typed before.", i));
        return true;
      }
    }

    return false;
  }


}
