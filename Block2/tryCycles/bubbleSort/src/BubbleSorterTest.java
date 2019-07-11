import java.util.Arrays;

public class BubbleSorterTest {

  public static void main(String[] args) {
    int[][] data = {
        {},
        {1},
        {0, 3, 2, 1},
        {4, 3, 2, 1, 0},
        {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
    };

    int[][] rightData = {
        {},
        {1},
        {0, 1, 2, 3},
        {0, 1, 2, 3, 4},
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 123}
    };

    for (int i = 0; i < data.length; i++) {
      System.out.print(Arrays.toString(data[i]) + " -> ");
      BubbleSorter.bubbleSort(data[i]);
      System.out.println(Arrays.toString(data[i]));
      if (Arrays.equals(data[i], rightData[i])) {
        System.out.println("green");
      } else {
        System.out.println("red");
      }
    }
  }
}

