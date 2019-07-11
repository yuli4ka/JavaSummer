import java.util.Scanner;

class ESumOfDigits {

  private Scanner in;

  ESumOfDigits(Scanner in) {
    this.in = in;
  }

  void doTask() {
    System.out.println("\n\nThis task output sum of digits for number N");
    System.out.println("Input integer number N, please");
    int n = in.nextInt();
    if (n > 0) {
      System.out.println(digitsSum(n));
    } else {
      System.out.println(digitsSum(-n));
    }
  }

  private int digitsSum(int n) {
    if (n < 10) {
      return n;
    }
    return digitsSum(n /10) + n % 10;
  }

}
