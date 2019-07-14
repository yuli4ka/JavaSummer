package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.ANumbersFromOneToN;

public class ANumbersFromOneToNTest {

  private static ANumbersFromOneToN aNumbersFromOneToN;

  @BeforeClass
  public static void beforeClass() {
    Scanner in = new Scanner(System.in);
    aNumbersFromOneToN = new ANumbersFromOneToN(in);
  }

  @Test
  public void recursionTest1() {
    String res = aNumbersFromOneToN.recursion(5);
    if (!res.equals("1 2 3 4 5 ")) {
      Assert.fail();
    }
  }

  @Test
  public void recursionTest2() {
    String res = aNumbersFromOneToN.recursion(1);
    if (!res.equals("1 ")) {
      Assert.fail();
    }
  }

  @Test
  public void recursionTest3() {
    String res = aNumbersFromOneToN.recursion(-2);
    if (!res.equals("Wrong input, sorry")) {
      Assert.fail();
    }
  }
}
