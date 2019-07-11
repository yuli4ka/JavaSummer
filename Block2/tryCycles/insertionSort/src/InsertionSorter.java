class InsertionSorter {

  static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        continue;
      }
      int tmp = array[i], j = i - 1;
      while (j >= 0 && array[j] > tmp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = tmp;
    }
  }

//  public static void sort(int[] arr) {
//    for (int k = 1; k < arr.length; k++) {
//      int newElement = arr[k];
//      int location = k - 1;
//      while (location >= 0 && arr[location] > newElement) {
//        arr[location + 1] = arr[location];
//        location--;
//      }
//      arr[location + 1] = newElement;
//    }
//  }

}
