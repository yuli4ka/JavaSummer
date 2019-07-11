import java.util.Scanner;

public class ANumbersFromOneToN {

  Scanner in;

  ANumbersFromOneToN(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task prints numbers from one to N");
    System.out.println("Input positive number N, please");
    int a = in.nextInt();
    if (a > 0) {
      recursion(a);
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  private void recursion(int n) {
    if (n == 1) {
      System.out.print(n + " ");
    }
    if (n > 1) {
      recursion(n - 1);
      System.out.print(n + " ");
    }
  }
}
