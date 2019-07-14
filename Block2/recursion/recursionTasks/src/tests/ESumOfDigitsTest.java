package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.ESumOfDigits;

public class ESumOfDigitsTest {

  private static ESumOfDigits eSumOfDigits;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    eSumOfDigits = new ESumOfDigits(in);
  }

  @Test
  public void digitsSum() {
    if (eSumOfDigits.digitsSum(3) != 3) {
      Assert.fail();
    }
    if (eSumOfDigits.digitsSum(12356) != 17) {
      Assert.fail();
    }
    if (eSumOfDigits.digitsSum(345) != 12) {
      Assert.fail();
    }
  }
}
