package Patterns;

import java.util.regex.Pattern;

public class EnglishPatterns extends Patterns {

  private static final Pattern namePattern = Pattern.compile("[A-Z][a-z]{1,30}");

  private static final Pattern nicknamePattern = Pattern.compile("[A-Za-z0-9_]{1,30}");

  private static final Pattern commentPattern = Pattern.compile(".+");

  public Pattern getNamePattern() {
    return namePattern;
  }

  public Pattern getNicknamePattern() {
    return nicknamePattern;
  }

  public Pattern getCommentPattern() {
    return commentPattern;
  }

}
