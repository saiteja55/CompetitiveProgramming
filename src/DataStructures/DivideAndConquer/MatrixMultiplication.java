package DivideAndConquer;

import Utils.Fixture;

/**
 * Created by Saiteja on 2020-05-12
 */
public class MatrixMultiplication extends Fixture {

  public static void main(String[] args) {

    System.out.println("Enter the size of the matrix: ");
    System.out.println("Enter the number of rows: "); //Going with m*n matrix for both matrices
    int rows = scanner.nextInt();
    System.out.println("Enter the number of cols: ");
    int cols = scanner.nextInt();
    int[][] x = new int[rows][cols];
    int[][] y = new int[rows][cols];
    System.out.println("Enter elements for first matrix: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        x[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Enter elements for second matrix: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        y[i][j] = scanner.nextInt();
      }
    }
    int[][] output = doIterativeMultiplication(x, y, rows, cols);
    int[][] outputAdd = doAddition(x, y, rows, cols);
    System.out.println("The output matrix is: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(output[i][j] + " ");
      }
      System.out.print("\n");
    }
    System.out.println("The output addition matrix is: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(outputAdd[i][j] + " ");
      }
      System.out.print("\n");
    }
  }

  private static int[][] doIterativeMultiplication(int[][] x, int[][] y, int rows, int cols) {
    int[][] output = new int[rows][cols]; //O(n^3)
    for (int i = 0; i < rows; i++) { // n times
      for (int j = 0; j < cols; j++) { // n times
        for (int k = 0; k < cols; k++) { // n times
          output[i][j] += x[i][k] * y[k][j];
        }
      }
    }
    return output;
  }


  private static int[][] doAddition(int[][] x, int[][] y, int rows, int cols) {
    int[][] result = new int[rows][cols];
    for (int i = 0, j = 0; i < rows && j < cols; i++, j++) { //O(n^2) times
      for (int j = 0; j < cols; j++) {
        result[i][j] = x[i][j] + y[i][j];
      }
    }
    return result;
  }

}
