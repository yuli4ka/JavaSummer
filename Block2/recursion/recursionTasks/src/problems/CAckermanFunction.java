package problems;

import java.util.Scanner;

public class CAckermanFunction {

  private Scanner in;

  public CAckermanFunction(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task prints Ackerman function A(M,N)");
    System.out.println("Input positive numbers M and N, please");
    int m = in.nextInt(), n = in.nextInt();
    if (m > 0 && n > 0) {
      System.out.println(ackerman(m, n));
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  public int ackerman(int m, int n) {
    if (m == 0) {
      return n + 1;
    } else if ((m > 0) && (n == 0)) {
      return ackerman(m - 1, 1);
    } else {
      return ackerman(m - 1, ackerman(m, n - 1));
    }
  }

}
