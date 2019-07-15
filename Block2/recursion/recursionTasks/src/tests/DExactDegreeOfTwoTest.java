package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.DExactDegreeOfTwo;

public class DExactDegreeOfTwoTest {

  private static DExactDegreeOfTwo dExactDegreeOfTwo;

  @BeforeClass
  public static void beforeClass() {
    Scanner in = new Scanner(System.in);
    dExactDegreeOfTwo = new DExactDegreeOfTwo(in);
  }

  @Test
  public void recursion() {
    if (!dExactDegreeOfTwo.recursion(4)) {
      Assert.fail();
    }
    if (!dExactDegreeOfTwo.recursion(32)) {
      Assert.fail();
    }
    if (dExactDegreeOfTwo.recursion(5)) {
      Assert.fail();
    }
  }


}