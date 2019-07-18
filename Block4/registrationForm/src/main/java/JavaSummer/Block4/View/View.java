package main.java.JavaSummer.Block4.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

  private static String MESSAGE_BUNDLE_NAME = "messages";
  private ResourceBundle bundle = ResourceBundle.getBundle(
      MESSAGE_BUNDLE_NAME);
//  MESSAGE_BUNDLE_NAME, new Locale("ua", "UA"));

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
