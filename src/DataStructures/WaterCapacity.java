import java.util.Scanner;

/**
 * Created by Saiteja on 2019-07-07
 */
public class WaterCapacity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Size of the array");
    int size = scanner.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    WaterCapacity waterCapacity = new WaterCapacity();
    System.out.println("Capacity: " + waterCapacity.findCapacity(array));
  }

  private int findCapacity(int[] array) {
    if (array.length <= 0)
      return 0;
    int capacity = 0;
    int leftMax, leftIndex;
    leftIndex = 0;
    leftMax = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] >= leftMax) {
        int min = leftMax;
        for (int j = leftIndex + 1; j < i; j++) {
          capacity += min - array[j];
        }
        leftMax = array[i];
        leftIndex = i;
      }
    }
    return capacity;
  }
}
