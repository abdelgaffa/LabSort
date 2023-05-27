import java.util.Arrays;
import java.util.Random;

    public class Main2 {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100); // Fills the array with random numbers from 0 to 99
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            selectionSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        public static void selectionSort(int[] arr) {
            int swapCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {

                }
            }
        }
    }
