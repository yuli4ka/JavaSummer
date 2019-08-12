package regForm.exceptions;

public class SameLoginException extends Exception {

  private String login;

  public SameLoginException(String message, String login) {
    super(message);
    this.login = login;
  }

  public String getLogin() {
    return login;
  }
}
