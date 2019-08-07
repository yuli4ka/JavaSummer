package JavaSummer.Block6.controller;

import static JavaSummer.Block6.controller.RegexConstants.*;
import static JavaSummer.Block6.view.TextConstants.*;

import JavaSummer.Block6.model.Note;
import JavaSummer.Block6.view.TextConstants;
import JavaSummer.Block6.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Controller {

  private Note note;
  private View view;
  private Scanner in;

  private static String REGEX_BUNDLE_NAME = "regex";
  private ResourceBundle bundle = ResourceBundle.getBundle(
      REGEX_BUNDLE_NAME,
      new Locale(MyLocale.getLocale().getLanguage(), MyLocale.getLocale().getCountry()));

  public Controller(Note note, View view) {
    this.note = note;
    this.view = view;
    in = new Scanner(System.in);
  }

  public void startTask() {
    MyNote myNote = new MyNote();

    myNote.setSurname(getForPattern(NAME_PATTERN, ENTER_YOUR_SURNAME));
    myNote.setName(getForPattern(NAME_PATTERN, ENTER_YOUR_NAME));
    myNote.setPatronymic(getForPattern(NAME_PATTERN, ENTER_YOUR_PATRONYMIC));
    myNote.setNickname(getForPattern(NICKNAME_PATTERN, ENTER_YOUR_NICKNAME));
    myNote.setComment(getForPattern(COMMENT_PATTERN, ENTER_COMMENT));
    myNote.setGroup(getGroup());
    myNote.setHomePhone(getForPattern(HOME_PHONE_PATTERN, ENTER_HOME_PHONE_NUMBER));
    myNote.setMobilePhone(getForPattern(MOBILE_PHONE_PATTERN, ENTER_MOBILE_PHONE_NUMBER));
    myNote.setMobilePhone2(getForPattern(MOBILE_PHONE_PATTERN, ENTER_SECOND_MOBILE_PHONE_NUMBER));
    myNote.seteMail(getForPattern(E_MAIL_PATTERN, ENTER_EMAIL));
    myNote.setSkype(getForPattern(SKYPE_PATTERN, ENTER_SKYPE));

    Adress adress = new Adress();

    adress.setHomeIndex(getForPattern(HOME_INDEX_PATTERN, ENTER_HOME_INDEX));
    adress.setCity(getForPattern(CITY_PATTERN, ENTER_CITY_NAME));
    adress.setStreet(getForPattern(STREET_PATTERN, ENTER_STREET_NAME));
    adress.setHomeNumber(Integer.parseInt(getForPattern(HOME_NUMBER_PATTERN, ENTER_HOME_NUMBER)));
    adress.setFlatNumber(Integer.parseInt(getForPattern(APARTMENT_NUMBER_PATTERN, ENTER_FLAT_NUMBER)));

    myNote.setAdress(adress);

    while (true) {
      try {
        note.setAllByNotebook(myNote);
        break;
      } catch (NicknameException e) {
        view.printMessage(TextConstants.NICKNAME, e.getNickname(),
            TextConstants.IS_ALREADY_IN_DATABASE);
        myNote.setNickname(getForPattern(NICKNAME_PATTERN, ENTER_YOUR_NICKNAME));
      }
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat(bundle.getString(DATE_PATTERN));
    note.setCreatingDate(dateFormat.format(new Date()));
    note.setChangeDate(dateFormat.format(new Date()));

    ouputAllData();
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

  private void ouputAllData() { // just for test
    System.out.println(note.getSurname());
    System.out.println(note.getName());
    System.out.println(note.getPatronymic());
    System.out.println(note.getInitialName());
    System.out.println(note.getNickname());
    System.out.println(note.getComment());
    System.out.println(note.getGroup());
    System.out.println(note.getHomePhone());
    System.out.println(note.getMobilePhone());
    System.out.println(note.getMobilePhone2());
    System.out.println(note.geteMail());
    System.out.println(note.getSkype());
    System.out.println(note.getFullAdress());
  }

}
