import java.util.Scanner;

public class FDigitsFromRightToLeft {

  private Scanner in;

  FDigitsFromRightToLeft(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task output digits of number N from right to left");
    System.out.println("Input integer number N, please");
    int n = in.nextInt();
    if (n > 0) {
      digitsFromRightToLeft(n);
    } else {
      digitsFromRightToLeft(-n);
    }
  }

  private void digitsFromRightToLeft(int n) {
    if (n < 10) {
      System.out.print(n + " ");
    } else {
      System.out.print(n % 10 + " ");
      digitsFromRightToLeft(n / 10);
    }
  }

}
