package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Saiteja on 2020-05-02
 */
public class MergeSort {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter the size of the array: ");
    int size = scanner.nextInt();
    System.out.println("Enter the elements");
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    System.out.println("Sorted array is: " + Arrays.toString(doMergeSort(array, 0, size - 1)));
  }

  private static int[] doMergeSort(int[] array, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      doMergeSort(array, low, mid);
      doMergeSort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
    return array;
  }

  private static void merge(int[] array, int low, int mid, int high) {
    int mergedArraySize = high - low + 1;
    int[] temp = new int[mergedArraySize];
    int left = low;
    int right = mid + 1;
    int index = 0;
    while (left <= mid && right <= high) {
      temp[index++] = (array[left] <= array[right]) ? array[left++] : array[right++];
    }
    while (left <= mid) {
      temp[index++] = array[left++];
    }
    while (right <= high) {
      temp[index++] = array[right++];
    }
    System.arraycopy(temp, 0, array, low, mergedArraySize);
  }

}
