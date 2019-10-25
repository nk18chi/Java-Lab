package BalancedTree;

import java.util.Scanner;

public class Tree {
  int num;
  int patterns;

  public Tree() {
    setNum();
    setPatterns();
  }

  public void setNum() {

    while (true) {
      Scanner in = new Scanner(System.in);

      try {
        System.out.print("Input integer: ");
        num = Integer.parseInt(in.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Error! Input must be integer.");
      }
    }
  }

  public void setPatterns() {
    this.patterns = countPatterns(num);
  }

  public int getPatterns() {
    return patterns;
  }

  public int countPatterns(int n) {

    if (n <= 2) {
      return 1;
    } else {
      int middle = n / 2;
      int count = 0;
      for (int i = n; 2 <= i; i--) {
        if (middle < i) {
          count++;
          continue;
        }
        count += this.countPatterns(n/i);
      }
      return count;
    }
  }

}
