import java.util.Scanner;

public class BNumbersFromAToB {

  private Scanner in;

  BNumbersFromAToB(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task prints numbers from A to B");
    System.out.println("Input numbers A and B, please");
    int a = in.nextInt(), b = in.nextInt();
    recursion(a, b);
  }

  private void recursion(int a, int b) {
    if (a < b) {
      System.out.print(a + " ");
      recursion(a + 1, b);
    } else if (a == b) {
      System.out.print(a);
    } else {
      System.out.print(a + " ");
      recursion(a - 1, b);
    }
  }
}
