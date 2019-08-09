package JavaSummer.Block08.collectionsTasks.model;

import java.util.ArrayList;
import java.util.List;

public class DataList {

  private List<Integer> dataList = new ArrayList<>();
  {
    dataList.add(1);
    dataList.add(2);
    dataList.add(2);
    dataList.add(3);
    dataList.add(3);
    dataList.add(3);
  }

  public List<Integer> getDataList() {
    return dataList;
  }

  public void setDataList(List<Integer> dataList) {
    this.dataList = dataList;
  }
}
