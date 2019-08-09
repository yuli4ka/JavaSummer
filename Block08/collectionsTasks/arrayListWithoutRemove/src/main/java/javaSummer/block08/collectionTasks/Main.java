package javaSummer.block08.collectionTasks;

public class Main {

  public static void main(String[] args) {
    ArrayListWithoutRemove<Integer> myArray = new ArrayListWithoutRemove<>();
    myArray.add(3);
    myArray.add(4);
    System.out.println(myArray.get(1));
  }
}
