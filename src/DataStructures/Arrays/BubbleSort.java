package Arrays;

import java.util.Arrays;

/**
 * Created by Saiteja on 2019-07-06
 */
public class BubbleSort extends BaseClass {
  public static void main(String[] args) {
    BaseClass baseClass = new BaseClass();
    int[] array = baseClass.createArray();
    int size = array.length;
    for (int i = size - 1; i > 0; i--) {
      System.out.println("End Index: " + i);
      for (int j = 0; j < i; j++) {
        System.out.println("Traversing " + j);
        if (array[j] > array[j + 1]) {
          baseClass.swap(array, j, j + 1);
        }
      }
    }
    System.out.println("Sorted Array is: " + Arrays.toString(array));
  }
}
