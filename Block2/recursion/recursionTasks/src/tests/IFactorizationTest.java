package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.IFactorization;

public class IFactorizationTest {

  private static IFactorization iFactorization;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    iFactorization = new IFactorization(in);
  }

  @Test
  public void factorization1() {
    if (!iFactorization.factorization(45,2).equals("3 3 5 ")) {
      Assert.fail();
    }
  }

  @Test
  public void factorization2() {
    if (!iFactorization.factorization(50,2).equals("2 5 5 ")) {
      Assert.fail();
    }
  }
}
