import java.util.Arrays;
import java.util.Random;

public class Main9 {
    public static void main(String[] args) {
        int size = 10; // size of the array

        double[] array = new double[size];
        fillArrayWithRandomNumbers(array);

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        bubbleSortHalfArray(array);

        System.out.println("\nArray after sorting the left half in descending order and right half in ascending order:");
        System.out.println(Arrays.toString(array));
    }

    public static void fillArrayWithRandomNumbers(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(); // generates random real numbers between 0 and 1
        }
    }

    public static void bubbleSortHalfArray(double[] array) {
        int size = array.length;
        int halfSize = size / 2;

        // Sort left half in descending order
        for (int i = 0; i < halfSize - 1; i++) {
            for (int j = 0; j < halfSize - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Sort right half in ascending order
        for (int i = halfSize; i < size - 1; i++) {
            for (int j = halfSize; j < size - i + halfSize - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
