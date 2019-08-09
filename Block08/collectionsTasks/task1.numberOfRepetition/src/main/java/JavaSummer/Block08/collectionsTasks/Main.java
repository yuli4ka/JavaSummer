package JavaSummer.Block08.collectionsTasks;

import JavaSummer.Block08.collectionsTasks.controller.Controller;
import JavaSummer.Block08.collectionsTasks.model.DataList;
import JavaSummer.Block08.collectionsTasks.view.View;

public class Main {

  public static void main(String[] args) {
    new Controller(new DataList(), new View()).doTask();
  }

}
