package problems;

import java.util.Scanner;

public class FDigitsFromRightToLeft {

  private Scanner in;

  public FDigitsFromRightToLeft(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task output digits of number N from right to left");
    System.out.println("Input integer number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(digitsFromRightToLeft(n));
    } else {
      System.out.println(digitsFromRightToLeft(-n));
    }
  }

  public String digitsFromRightToLeft(int n) {
    if (n < 10) {
      return "" + n;
    } else {
      return n % 10 + " " + digitsFromRightToLeft(n / 10);
    }
  }

}
