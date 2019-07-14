package problems;

import java.util.Scanner;

public class DExactDegreeOfTwo {

  private Scanner in;

  public DExactDegreeOfTwo(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task checks if a number N is a power of two");
    System.out.println("Input positive number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(recursion(n));
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  public boolean recursion(int n) {
    if (n == 2) {
      return true;
    }
    if (n % 2 == 1) {
      return false;
    }
    return recursion(n / 2);
  }

}
