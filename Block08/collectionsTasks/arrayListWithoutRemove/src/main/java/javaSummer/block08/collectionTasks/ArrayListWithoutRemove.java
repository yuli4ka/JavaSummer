package javaSummer.block08.collectionTasks;

public class ArrayListWithoutRemove<T> {

  private final int INIT_SIZE = 16;
  private final int CUT_RATE = 4;
  private Object[] array = new Object[INIT_SIZE];
  private int pointer = 0;

  public void add(T item) {
    if (pointer == array.length - 1) {
      resize(array.length *2 );
    }
    array[pointer++] = item;
  }

  public T get(int index) {
    return (T) array[index];
  }

  private void resize(int i) {
    Object[] newArray = new Object[i];
    System.arraycopy(array, 0, newArray, 0, pointer);
    array = newArray;
  }

}
