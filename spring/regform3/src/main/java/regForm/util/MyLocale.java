package regForm.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyLocale {

  private static List<Locale> localeList;
  private static Locale locale = Locale.getDefault();

  static {
    localeList = new ArrayList<>();
    localeList.add(Locale.getDefault());
    localeList.add(new Locale("ua", "UA"));
  }

  public static List<Locale> getLocaleList() {
    return localeList;
  }

  public static void setLocale(Locale locale) {
    MyLocale.locale = locale;
  }

  public static Locale getLocale() {
    return locale;
  }
}