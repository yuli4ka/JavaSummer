package calculations;

import java.util.Scanner;

class Controller {

  private Model model;
  private View view;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  void doTask() {
    Scanner in = new Scanner(System.in);
    for (; ; ) {
      view.printRange(model.getLow(), model.getHigh());
      int number = getIntNumber(in);
      if (number < model.getLow() || number > model.getHigh()) {
        view.printMessage(View.YOUR_NUMBER_IS_OUT_OF_RANGE);
      } else {
        if (model.isHiddenNumber(number)) {
          model.addHistory(View.YOU_GUESSED_HIDDEN_NUMBER + View.HIDDEN_NUMBER_IS + number);
          view.printMessage(View.YOU_GUESSED_HIDDEN_NUMBER);
          outStatistic();
          in.close();
          return;
        } else {
          if (model.lessThanHiddenNumber(number)) {
            model.addHistory(View.HIDDEN_NUMBER_GREATER_THAN + number);
          } else {
            model.addHistory(View.HIDDEN_NUMBER_LESS_THAN + number);
          }
          view.printMessage(model.getLastNumberHistory());
        }
      }
    }
  }

  private void outStatistic() {
    view.printMessage(View.ALL_HISTORY_OF_YOUR_ATTEMPTS);
    for (String historyItem: model.getHistory()) {
      view.printMessage(historyItem);
    }
  }

  private int getIntNumber(Scanner in) {
    for (; ; ) {
      if (!in.hasNextInt()) {
        view.printMessage(View.YOU_ENTERED_NOT_A_NUMBER);
        view.printRange(model.getLow(), model.getHigh());
        in.next();
      } else {
        return in.nextInt();
      }
    }
  }

}
