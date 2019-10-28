package MiniProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameController {

  public static void main(String[] args) {
    GameController game = new GameController();
//    System.out.println(game.getAnswer());
    while (game.getMissingCount() < game.REMAIN_COUNT ) {
      Input i = new Input(game.getInputHistory());
      game.addInputHistory(i.getInput());

      Question q = new Question(game.getAnswer(), i.getInput(), game.getCurrentResult());
      q.printResult();
      if (!q.isMatch()) {
        game.addInputWrongHistory(i.getInput());
        game.addMissingCount();
      }

      if (q.isCorrect()) break;

      game.printMissingCount();
      game.setCurrentResult(q.getResult());
      game.setInputHistory(game.getInputHistory());
      game.setInputWrongHistory(game.getInputWrongHistory());
    }

    if (game.getMissingCount() == 10) {
      game.printEndFailureStatement();
    } else {
      game.printEndSuccessStatement();
    }
  }


  public static final int REMAIN_COUNT = 10;

  private String answer;
  private String currentResult;
  private int missingCount;
  ArrayList<String> inputHistory;
  ArrayList<String> inputWrongHistory;


  public GameController() {

    this.setAnswer();
    this.missingCount = 0;
    this.initializeCurrentResult(this.answer);
    this.inputHistory = new ArrayList<String>();
    this.inputWrongHistory = new ArrayList<String>();

    printStartStatement();
    System.out.println(getCurrentResult());

  }

  public String getAnswer() {
    return answer;
  }

  public int getMissingCount() {
    return missingCount;
  }

  public String getCurrentResult() {
    return currentResult;
  }

  public ArrayList<String> getInputHistory() {
    return inputHistory;
  }

  public ArrayList<String> getInputWrongHistory() {
    return inputWrongHistory;
  }

  public void initializeCurrentResult(String a) {
    String result = "";
    for (int i = 0; i < a.length(); i++) {
      result += a.charAt(i) == ' ' ? " " : "_";
    }
    this.currentResult = result;
  }

  public void setAnswer() {
    /**
     * Reference: https://stackoverflow.com/questions/2218005/how-to-get-a-random-line-of-a-text-file-in-java
     */
    String result = null;
    Random r = new Random();
    int n = 1;

    try {
      File f = new File("src/MiniProject/cities.txt");
      Scanner in = new Scanner(f);

      for(Scanner sc = new Scanner(f); sc.hasNext(); )
      {
        String line = sc.nextLine();
        if(r.nextInt(n) == 0)
          result = line;
        ++n;
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not exist.");
    }

    this.answer = result;
  }

  public void setCurrentResult(String currentResult) {
    this.currentResult = currentResult;
  }

  public void setInputHistory(ArrayList<String> inputHistory) {
    this.inputHistory = inputHistory;
  }

  public void setInputWrongHistory(ArrayList<String> inputWrongHistory) {
    this.inputWrongHistory = inputWrongHistory;
  }


  public void addMissingCount() {
    this.missingCount++;
  }

  public void addInputHistory(String i) {
    inputHistory.add(i);
  }

  public void addInputWrongHistory(String i) {
    inputWrongHistory.add(i);
  }

  public void printStartStatement() {
    System.out.println("Here is the question.");
  }

  public void printEndSuccessStatement() {
    System.out.println("You win!");
    System.out.print(String.format("You have guessed '%s' correctly.", answer));
  }

  public void printEndFailureStatement() {
    System.out.println("You lose!");
    System.out.print(String.format("The correct word was '%s'!", answer));
  }


  public void printMissingCount() {
    String t = String.join(" ", inputWrongHistory);
    System.out.println(String.format("You have guessed (%s) wrong letters: %s", missingCount, t));
  }



}
