package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.FDigitsFromRightToLeft;

public class FDigitsFromRightToLeftTest {

  private static FDigitsFromRightToLeft fDigitsFromRightToLeft;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    fDigitsFromRightToLeft = new FDigitsFromRightToLeft(in);
  }

  @Test
  public void digitsFromRightToLeft() {
    if (!fDigitsFromRightToLeft.digitsFromRightToLeft(12345).equals("5 4 3 2 1")) {
      Assert.fail();
    }
  }
}
