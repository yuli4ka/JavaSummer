package problems;

import java.util.Scanner;

public class ANumbersFromOneToN {

  Scanner in;

  public ANumbersFromOneToN(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task prints numbers from one to N");
    System.out.println("Input positive number N, please");
    int a = in.nextInt();
    System.out.println(recursion(a));
  }

  public String recursion(int n) {
    if (n == 1) {
      return n + " ";
    }
    if (n > 1) {
      return recursion(n - 1) + n + " ";
    }
    return "Wrong input, sorry";
  }
}
