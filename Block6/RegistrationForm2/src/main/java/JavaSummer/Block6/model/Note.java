package JavaSummer.Block6.model;

import JavaSummer.Block6.controller.Adress;
import JavaSummer.Block6.controller.MyNote;
import JavaSummer.Block6.controller.NicknameException;
import JavaSummer.Block6.view.TextConstants;

public class Note {

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

  public void setAllByNotebook(MyNote myNote) throws NicknameException {
    if (Notebooks.containsNickname(myNote.getNickname())) {
      throw new NicknameException(TextConstants.SAME_NICKNAME, myNote.getNickname());
    }
    setSurname(myNote.getSurname());
    setName(myNote.getName());
    setPatronymic(myNote.getPatronymic());
    setInitialName();
    setNickname(myNote.getNickname());
    setComment(myNote.getComment());
    setGroup(myNote.getGroup());
    setHomePhone(myNote.getHomePhone());
    setMobilePhone(myNote.getMobilePhone());
    setMobilePhone2(myNote.getMobilePhone2());
    seteMail(myNote.geteMail());
    setSkype(myNote.getSkype());
    setAdress(myNote.getAdress());
    setFullAdress();
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getPatronymic() {
    return patronymic;
  }

  private void setInitialName() {
    initialName = surname + " " + name.charAt(0);
  }

  public String getInitialName() {
    return initialName;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getComment() {
    return comment;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getGroup() {
    return group;
  }

  public void setHomePhone(String phone) {
    this.homePhone = phone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setMobilePhone(String phone) {
    this.mobilePhone = phone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone2(String phone2) {
    this.mobilePhone2 = phone2;
  }

  public String getMobilePhone2() {
    return mobilePhone2;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public String geteMail() {
    return eMail;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getSkype() {
    return skype;
  }

  public Adress getAdress() {
    return adress;
  }

  public void setAdress(Adress adress) {
    this.adress = adress;
  }

  private void setFullAdress() {
    fullAdress =
        adress.getHomeIndex() + ", " + adress.getCity() + ", " + adress.getStreet() + " street, "
            + adress
            .getHomeNumber() + ", flat №" + adress.getFlatNumber();
  }

  public String getFullAdress() {
    return fullAdress;
  }

  public void setCreatingDate(String creatingDate) {
    this.creatingDate = creatingDate;
  }

  public String getCreatingDate() {
    return creatingDate;
  }

  public void setChangeDate(String changeDate) {
    this.changeDate = changeDate;
  }

  public String getChangeDate() {
    return changeDate;
  }
}
