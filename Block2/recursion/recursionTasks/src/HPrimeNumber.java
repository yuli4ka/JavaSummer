import java.util.Scanner;

class HPrimeNumber {

  private Scanner in;

  HPrimeNumber(Scanner in) {
    this.in = in;
  }

  void doTask() {
    System.out.println("\n\nThis task checks if number N is prime");
    System.out.println("Input positive number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(isPrime(n, 2));
    } else {
      System.out.println("Wrong input, sorry");
    }
  }

  private boolean isPrime(int n, int i) {
    if (n == 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % i == 0) {
      return false;
    }
    if (i < Math.sqrt(n)) {
      return isPrime(n, i + 1);
    }
    return true;
  }

}
