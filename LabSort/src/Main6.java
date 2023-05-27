import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        System.out.println("Original array: " + Arrays.toString(arr));

        bidirectionalSort(arr);

        System.out.println("Bidirectional sorted array: " + Arrays.toString(arr));
    }

    public static void bidirectionalSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int minIdx, maxIdx;

        while (left < right) {
            minIdx = left;
            maxIdx = right;

            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                } else if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }

            if (minIdx != left) {
                swap(arr, left, minIdx);
            }
            if (maxIdx != right) {
                swap(arr, right, maxIdx);
            }

            left++;
            right--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
