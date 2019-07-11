import java.util.Scanner;

class GDigitsFromLeftToRight {

  private Scanner in;

  GDigitsFromLeftToRight(Scanner in) {
    this.in = in;
  }

  void doTask() {
    System.out.println("\n\nThis task output digits of number N from left to right");
    System.out.println("Input integer number N, please");
    int n = in.nextInt();
    if (n > 0) {
      digitsFromLeftToRight(n);
    } else {
      digitsFromLeftToRight(-n);
    }
  }

  private void digitsFromLeftToRight(int n) {
    if (n < 10) {
      System.out.print(n + " ");
    } else {
      digitsFromLeftToRight(n / 10);
      System.out.print(n % 10 + " ");
    }
  }

}
