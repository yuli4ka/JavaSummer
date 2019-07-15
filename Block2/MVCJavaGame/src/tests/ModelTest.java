package tests;


import calculations.Constants;
import calculations.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

  private static Model model;

  @BeforeClass
  public static void beforeClass() {
    model = new Model();
  }

  @Ignore
  @Test
  public void getRandomNumber() {
    for (int i = 0; i < 10000; i++) {
      int number = model.getRandomNumber(Constants.LOW, Constants.HIGH);
      if (number >= Constants.HIGH || number <= Constants.LOW) {
        Assert.fail();
      }
      if (number == Constants.LOW + 1) {
        System.out.println("get LOW!");
      } else if (number == Constants.HIGH - 1) {
        System.out.println("get HIGH!");
      }
    }
  }
}
