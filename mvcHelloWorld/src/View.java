class View {

  // Text's constants
  static final String INPUT_STRING_VALUE = "Input STRING value = ";
  static final String WRONG_INPUT_REPEAT_PLEASE = "Wrong input! Repeat please! ";
  static final String STRING_VALUE = "STRING value = ";

  void printMessage(String message) {
    System.out.println(message);
  }

  void printMessageAndString(String message, String value) {
    System.out.println(message + value);
  }

}