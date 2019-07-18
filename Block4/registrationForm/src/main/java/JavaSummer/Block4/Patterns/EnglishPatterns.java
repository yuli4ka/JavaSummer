package JavaSummer.Block4.Patterns;

import java.util.regex.Pattern;

public class EnglishPatterns extends Patterns {

  private static final Pattern namePattern = Pattern.compile("[A-Z][a-z]{1,30}");
  private static final Pattern nicknamePattern = Pattern.compile("[A-Za-z0-9_]{1,30}");
  private static final Pattern commentPattern = Pattern.compile(".+");
  private static final Pattern homePhonePattern = Pattern.compile("((\\(\\d{3}\\)?)|(\\d{3}))([\\s-./]?)(\\d{3})([\\s-./]?)(\\d{4})");
  private static final Pattern mobilePhonePattern = Pattern.compile("((\\(\\d{3}\\)?)|(\\d{3}))([\\s-./]?)(\\d{3})([\\s-./]?)(\\d{4})");

  private Pattern eMailPattern;
  private Pattern skypePattern;
  private Pattern homeIndexPattern;
  private Pattern cityPattern;
  private Pattern streetPattern;
  private Pattern datePattern;

  public Pattern getNamePattern() {
    return namePattern;
  }

  public Pattern getNicknamePattern() {
    return nicknamePattern;
  }

  public Pattern getCommentPattern() {
    return commentPattern;
  }

  public Pattern getHomePhonePattern() {
    return homePhonePattern;
  }

  public Pattern getMobilePhonePattern() {
    return mobilePhonePattern;
  }

  public Pattern geteMailPattern() {
    return eMailPattern;
  }

  public Pattern getSkypePattern() {
    return skypePattern;
  }

  public Pattern getHomeIndexPattern() {
    return homeIndexPattern;
  }

  public Pattern getCityPattern() {
    return cityPattern;
  }

  public Pattern getStreetPattern() {
    return streetPattern;
  }

  public Pattern getDatePattern() {
    return datePattern;
  }

}
