package main.java.JavaSummer.Block4;

import main.java.JavaSummer.Block4.Controller.Controller;
import main.java.JavaSummer.Block4.Model.Model;
import main.java.JavaSummer.Block4.View.View;

public class Main {

  public static void main(String[] args) {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.startTask();
  }
}
