import java.util.Arrays;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + rand.nextDouble() * 20;  // Fills the array with random numbers from -10 to 10
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        // Separate array into even and odd indexed arrays
        double[] evenIndexedValues = new double[(arr.length + 1) / 2];
        double[] oddIndexedValues = new double[arr.length / 2];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexedValues[i / 2] = arr[i];
            } else {
                oddIndexedValues[i / 2] = arr[i];
            }
        }

        // Sort the even and odd indexed arrays
        selectionSortAscending(evenIndexedValues);
        selectionSortDescending(oddIndexedValues);

        // Combine sorted arrays back into the original array
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = evenIndexedValues[i / 2];
            } else {
                arr[i] = oddIndexedValues[i / 2];
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSortAscending(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSortDescending(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            double temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
