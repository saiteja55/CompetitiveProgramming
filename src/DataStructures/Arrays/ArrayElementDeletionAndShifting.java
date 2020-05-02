package Arrays;

import java.util.Arrays;

/**
 * Created by Saiteja on 2019-07-06
 */
public class ArrayElementDeletionAndShifting extends BaseClass {
  public static void main(String[] args) {
    BaseClass baseClass = new BaseClass();
    int[] array = baseClass.createArray();
    System.out.println("Enter the element you want to delete: ");
    int element = scanner.nextInt();
    boolean found = false;
    int index = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        index = i;
        found = true;
      }
    }
    if (found) {
      while (index < array.length - 1) {
        array[index] = array[index + 1];
        index++;
      }
      array[index] = -1;
      System.out.println("Deleted element: " + element);
      System.out.println("Resulting array is: " + Arrays.toString(array));
    } else {
      System.out.println("Element is not present");
    }
  }
}
