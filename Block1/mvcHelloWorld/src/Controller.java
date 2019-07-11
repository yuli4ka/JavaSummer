import java.util.Scanner;

class Controller {

  // The Constants
  private static final String HELLO = "Hello";
  private static final String WORLD = "world!";

  // Constructor
  private Model model;
  private View view;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  // The Work method
  void processUser() {
    Scanner sc = new Scanner(System.in);
    model.setValue(inputIntValueWithScanner(sc, HELLO));
    model.addValue(inputIntValueWithScanner(sc, WORLD));

    view.printMessageAndString('\n' + View.STRING_VALUE, model.getValue());
  }

  // The Utility methods
  private String inputIntValueWithScanner(Scanner sc, String wantedWord) {
    view.printMessage(View.INPUT_STRING_VALUE);
    String word = sc.nextLine();
    while (!word.equals(wantedWord)) {
      view.printMessage('\n' + View.WRONG_INPUT_REPEAT_PLEASE + "\n\n" + View.INPUT_STRING_VALUE);
      word = sc.nextLine();
    }
    return word;
  }
}