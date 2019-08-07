package JavaSummer.Block6;

import JavaSummer.Block6.controller.Controller;
import JavaSummer.Block6.model.Note;
import JavaSummer.Block6.view.View;

public class Main {

  public static void main(String[] args) {
    Note note = new Note();
    View view = new View();
    Controller controller = new Controller(note, view);
    controller.startTask();
  }
}
