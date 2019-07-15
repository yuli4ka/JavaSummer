package tests;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.JPalindrome;

public class JPalindromeTest {

  private static JPalindrome jPalindrome;

  @BeforeClass
  public static void setUp() {
    Scanner in = new Scanner(System.in);
    jPalindrome = new JPalindrome(in);
  }

  @Test
  public void palindrome1() {
    if (!jPalindrome.palindrome("erttre", 0)) {
      Assert.fail();
    }
  }

  @Test
  public void palindrome2() {
    if (!jPalindrome.palindrome("ertre", 0)) {
      Assert.fail();
    }
  }

  @Test
  public void palindrome3() {
    if (jPalindrome.palindrome("etre", 0)) {
      Assert.fail();
    }
  }
}
