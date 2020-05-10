package DivideAndConquer;

import Utils.Fixture;

/**
 * Created by Saiteja on 2020-05-11
 */
public class CoutingInversions extends Fixture {

  private static int inversions = 0;

  public static void main(String[] args) {
    System.out.println("Enter the size of the array");
    int size = scanner.nextInt();
    int[] array = new int[size];
    System.out.println("Enter the elements");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    countInversions(array, 0, size - 1);
    System.out.println("Total number of inversions: " + inversions);
  }

  private static void countInversions(int[] array, int low, int high) {
    if (low >= high) {
      return;
    }
    int mid = (low + high) / 2; //Finding the mid size

    countInversions(array, low, mid); //Left array
    countInversions(array, mid + 1, high); //Right array
    mergeAndCountInversions(array, low, mid, high); //Merge
  }

  private static void mergeAndCountInversions(int[] array, int low, int mid, int high) {
    int finalSize = high - low + 1;
    int[] temp = new int[finalSize];
    int i = low;
    int j = mid + 1;
    int index = 0;
    while (i <= mid && j <= high) {
      if (array[i] <= array[j]) {
        temp[index++] = array[i++];
      } else {
        //inversion
        temp[index++] = array[j++];
        inversions += mid - i + 1;
      }
    }
    while (i <= mid) {
      temp[index++] = array[i++];
    }
    while (j <= high) {
      temp[index++] = array[j++];
    }

    for (int k = 0; k < finalSize; k++) {
      array[low++] = temp[k];
    }

  }

}
