import java.util.Arrays;
import java.util.Random;

public class Main10 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int m = 4; // number of columns

        int[][] array = new int[n][m];
        fillArrayWithRandomNumbers(array);

        System.out.println("Original array:");
        printArray(array);

        int columnToSort = 2; // index of the column to sort (zero-based)
        bubbleSortColumn(array, columnToSort);

        System.out.println("\nArray after sorting column " + columnToSort + " using bubble sort:");
        printArray(array);

        bubbleSortAllColumns(array);
        System.out.println("\nArray after sorting all columns:");
        printArray(array);
    }

    public static void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100); // generates random numbers between 0 and 99
            }
        }
    }

    public static void bubbleSortColumn(int[][] array, int columnIndex) {
        int rows = array.length;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (array[j][columnIndex] > array[j + 1][columnIndex]) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAllColumns(int[][] array) {
        int columns = array[0].length;
        for (int i = 0; i < columns; i++) {
            bubbleSortColumn(array, i);
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
