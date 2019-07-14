package problems;

import java.util.Scanner;

public class IFactorization {

  Scanner in;

  public IFactorization(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task output factorization of number N");
    System.out.println("Input positive number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(factorization(n, 2));
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  public String factorization(int n, int i) {
    if (n == 1) {
      return "";
    }
    if (n % i == 0) {
      return i + " " + factorization(n / i, i);
    } else {
      return factorization(n, i + 1);
    }
  }

}
