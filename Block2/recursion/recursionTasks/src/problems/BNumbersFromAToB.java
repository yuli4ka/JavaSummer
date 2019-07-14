package problems;

import java.util.Scanner;

public class BNumbersFromAToB {

  private Scanner in;

  public BNumbersFromAToB(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task prints numbers from A to B");
    System.out.println("Input numbers A and B, please");
    int a = in.nextInt(), b = in.nextInt();
    System.out.println(recursion(a, b));
  }

  public String recursion(int a, int b) {
    if (a < b) {
      return a + " " + recursion(a + 1, b);
    } else if (a == b) {
      return "" + a;
    } else {
      return a + " " + recursion(a - 1, b);
    }
  }

//  private void recursion(int a, int b) {
//    if (a < b) {
//      System.out.print(a + " ");
//      recursion(a + 1, b);
//    } else if (a == b) {
//      System.out.print(a);
//    } else {
//      System.out.print(a + " ");
//      recursion(a - 1, b);
//    }
//  }
}
