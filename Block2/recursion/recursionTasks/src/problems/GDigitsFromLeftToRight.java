package problems;

import java.util.Scanner;

public class GDigitsFromLeftToRight {

  private Scanner in;

  public GDigitsFromLeftToRight(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task output digits of number N from left to right");
    System.out.println("Input integer number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(digitsFromLeftToRight(n));
    } else {
      System.out.println(digitsFromLeftToRight(-n));
    }
  }

  public String digitsFromLeftToRight(int n) {
    if (n < 10) {
      return n + " ";
    } else {
      return "" + digitsFromLeftToRight(n / 10) + (n % 10) + " ";
    }
  }

}
