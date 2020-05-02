package Arrays;

import jdk.nashorn.tools.Shell;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Saiteja on 2019-07-06
 */
public class InsertionSort {

  public static void main(String[] args) {
    BaseClass baseClass = new BaseClass();
    int[] array = baseClass.createArray();
    int size = array.length;

//    Here gap is defaulted to 1, where as we define the gap in Shell sort
//    Shell Sort
//    for (int gap = size / 2; gap > 0; gap /= 2) {
//      int element = array[gap];
//      int j = gap;
//      while (j > 0 && array[j - gap] > element) {
//        array[j] = array[j - gap];
//        j -= gap;
//      }
//      array[j] = element;
//    }


    for (int i = 1; i < size; i++) {
      int element = array[i];
      int j = i;
      while (j > 0 && array[j - 1] > element) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = element;
    }
    System.out.println("Sorted array: " + Arrays.toString(array));
  }
}
