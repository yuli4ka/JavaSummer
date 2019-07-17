import Patterns.EnglishPatterns;
import Patterns.Patterns;
import java.util.Scanner;

class Controller {

  private Model model;
  private View view;
  private Scanner in;
  private Patterns patterns;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    in = new Scanner(System.in);
    patterns = new EnglishPatterns();
  }

  void startTask() {
    model.setSurname(getNameForPattern(View.ENTER_YOUR_SURNAME));
    model.setName(getNameForPattern(View.ENTER_YOUR_NAME));
    model.setPatronymic(getNameForPattern(View.ENTER_YOUR_PATRONYMIC));
    model.setInitialName();
    view.printMessage(model.getInitialName());
  }

  private String getNameForPattern(String message) {
    view.printMessage(message);
    String name = in.nextLine();
    while (!patterns.getNamePattern().matcher(name).matches()) {
      view.printMessage(View.WRONG_INPUT);
      view.printMessage(message);
      name = in.nextLine();
    }
    return name;
  }

//  private String getNicknmeForPattern() {
//    view.printMessage(View.ENTER_YOUR_NICKNAME);
//    String nickname = in.nextLine();
//    while (!patterns.getNicknamePattern().matcher(nickname).matches()) {
//
//    }
//  }

}
