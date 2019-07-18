package JavaSummer.Block4;

import JavaSummer.Block4.Controller.Controller;
import JavaSummer.Block4.Model.Model;
import JavaSummer.Block4.View.View;

public class Main {

  public static void main(String[] args) {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.startTask();
  }
}
