package LeetCode.OctoberChallange.Week1;

import java.util.*;

/**
 * Created by Saiteja on 2020-10-03
 */
public class MaxDistanceInArrays {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter total input size: ");
    int size = s.nextInt();
    List<List<Integer>> inputArrays = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      List<Integer> array = new ArrayList<>();
      System.out.println("Enter size of array: ");
      int arraySize = s.nextInt();
      System.out.println("Enter values: ");
      for (int j = 0; j < arraySize; j++) {
        array.add(s.nextInt());
      }
      inputArrays.add(array);
    }
    System.out.println("Output: " + maxDistance(inputArrays));
  }

  private static int maxDistance(List<List<Integer>> arrays) {
    if (null == arrays || arrays.size() <= 1) {
      return -1;
    }
    int output = 0;
    List<Integer> firstArray = arrays.get(0);
    Integer minValue = firstArray.get(0);
    Integer maxValue = firstArray.get(firstArray.size() - 1);
    for (int i = 1; i < arrays.size(); i++) {
      List<Integer> tempArray = arrays.get(i);
      output = Math.max(output, Math.max(Math.abs(minValue - tempArray.get(tempArray.size() - 1)), Math.abs(maxValue - tempArray.get(0))));
      minValue = Math.min(minValue, tempArray.get(0));
      maxValue = Math.max(maxValue, tempArray.get(tempArray.size() - 1));
    }
    return output;
  }

}
