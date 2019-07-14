package calculations;

import java.util.ArrayList;

public class Model {

  private int hiddenNumber;
  private int low;
  private int high;
  private ArrayList<String> history;

  public Model() {
    low = Constants.LOW;
    high = Constants.HIGH;
    hiddenNumber = getRandomNumber(low, high);
    history = new ArrayList<>();
  }

  public int getRandomNumber(int low, int high) {
    return low + 1 + (int) (Math.random() * (high - low - 1));
  }

  int getLow() {
    return low;
  }

  int getHigh() {
    return high;
  }

  boolean isHiddenNumber(int number) {
    return number == hiddenNumber;
  }

  boolean lessThanHiddenNumber(int number) {
    if (number < hiddenNumber) {
      low = number + 1;
      return true;
    } else {
      high = number - 1;
      return false;
    }
  }

  void addHistory(String description) {
    history.add(description);
  }

  String getLastNumberHistory() {
    return history.get(history.size() - 1);
  }

  ArrayList<String> getHistory() {
    return history;
  }

}
