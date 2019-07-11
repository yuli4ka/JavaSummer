public class BubbleSorter {

  public static void bubbleSort(int[] array) {
    for (int k = array.length - 1; k > 0; k--) {
      for (int i = 0; i < k; i++) {
        if (array[i] > array[i+1]) {
          swap(array, i, i + 1);
        }
      }
    }
  }

  private static void swap(int[] array, int fst, int snd) {
    int tmp = array[fst];
    array[fst] = array[snd];
    array[snd] = tmp;
  }

}
