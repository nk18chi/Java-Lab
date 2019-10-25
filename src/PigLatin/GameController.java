package PigLatin;

import java.util.*;

public class GameController {

  public static final int THE_NUMBER_OF_LETTERS = 26;

  public static final Map<String, Integer> VOWEL_DICT = new HashMap<String, Integer>() {
    {
      put("a", 1);
      put("e", 5);
      put("i", 9);
      put("o", 15);
      put("u", 21);
    }
  };

  public static final Map<String, Integer> CONSONANT_DICT = new HashMap<String, Integer>() {
    {
      put("b", 2);
      put("c", 3);
      put("d", 4);
      put("f", 6);
      put("g", 7);
      put("h", 8);
      put("j", 10);
      put("k", 11);
      put("l", 12);
      put("m", 13);
      put("n", 14);
      put("p", 16);
      put("q", 17);
      put("r", 18);
      put("s", 19);
      put("t", 20);
      put("v", 22);
      put("w", 23);
      put("x", 24);
      put("y", 25);
      put("z", 26);
    }
  };

  private String input;
  private String output;

  public GameController() {
    setInput();
    setOutput();
    printOutput();
  }

  public GameController(String input) {
    this.input = input;
    setOutput();
  }

  public void setInput() {
    String i = "";

    while(true) {
      Scanner in = new Scanner(System.in);
      System.out.print("type word: ");
      i = in.nextLine();

      if (!checkOneWordOrNot(i)) {
        System.out.println("You must type only one word.");
        continue;
      }

      if (!checkLowerCase(i)) {
        System.out.println("All letters must be lower case.");
        continue;
      }

      if (!checkInputLength(i)){
        System.out.println("The length of input must be over 1 and less than 30.");
        continue;
      }

      break;
    }

    this.input = i;
  }

  public void setOutput() {
    String r = "";
    for (int i = 0; i < input.length(); i++) {
      String s = input.substring(i, i+1);
      r += s;

      int num = getVowelNumber(s);
      if (0 == num) {
        r += getSecondLetter(s);
        r += getThirdLetter(s);
      }
    }

    this.output = r;

  }

  public boolean checkOneWordOrNot(String i) {
    String[] split = i.split(" ");
    return split.length < 2;
  }

  public boolean checkLowerCase(String i) {

    return i.equals(i.toLowerCase());
  }

  public boolean checkInputLength(String i) {

    return 1 <= i.length() && i.length() <= 30;
  }

  public int getVowelNumber(String i) {
    return VOWEL_DICT.get(i) == null ? 0 : VOWEL_DICT.get(i);
  }

  public int getConsonantNumber(String i) {
    return CONSONANT_DICT.get(i) == null ? 0 : CONSONANT_DICT.get(i);
  }

  public String getClosestLetter(Map<String, Integer> map, int num, boolean isAbs) {
    List<Integer> list = new ArrayList<>(map.values());

    int distance = THE_NUMBER_OF_LETTERS;
    int index = list.size() -1;
    int tmp;

    for (int i = 0; i < list.size(); i++) {

      tmp = isAbs ? Math.abs(num - list.get(i)) : list.get(i) - num;
      if (tmp < distance && 0 < distance && 0 < tmp) {
        distance = tmp;
        index = i;
      }
    }

    List keys = new ArrayList(map.keySet());

    return keys.get(index).toString();
  }

  public String getSecondLetter(String s) {
    int i = getConsonantNumber(s);
    return getClosestLetter(VOWEL_DICT, i, true);
  }

  public String getThirdLetter(String s) {
    int i = getConsonantNumber(s);
    return getClosestLetter(CONSONANT_DICT, i, false);
  }

  public String getOutput() {
    return output;
  }

  public void printOutput() {
    System.out.println(output);
  }


}
