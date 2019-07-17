import Patterns.EnglishPatterns;
import java.util.Scanner;

class Controller {

  private Model model;
  private View view;
  private Scanner in;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    in = new Scanner(System.in);
  }

  void startTask() {
    view.printMessage(View.YOUR_ANSWER_IS + getNameForPattern(View.ENTER_YOUR_SURNAME));
    view.printMessage(View.YOUR_ANSWER_IS + getNameForPattern(View.ENTER_YOUR_NAME));
    view.printMessage(View.YOUR_ANSWER_IS + getNameForPattern(View.ENTER_YOUR_PATRONYMIC));
  }

  private String getNameForPattern(String message) {
    view.printMessage(message);
    String name = in.nextLine();
    while (!EnglishPatterns.namePattern.matcher(name).matches()) {
      view.printMessage(View.WRONG_INPUT);
      view.printMessage(message);
      name = in.nextLine();
    }
    return name;
  }

}
