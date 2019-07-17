class Adress {

  String homeIndex;
  String city;
  String street;
  int homeNumber;
  int flatNumber;
}

class Model {

  private String surname;
  private String name;
  private String patronymic;
  private String initialName;
  private String nickname;
  private String comment;
  private String group;
  private String homePhone;
  private String mobilePhone;
  private String mobilePhone2;

  private String eMail;
  private String skype;

  private Adress adress;

  private String fullAdress;
  private String creatingDate;
  private String changeDate;


  void setSurname(String surname) {
    this.surname = surname;
  }

  String getSurname() {
    return surname;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  String getPatronymic() {
    return patronymic;
  }

  void setInitialName() {
    initialName = surname + ' ' + name.charAt(0) + '.';
  }

  String getInitialName() {
    return initialName;
  }

  void setNickname(String nickname) {
    this.nickname = nickname;
  }

  String getNickname() {
    return nickname;
  }

  void setComment(String comment) {
    this.comment = comment;
  }

  String getComment() {
    return comment;
  }

  void setGroup(String group) {
    this.group = group;
  }

  String getGroup() {
    return group;
  }

  void setHomePhone(String phone) {
    this.homePhone = phone;
  }

  String getHomePhone() {
    return homePhone;
  }

  void setMobilePhone(String phone) {
    this.mobilePhone = phone;
  }

  String getMobilePhone() {
    return mobilePhone;
  }

  void setMobilePhone2(String phone2) {
    this.mobilePhone2 = phone2;
  }

  String getMobilePhone2() {
    return mobilePhone2;
  }

  void seteMail(String eMail) {
    this.eMail = eMail;
  }

  String geteMail() {
    return eMail;
  }

  void setSkype(String skype) {
    this.skype = skype;
  }

  String getSkype() {
    return  skype;
  }

//  void setAdress() {
//
//  }
}
