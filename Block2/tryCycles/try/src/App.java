//public class App {
//
//  public static void main(String[] args) {
//    int[] arr = {0, 1, 2, 3, 4};
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < arr.length - i; j++) {
//        System.out.print(arr[i] + " ");
//      }
//      System.out.println();
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    int[] arr = {0, 1, 2, 3, 4};
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < arr.length - i; j++) {
//        System.out.print(arr[j] + " ");
//      }
//      System.out.println();
//    }
//  }
//}

//public class App {
//
//  public static void main(String[] args) {
//    int[] arr = {0, 1, 2, 3, 4};
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = i; j < arr.length; j++) {
//        System.out.print(arr[j] + " ");
//      }
//      System.out.println();
//    }
//  }
//}

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    int [][] data = {
        {},
        {1},
        {0,3,2,1},
        {4,3,2,1,0},
        {6,8,3,123,5,4,1,2,0,9,7},
    };
    for (int[] arr: data) {
      System.out.print(Arrays.toString(arr) + "->");
      bubbleSort(arr);
      System.out.println(Arrays.toString(arr));
    }
  }

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
