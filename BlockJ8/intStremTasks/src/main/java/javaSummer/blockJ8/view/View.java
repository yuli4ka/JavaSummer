package javaSummer.blockJ8.view;

public class View {

  public void printMessage(String... messages) {
    StringBuilder outMessage = new StringBuilder();
    for (String message : messages) {
      outMessage.append(message).append(" ");
    }
    System.out.println(outMessage);
  }

}
