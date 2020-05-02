package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Saiteja on 2019-07-06
 */
public class BaseClass {
  protected static final Scanner scanner = new Scanner(System.in);

  protected int[] createArray() {
    System.out.println("Enter the size of the array:  ");
    int size = scanner.nextInt();
    System.out.println("Enter the elements (positive values) ");
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Enter " + i);
      array[i] = scanner.nextInt();
    }
    System.out.println("Array is: " + Arrays.toString(array));
    return array;
  }

  protected void swap(int[] array, int i, int j) {
    if (i == j)
      return;
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
