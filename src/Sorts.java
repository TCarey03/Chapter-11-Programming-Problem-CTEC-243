import java.util.Random;

public class Sorts {

    // Creates an array filled with random integers from 0 to 1000
    public static int[] initValues(int size) {
        int[] values = new int[size];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1001);
        }

        return values;
    }

    // Checks whether the array is sorted in ascending order
    public static boolean isSorted(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }

        return true;
    }

    // Swaps two elements in the array
    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // Prints the array in a readable format
    public static void printValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

            // Print 10 numbers per line
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }


    // Finds the index of the smallest value in a section of the array
    public static int minIndex(int[] values, int start, int end) {
        int min = start;

        for (int i = start + 1; i <= end; i++) {
            if (values[i] < values[min]) {
                min = i;
            }
        }

        return min;
    }

    // Sorts the array using Selection Sort
    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {

            // Find the smallest value in the unsorted section
            int min = minIndex(values, i, values.length - 1);

            // Move the smallest value into the correct position
            swap(values, i, min);
        }
    }
}
