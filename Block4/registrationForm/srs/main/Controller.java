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

//    model.setNickname(getForPattern(patterns.getCommentPattern(), View.ENTER_COMMENT));

    model.setGroup(getGroup());





  }

  private String getGroup() {
    view.printMessage(View.ENTER_GROUP);
    String answer = in.nextLine();
    while (true) {
      for (GroupEnum groupEnum : GroupEnum.values()) {
        if (groupEnum.name().equalsIgnoreCase(answer)) {
          return groupEnum.name();
        }
      }
      view.printMessage(View.WRONG_INPUT);
      view.printMessage(View.ENTER_GROUP);
      answer = in.nextLine();
    }
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
