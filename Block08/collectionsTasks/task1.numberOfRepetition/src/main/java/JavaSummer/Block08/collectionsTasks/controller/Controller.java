package JavaSummer.Block08.collectionsTasks.controller;

import JavaSummer.Block08.collectionsTasks.model.DataList;
import JavaSummer.Block08.collectionsTasks.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Controller {

  private DataList dataList;
  private View view;

  public Controller(DataList dataList, View view) {
    this.dataList = dataList;
    this.view = view;
  }

  public void doTask() {
    Map<Integer, Integer> calcMap = calculateRepetition(dataList.getDataList());
    outputMap(calcMap);
  }

  private void outputMap(Map<Integer, Integer> calcMap) {
    for (Integer key : calcMap.keySet()) {
      view.printMessage("number of " + key + " = " + calcMap.get(key));
    }
  }

//  private void outputMap(Map<Integer, Integer> calcMap) {
//    for (Iterator<Integer> it = calcMap.keySet().iterator(); it.hasNext(); ) {
//      Integer key = it.next();
//      view.printMessage(key + " = " + calcMap.get(key));
//    }
//  }

  private Map<Integer, Integer> calculateRepetition(List<Integer> data) {
    Map<Integer, Integer> calcMap = new HashMap<>();
    for(Integer number: data) {
      if (calcMap.containsKey(number)) {
        calcMap.put(number, calcMap.get(number) + 1);
      } else {
        calcMap.put(number, 1);
      }
    }
    return calcMap;
  }
}
