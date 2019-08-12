package regForm.notebook;

public enum Notebook {
  note1("Zhytariiuk", "Yuli", "Vladimirovna", "Zhytariiuk Y.",
      "yuli4ka", "LLL", "GROUP1", "0503254254",
      "0403424323", "0443465765", "ergef@gmail.com", "yuli4ka",
      "yuli4ka"),
  note2("Житарюк", "Юлія", "Володимирівна", "Житарюк Ю.",
      "mathLina", "LLL", "GROUP2", "0503254254",
      "0403424323", "0443465765", "ergef@gmail.com", "yuli4ka",
      "mathLina");

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

  private String login;

  Notebook(String surname, String name, String patronymic, String initialName, String nickname,
      String comment, String group, String homePhone, String mobilePhone, String mobilePhone2,
      String eMail, String skype, String login) {
    this.surname = surname;
    this.name = name;
    this.patronymic = patronymic;
    this.initialName = initialName;
    this.nickname = nickname;
    this.comment = comment;
    this.group = group;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.mobilePhone2 = mobilePhone2;
    this.eMail = eMail;
    this.skype = skype;
    this.login = login;
  }

  public static boolean containsLogin(String login) {
    for (Notebook notebook : Notebook.values()) {
      if (notebook.login.equals(login)) {
        return true;
      }
    }
    return false;
  }

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public String getInitialName() {
    return initialName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getComment() {
    return comment;
  }

  public String getGroup() {
    return group;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getMobilePhone2() {
    return mobilePhone2;
  }

  public String geteMail() {
    return eMail;
  }

  public String getSkype() {
    return skype;
  }
  }
