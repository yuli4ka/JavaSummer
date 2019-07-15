package problems;

import java.util.Scanner;

public class JPalindrome {

  Scanner in;

  public JPalindrome(Scanner in) {
    this.in = in;
  }

  public void doTask() {
    System.out.println("\n\nThis task check if word is palindrome");
    System.out.println("Input word, please");
    String s = in.nextLine();
    System.out.println(palindrome(s, 0));
  }

  public boolean palindrome(String s, int i) {
    if (i > s.length() / 2) {
      return true;
    }
    if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
      return palindrome(s, i + 1);
    }
    return false;
  }
}