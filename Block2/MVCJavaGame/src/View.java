class View {

  public static final String INPUT_NUMBER_BETWEEN = "Input number between ";
  public static final String AND = " and ";
  public static final String YOU_ENTERED_NOT_A_NUMBER = "You entered not a number. ";
  public static final String YOUR_NUMBER_IS_OUT_OF_RANGE = "Your number is out of range. ";
  public static final String HIDDEN_NUMBER_LESS_THAN = "Hidden number less than ";
  public static final String HIDDEN_NUMBER_GREATER_THAN = "Hidden number greater than ";

  void printMessage(String message) {
    System.out.println(message);
  }

  void pringRange(int low, int high) {
    System.out.println(INPUT_NUMBER_BETWEEN + low + AND + high);
  }

  void printMessagePlusInt(String message, int number) {
    System.out.println(message + number);
  }

}
