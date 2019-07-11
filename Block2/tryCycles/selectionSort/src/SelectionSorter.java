public class SelectionSorter {

  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      int tmp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = tmp;
    }
  }

  public static void sort(int[] arr) {
    for (int barrier = 0; barrier < arr.length - 1; barrier++) {
      for (int index = barrier + 1; index < arr.length; index++) {
        if (arr[barrier] > arr[index]) {
          int tmp = arr[index];
          arr[index] = arr[barrier];
          arr[barrier] = tmp;
        }
      }
    }
  }
}
