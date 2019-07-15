package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.HPrimeNumber;

public class HPrimeNumberTest {

  private static HPrimeNumber hPrimeNumber;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    hPrimeNumber = new HPrimeNumber(in);
  }

  @Test
  public void isPrime1() {
    if (!hPrimeNumber.isPrime(7,2)) {
      Assert.fail();
    }
  }

  @Test
  public void isPrime2() {
    if (!hPrimeNumber.isPrime(19,2)) {
      Assert.fail();
    }
  }

  @Test
  public void isPrime3() {
    if (hPrimeNumber.isPrime(10,2)) {
      Assert.fail();
    }
  }

  @Test
  public void isPrime4() {
    if (hPrimeNumber.isPrime(1,2)) {
      Assert.fail();
    }
  }
}
