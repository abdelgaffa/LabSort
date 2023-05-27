import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        maxMinSort(arr);

        System.out.println("Max-Min sorted array: " + Arrays.toString(arr));
    }

    public static void maxMinSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int maxIdx = i;
            int minIdx = i;
            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, maxIdx);
            // Adjust minIdx if the maximum value was swapped to the ith position
            if (minIdx == i) {
                minIdx = maxIdx;
            }
            swap(arr, n - i - 1, minIdx);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
