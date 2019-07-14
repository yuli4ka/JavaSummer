package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import calculation.Arithmetics;

public class TestArithmetics {
  private static Arithmetics arithmetics;

  @BeforeClass
  public static void beforeClass() {
    arithmetics = new Arithmetics();
  }


  @Test
  public void add() {
    double res = arithmetics.add(3, 7);
    if (res != 10) {
      Assert.fail();
    }
  }

  @Test
  public void deduct() {
    double res = arithmetics.deduct(3, 7);
    if (res != -4) {
      Assert.fail();
    }
  }

  @Test
  public void mult() {
    double res = arithmetics.mult(3, 7);
    if (res != 21) {
      Assert.fail();
    }
  }

  @Test
  public void divide() {
    double res = arithmetics.divide(10, 5);
    if (res != 2) {
      Assert.fail();
    }
  }
}
