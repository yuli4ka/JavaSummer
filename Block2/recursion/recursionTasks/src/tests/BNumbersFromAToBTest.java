package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.BNumbersFromAToB;

public class BNumbersFromAToBTest {

  private static BNumbersFromAToB bNumbersFromAToB;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    bNumbersFromAToB = new BNumbersFromAToB(in);
  }

  @Test
  public void recursion1() {
    String res = bNumbersFromAToB.recursion(-2, -6);
    if (!res.equals("-2 -3 -4 -5 -6")) {
      Assert.fail();
    }
  }

  @Test
  public void recursion2() {
    String res = bNumbersFromAToB.recursion(-2, -2);
    if (!res.equals("-2")) {
      Assert.fail();
    }
  }

  @Test
  public void recursion3() {
    String res = bNumbersFromAToB.recursion(2, 6);
    if (!res.equals("2 3 4 5 6")) {
      Assert.fail();
    }
  }

  @Test
  public void recursion4() {
    String res = bNumbersFromAToB.recursion(6, 2);
    if (!res.equals("6 5 4 3 2")) {
      Assert.fail();
    }
  }
}
