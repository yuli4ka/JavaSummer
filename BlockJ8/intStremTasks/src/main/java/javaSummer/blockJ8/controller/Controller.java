package javaSummer.blockJ8.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import javaSummer.blockJ8.model.ArrayData;
import javaSummer.blockJ8.view.TextConstants;
import javaSummer.blockJ8.view.View;

public class Controller {

  private View view;
  private ArrayData arrayData;
  private Scanner in;

  public Controller(ArrayData arrayData, View view) {
    this.arrayData = arrayData;
    this.view = view;
    in = new Scanner(System.in);
  }

  public void doTask() {
    int[] array = arrayData.getArray();
    view.printMessage(TextConstants.ARRAY_IS, TextConstants.COLON,
        arrayToString(arrayData.getArray()));
    // 1
    arrayAverage(array);
    //2

    //3
    arrayZeroElements(array);
    //4
    arrayPositiveElements(array);
    //5
    multipleArrayAndNumber(array);
  }

  private void arrayAverage(int[] array) {
    IntStream stream = Arrays.stream(array);
    view.printMessage(TextConstants.AVERAGE_VALUE, TextConstants.OF_ARRAY_ELEMENTS,
        TextConstants.COLON, average(stream) + "");
  }

  private double average(IntStream stream) {
    return stream.average().getAsDouble();
  }

  private void arayMinElement(int[] array) {
    IntStream stream = Arrays.stream(array);
    int[] answer = minElement(stream);
    view.printMessage(TextConstants.INDEX_OF, TextConstants.MIN_ELEMENT,
        TextConstants.COLON, answer[0] + "");
    view.printMessage(TextConstants.VALUE_OF, TextConstants.MIN_ELEMENT,
        TextConstants.COLON, answer[1] + "");
  }

  private int[] minElement(IntStream stream) {
    int[] answer = new int[2];

    return answer;
  }

  private void arrayZeroElements(int[] array) {
    IntStream stream = Arrays.stream(array);
    view.printMessage(TextConstants.NUMBER_OF, TextConstants.ZERO, TextConstants.ELEMENTS,
        TextConstants.COLON, zeroElements(stream) + "");
  }

  private long zeroElements(IntStream stream) {
    return stream.filter(x -> x == 0).count();
  }

  private void arrayPositiveElements(int[] array) {
    IntStream stream = Arrays.stream(array);
    view.printMessage(TextConstants.NUMBER_OF, TextConstants.POSITIVE,
        TextConstants.ELEMENTS, TextConstants.COLON, positiveElements(stream) + "");
  }

  private long positiveElements(IntStream stream) {
    return stream.filter(x -> x > 0).count();
  }


  private void multipleArrayAndNumber(int[] array) {
    IntStream stream = Arrays.stream(array);
    view.printMessage(TextConstants.GIVE_ME_NUMBER);
    int number = in.nextInt();
    int[] answer = multiple(stream, number);
    view.printMessage(TextConstants.NUMBER, number + "", TextConstants.MULTIPLE,
        TextConstants.ARRAY_IS, arrayToString(answer));
  }

  private int[] multiple(IntStream stream, int number) {
    return stream.map(x -> x * number).toArray();
  }

  private String arrayToString(int[] array) {
    StringBuilder answer = new StringBuilder();
    for (int i : array) {
      answer.append(i).append(" ");
    }
    return answer.toString();
  }

}
