import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[10][10];  // 2D array initialization
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(100); // Fills the matrix with random numbers from 0 to 99
            }
        }
        System.out.println("Original matrix: ");
        printMatrix(matrix);
        sortColumns(matrix);
        System.out.println("Matrix after column sort: ");
        printMatrix(matrix);
    }

    public static void sortColumns(int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length - 1; j++) {
                int minIndex = j;
                for(int k = j + 1; k < matrix.length; k++) {
                    if(matrix[k][i] < matrix[minIndex][i]) {
                        minIndex = k;
                    }
                }
                // Swap elements in column i at rows j and minIndex
                int temp = matrix[j][i];
                matrix[j][i] = matrix[minIndex][i];
                matrix[minIndex][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
