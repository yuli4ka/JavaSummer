public class Model {

  private String value;

  // The Program logic
  String getValue() {
    return value;
  }

  void setValue(String value) {
    this.value = value;
  }

  void addValue(String string) {
    value = value + ' ' + string;
  }
}