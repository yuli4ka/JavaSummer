class Model {

  private int hiddenNumber;

  Model() {
    hiddenNumber = (int)(Math.random() * 100);
  }

  boolean isHiddenNumber(int number) {
    return number == hiddenNumber;
  }

  boolean lessThanHiddenNumber(int number) {
    return number < hiddenNumber;
  }

}
