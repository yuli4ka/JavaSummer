package JavaSummer.Block6.View;

import JavaSummer.Block6.Controller.MyLocale;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

  private static String MESSAGE_BUNDLE_NAME = "messages";
  private ResourceBundle bundle = ResourceBundle.getBundle(
      MESSAGE_BUNDLE_NAME, new Locale(MyLocale.getLocale().getLanguage(), MyLocale.getLocale().getCountry()));

  public void printMessage(String...messages) {
    StringBuilder outMessage = new StringBuilder();
    for (String message: messages) {
      if (bundle.containsKey(message)) {
        outMessage.append(bundle.getString(message)).append(" ");
      } else {
        outMessage.append(message).append(" ");
      }
    }
    System.out.println(outMessage);
  }

}
