package javaSummer.blockJ8;

import javaSummer.blockJ8.controller.Controller;
import javaSummer.blockJ8.model.ArrayData;
import javaSummer.blockJ8.view.View;

public class Main {

  public static void main(String[] args) {
    new Controller(new ArrayData(), new View()).doTask();
  }
}
