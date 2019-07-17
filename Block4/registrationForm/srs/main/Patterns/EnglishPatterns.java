package Patterns;

import java.util.regex.Pattern;

public class EnglishPatterns {

  public static final Pattern namePattern = Pattern.compile("[A-Z][a-z]{1,30}");

  public static final Pattern nicknamePattern = Pattern.compile("[A-Za-z0-9_]{1,30}");

  public static final Pattern commentPattern = Pattern.compile(".+");



}
