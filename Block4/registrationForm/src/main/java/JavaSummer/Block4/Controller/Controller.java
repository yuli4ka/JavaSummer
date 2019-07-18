package main.java.JavaSummer.Block4.Controller;
import static main.java.JavaSummer.Block4.View.TextConstants.*;

import java.util.Scanner;
import java.util.regex.Pattern;
import main.java.JavaSummer.Block4.Model.Model;
import main.java.JavaSummer.Block4.Patterns.EnglishPatterns;
import main.java.JavaSummer.Block4.Patterns.Patterns;
import main.java.JavaSummer.Block4.View.View;


public class Controller {

  private Model model;
  private View view;
  private Scanner in;
  private Patterns patterns;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    in = new Scanner(System.in);
    patterns = new EnglishPatterns();
  }

  public void startTask() {
    model.setSurname(getForPattern(patterns.getNamePattern(), ENTER_YOUR_SURNAME));
    model.setName(getForPattern(patterns.getNamePattern(), ENTER_YOUR_NAME));
    model.setPatronymic(getForPattern(patterns.getNamePattern(), ENTER_YOUR_PATRONYMIC));
    model.setInitialName();

    model.setNickname(getForPattern(patterns.getNicknamePattern(), ENTER_YOUR_NICKNAME));

    model.setComment(getForPattern(patterns.getCommentPattern(), ENTER_COMMENT));

    model.setGroup(getGroup());

    model.setHomePhone(getForPattern(patterns.getHomePhonePattern(), ENTER_HOME_PHONE_NUMBER));
    model.setMobilePhone(
        getForPattern(patterns.getMobilePhonePattern(), ENTER_MOBILE_PHONE_NUMBER));
    model.setMobilePhone2(
        getForPattern(patterns.getMobilePhonePattern(), ENTER_SECOND_MOBILE_PHONE_NUMBER));

  }

  private String getGroup() {
    view.printMessage(ENTER_GROUP);
    String answer = in.nextLine();
    while (true) {
      for (GroupEnum groupEnum : GroupEnum.values()) {
        if (groupEnum.name().equalsIgnoreCase(answer)) {
          return groupEnum.name();
        }
      }
      view.printMessage(WRONG_INPUT);
      view.printMessage(ENTER_GROUP);
      answer = in.nextLine();
    }
  }

  private String getForPattern(Pattern pattern, String message) {
    view.printMessage(message);
    String answer = in.nextLine();
    while (!pattern.matcher(answer).matches()) {
      view.printMessage(WRONG_INPUT);
      view.printMessage(message);
      answer = in.nextLine();
    }
    return answer;
  }

}
