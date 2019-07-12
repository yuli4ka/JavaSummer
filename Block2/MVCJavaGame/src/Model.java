import java.util.ArrayList;

class Model {

  private int hiddenNumber;
  private int low;
  private int high;
  private ArrayList<String> history;

  Model() {
    hiddenNumber = (int) (Math.random() * 100);
    low = 0;
    high = 100;
    history = new ArrayList<>();
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
