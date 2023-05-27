import java.util.Arrays;
import java.util.Random;

public class Main7 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int m = 4; // number of columns

        int[][] array = new int[n][m];
        fillArrayWithRandomNumbers(array);

        System.out.println("Original array:");
        printArray(array);

        int columnToSort = 2; // index of the column to sort (zero-based)
        sortColumn(array, columnToSort);

        System.out.println("\nArray after sorting column " + columnToSort + " using insertion sort:");
        printArray(array);

        sortAllColumns(array);
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

    public static void sortColumn(int[][] array, int columnIndex) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i][columnIndex];
            int j = i - 1;
            while (j >= 0 && array[j][columnIndex] > key) {
                array[j + 1][columnIndex] = array[j][columnIndex];
                j--;
            }
            array[j + 1][columnIndex] = key;
        }
    }

    public static void sortAllColumns(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            sortColumn(array, i);
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
