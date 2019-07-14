package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.CAckermanFunction;

public class CAckermanFunctionTest {

  private static CAckermanFunction cAckermanFunction;

  @BeforeClass
  public static void beforeClass() {
    Scanner in = new Scanner(System.in);
    cAckermanFunction = new CAckermanFunction(in);
  }

  @Test
  public void ackerman1() {
    int res = cAckermanFunction.ackerman(2, 2);
    if (res != 7) {
      Assert.fail();
    }
  }

  @Test
  public void ackerman2() {
    int res = cAckermanFunction.ackerman(1, 3);
    if (res != 5) {
      Assert.fail();
    }
  }

  @Test
  public void ackerman3() {
    int res = cAckermanFunction.ackerman(2, 4);
    if (res != 11) {
      Assert.fail();
    }
  }
}
