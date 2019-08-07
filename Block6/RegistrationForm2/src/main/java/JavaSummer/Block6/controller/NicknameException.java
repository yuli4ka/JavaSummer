package JavaSummer.Block6.controller;

public class NicknameException extends Exception {

  private String nickname;

  public NicknameException(String message, String nickname) {
    super(message);
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
  }
}
