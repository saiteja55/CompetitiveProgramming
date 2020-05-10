package Trees;

import java.util.Scanner;

/**
 * Created by Saiteja on 2019-07-08
 */
public class PrintGrid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size");
    int gridSize = scanner.nextInt();
    PrintGrid printGrid = new PrintGrid();
    printGrid.printGrid(gridSize);
  }

  private void printGrid(int gridSize) {
    boolean flag = false;
    for (int i = 0; i < gridSize; i++, flag = !flag) {
      for (int j = 0; j < gridSize; j++, flag = !flag) {
        System.out.print(flag ? "#" : " ");
      }
      flag = !flag;
      System.out.print("\n");
    }
  }
}
