import java.util.ArrayList;
import java.util.Scanner;

class Controller {

  private Model model;
  private View view;

  private int low = 0;
  private int high = 100;

  private ArrayList<Integer> previousAttempts;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    previousAttempts = new ArrayList<>();
  }

  void doTask() {
    Scanner in = new Scanner(System.in);
    for (; ; ) {
      view.printRange(low, high);
      int number = getIntNumber(in);
      if (number < low || number > high) {
        view.printMessage(View.YOUR_NUMBER_IS_OUT_OF_RANGE);
      } else {
        previousAttempts.add(number);
        if (model.isHiddenNumber(number)) {
          view.printMessage(View.YOU_GUESSED_HIDDEN_NUMBER);
          outStatistic();
          in.close();
          return;
        } else if (model.lessThanHiddenNumber(number)) {
          view.printMessagePlusInt(View.HIDDEN_NUMBER_GREATER_THAN, number);
          low = number + 1;
        } else {
          view.printMessagePlusInt(View.HIDDEN_NUMBER_LESS_THAN, number);
          high = number - 1;
        }
      }
    }
  }

  private void outStatistic() {
    view.printMessage(View.ALL_HISTORY_OF_YOUR_ATTEMPTS);
    for (int number: previousAttempts) {
      if (model.isHiddenNumber(number)) {
        view.printMessage(View.YOU_GUESSED_HIDDEN_NUMBER);
        view.printMessagePlusInt(View.HIDDEN_NUMBER_IS, number);
        return;
      } else if (model.lessThanHiddenNumber(number)) {
        view.printMessagePlusInt(View.HIDDEN_NUMBER_GREATER_THAN, number);
      } else {
        view.printMessagePlusInt(View.HIDDEN_NUMBER_LESS_THAN, number);
      }
    }
  }

  private int getIntNumber(Scanner in) {
    for (; ; ) {
      if (!in.hasNextInt()) {
        view.printMessage(View.YOU_ENTERED_NOT_A_NUMBER);
        view.printRange(low, high);
        in.next();
      } else {
        return in.nextInt();
      }
    }
  }

}
