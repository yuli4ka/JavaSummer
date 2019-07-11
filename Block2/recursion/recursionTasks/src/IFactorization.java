import java.util.Scanner;

class IFactorization {

  Scanner in;

  IFactorization(Scanner in) {
    this.in = in;
  }

  void doTask() {
    System.out.println("\n\nThis task output factorization of number N");
    System.out.println("Input positive number N, please");
    int n = in.nextInt();
    if (n > 0) {
      factorization(n, 2);
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  private void factorization(int n, int i) {
    if (n == 1) {
      return;
    }
    if (n % i == 0) {
      System.out.print(i + " ");
      factorization(n/i, i);
    } else {
      factorization(n, i + 1);
    }
  }

}
