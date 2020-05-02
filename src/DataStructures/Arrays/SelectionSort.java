package Arrays;

import java.util.Arrays;

/**
 * Created by Saiteja on 2019-07-06
 */
public class SelectionSort {

  public static void main(String[] args) {
    BaseClass baseClass = new BaseClass();
    int[] array = baseClass.createArray();
    int size = array.length;
    for (int i = size - 1; i > 0; i--) {
      int maxIndex = 0;
      for (int j = 1; j <= i; j++) {
        if (array[j] > array[maxIndex]) {
          maxIndex = j;
        }
      }
      baseClass.swap(array, i, maxIndex);
    }
    System.out.println("Sorted array is: " + Arrays.toString(array));
  }
}
