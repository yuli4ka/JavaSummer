class View {

  private static final String INPUT_NUMBER_BETWEEN = "\nInput number between ";
  private static final String AND = " and ";
  static final String YOU_ENTERED_NOT_A_NUMBER = "You entered not a number. ";
  static final String YOUR_NUMBER_IS_OUT_OF_RANGE = "Your number is out of range. ";
  static final String HIDDEN_NUMBER_LESS_THAN = "Hidden number less than ";
  static final String HIDDEN_NUMBER_GREATER_THAN = "Hidden number greater than ";
  static final String YOU_GUESSED_HIDDEN_NUMBER = "You guessed hidden number! ";
  static final String ALL_HISTORY_OF_YOUR_ATTEMPTS = "\n\nAll history of your attempts:";
  static final String HIDDEN_NUMBER_IS = "Hidden number is ";

  void printMessage(String message) {
    System.out.println(message);
  }

  void printRange(int low, int high) {
    System.out.println(INPUT_NUMBER_BETWEEN + low + AND + high);
  }

  void printMessagePlusInt(String message, int number) {
    System.out.println(message + number);
  }

}
