package JavaSummer.Block6;

import JavaSummer.Block6.Controller.Controller;
import JavaSummer.Block6.Model.Model;
import JavaSummer.Block6.View.View;

public class Main {

  public static void main(String[] args) {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.startTask();
  }
}
