class Model {

  private String surname;
  private String name;
  private String patronymic;
  private String initialName;
  private String nickname;
  private String comment;
  // group
  private String group;

  private String homePhone;
  private String mobilePhone;
  private String mobilePhone2;
  private String eMail;
  //

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

  void setGroup(String group) {
    this.group = group;
  }

  String getGroup() {
    return group;
  }

}
