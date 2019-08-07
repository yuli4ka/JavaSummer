package JavaSummer.Block6.controller;

public class Adress {

  private String homeIndex;
  private String city;
  private String street;
  private int homeNumber;
  private int flatNumber;

  public void setHomeIndex(String homeIndex) {
    this.homeIndex = homeIndex;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setHomeNumber(int homeNumber) {
    this.homeNumber = homeNumber;
  }

  public void setFlatNumber(int flatNumber) {
    this.flatNumber = flatNumber;
  }

  public String getHomeIndex() {
    return homeIndex;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public int getHomeNumber() {
    return homeNumber;
  }

  public int getFlatNumber() {
    return flatNumber;
  }
}
