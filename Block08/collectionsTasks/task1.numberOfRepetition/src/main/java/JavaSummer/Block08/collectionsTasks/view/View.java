package JavaSummer.Block08.collectionsTasks.view;

public class View {

  public void printMessage(String... messages) {
    StringBuilder outMessage = new StringBuilder();
    for (String message : messages) {
      outMessage.append(message).append(" ");
    }
    System.out.println(outMessage);
  }

}
