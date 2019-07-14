package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.GDigitsFromLeftToRight;

public class GDigitsFromLeftToRightTest {

  private static GDigitsFromLeftToRight gDigitsFromLeftToRight;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    gDigitsFromLeftToRight = new GDigitsFromLeftToRight(in);
  }

  @Test
  public void digitsFromLeftToRight() {
    if (!gDigitsFromLeftToRight.digitsFromLeftToRight(12345).equals("1 2 3 4 5 ")) {
      Assert.fail();
    }
  }
}
