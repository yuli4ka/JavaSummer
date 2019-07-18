package tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import main.calculation.Arithmetics;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {

  private static Arithmetics arithmetics;

  @Rule
  public final ExpectedException exp = ExpectedException.none();

  @Rule
  public Timeout time = new Timeout(1000);

  @BeforeClass
  public static void beforeClass() {
    arithmetics = new Arithmetics();
  }


  @Test
  public void add() {
    double res = arithmetics.add(3, 7);
    Assert.assertEquals(10.0, res, 0.0);
  }

  @Test
  public void deduct() {
    double res = arithmetics.deduct(3, 7);
    Assert.assertEquals(-4, res, 0.0);
  }

  @Test
  public void mult() {
    double res = arithmetics.mult(3, 7);
    Assert.assertEquals(21, res, 0.0);
  }

  @Test
  public void divide() {
    double res = arithmetics.divide(10, 5);
    Assert.assertEquals(2, res, 0.0);

//    try {
//      arithmetics.divide(10,0);
//      Assert.fail();
//    } catch (Exception e) {}

  }

  //  @Test(expected = ArithmeticException.class)
  @Test
  public void divideExeption() {
    exp.expect(ArithmeticException.class);
    arithmetics.divide(10.0, 0.0);
  }

  //  @Test(timeout = 1000)
  @Test
  public void testN() {
    while (true) {
    }
  }

}

