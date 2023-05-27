import java.util.Arrays;
import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3}; // Example array (you can modify it as per your needs)

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        int shifts = sortArrayDescending(array);

        System.out.println("\nSorted array (in descending order):");
        System.out.println(Arrays.toString(array));

        System.out.println("\nNumber of elements shifted during sorting: " + shifts);
    }

    public static int sortArrayDescending(int[] array) {
        int shifts = 0;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
                shifts++;
            }
            array[j + 1] = key;
        }
        return shifts;
    }
}
