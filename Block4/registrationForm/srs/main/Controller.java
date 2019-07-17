import Patterns.EnglishPatterns;
import Patterns.Patterns;
import java.util.Scanner;
import java.util.regex.Pattern;

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
//    model.setSurname(getForPattern(patterns.getNamePattern(), View.ENTER_YOUR_SURNAME));
//    model.setName(getForPattern(patterns.getNamePattern(), View.ENTER_YOUR_NAME));
//    model.setPatronymic(getForPattern(patterns.getNamePattern(), View.ENTER_YOUR_PATRONYMIC));
//    model.setInitialName();
//
//    model.setNickname(getForPattern(patterns.getNicknamePattern(), View.ENTER_YOUR_NICKNAME));

    model.setNickname(getForPattern(patterns.getCommentPattern(), View.ENTER_COMMENT));
  }

  private String getForPattern(Pattern pattern, String message) {
    view.printMessage(message);
    String answer = in.nextLine();
    while (!pattern.matcher(answer).matches()) {
      view.printMessage(View.WRONG_INPUT);
      view.printMessage(message);
      answer = in.nextLine();
    }
    return answer;
  }

}
