package main.java.JavaSummer.Block4.Controller;

import static main.java.JavaSummer.Block4.View.TextConstants.*;
import static main.java.JavaSummer.Block4.Controller.RegexConstants.*;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;
import main.java.JavaSummer.Block4.Model.Model;
import main.java.JavaSummer.Block4.View.View;


public class Controller {

  private Model model;
  private View view;
  private Scanner in;

  private static String REGEX_BUNDLE_NAME = "regex";
  private ResourceBundle bundle = ResourceBundle.getBundle(
      REGEX_BUNDLE_NAME,
      new Locale(MyLocale.getLocale().getLanguage(), MyLocale.getLocale().getCountry()));

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    in = new Scanner(System.in);
  }

  public void startTask() {
    Notebook notebook = new Notebook();
    notebook.setSurname(getForPattern(NAME_PATTERN, ENTER_YOUR_SURNAME));
    notebook.setName(getForPattern(NAME_PATTERN, ENTER_YOUR_NAME));
    notebook.setPatronymic(getForPattern(NAME_PATTERN, ENTER_YOUR_PATRONYMIC));
    notebook.setNickname(getForPattern(NICKNAME_PATTERN, ENTER_YOUR_NICKNAME));
    notebook.setComment(getForPattern(COMMENT_PATTERN, ENTER_COMMENT));
    notebook.setGroup(getGroup());
    notebook.setHomePhone(getForPattern(HOME_PHONE_PATTERN, ENTER_HOME_PHONE_NUMBER));
    notebook.setMobilePhone(getForPattern(MOBILE_PHONE_PATTERN, ENTER_MOBILE_PHONE_NUMBER));
    notebook.setMobilePhone2(getForPattern(MOBILE_PHONE_PATTERN, ENTER_SECOND_MOBILE_PHONE_NUMBER));
    notebook.seteMail(getForPattern(E_MAIL_PATTERN, ENTER_EMAIL));
    notebook.setSkype(getForPattern(SKYPE_PATTERN, ENTER_SKYPE));

    Adress adress = new Adress();
    adress.setHomeIndex(getForPattern(HOME_INDEX_PATTERN, ENTER_HOME_INDEX));
    adress.setCity(getForPattern(CITY_PATTERN, ENTER_CITY_NAME));
    adress.setStreet(getForPattern(STREET_PATTERN, ENTER_STREET_NAME));
    adress.setHomeNumber(Integer.parseInt(getForPattern(HOME_NUMBER_PATTERN, ENTER_HOME_NUMBER)));
    adress.setFlatNumber(Integer.parseInt(getForPattern(APARTMENT_NUMBER_PATTERN, ENTER_FLAT_NUMBER)));

    notebook.setAdress(adress);


  }

  private String getGroup() {
    StringBuilder groups = new StringBuilder();
    for (GroupEnum groupEnum : GroupEnum.values()) {
      groups.append(groupEnum).append(" ");
    }
    view.printMessage(ENTER_GROUP, THERE_ARE_NEXT_GROUPS, groups.toString());
    String answer = in.nextLine();
    while (true) {
      for (GroupEnum groupEnum : GroupEnum.values()) {
        if (groupEnum.name().equalsIgnoreCase(answer)) {
          return groupEnum.name();
        }
      }
      view.printMessage(WRONG_INPUT, ENTER_GROUP, THERE_ARE_NEXT_GROUPS, groups.toString());
      answer = in.nextLine();
    }
  }

  private String getForPattern(String pattern, String message) {
    String patternString = bundle.getString(pattern);
    Pattern patternPattern = Pattern.compile(patternString);

    view.printMessage(message, PATTERN_IS, patternString);
    String answer = in.nextLine();
    while (!patternPattern.matcher(answer).matches()) {
      view.printMessage(WRONG_INPUT, message, PATTERN_IS, patternString);
      answer = in.nextLine();
    }
    return answer;
  }

}
