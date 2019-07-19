package main.java.JavaSummer.Block4.Controller;

import java.util.Locale;

public class MyLocale {

  private static Locale locale = Locale.getDefault();
//  private static Locale locale = new Locale("ua", "UA");

  public static void setLocale(Locale locale) {
    MyLocale.locale = locale;
  }

  public static Locale getLocale() {
    return locale;
  }
}
