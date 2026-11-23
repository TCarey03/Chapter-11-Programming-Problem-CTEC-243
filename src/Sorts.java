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


    // Starts the Merge Sort process
    public static void mergeSort(int[] values) {
        int[] tempArray = new int[values.length];
        mergeSort(values, tempArray, 0, values.length - 1);
    }

    // Recursively divides the array into smaller sections
    private static void mergeSort(int[] values, int[] tempArray,
                                  int first, int last) {

        if (first < last) {

            int middle = (first + last) / 2;

            // Sort the left half
            mergeSort(values, tempArray, first, middle);

            // Sort the right half
            mergeSort(values, tempArray, middle + 1, last);

            // Merge the two sorted halves
            merge(values, tempArray, first, middle, last);
        }
    }

    // Combines two sorted sections into one sorted section
    private static void merge(int[] values, int[] tempArray,
                              int first, int middle, int last) {

        int left = first;
        int right = middle + 1;
        int index = first;

        // Compare values from both halves
        while (left <= middle && right <= last) {

            if (values[left] <= values[right]) {
                tempArray[index] = values[left];
                left++;
            } else {
                tempArray[index] = values[right];
                right++;
            }

            index++;
        }

        // Copy remaining values from the left half
        while (left <= middle) {
            tempArray[index] = values[left];
            left++;
            index++;
        }

        // Copy remaining values from the right half
        while (right <= last) {
            tempArray[index] = values[right];
            right++;
            index++;
        }

        // Copy the merged values back into the original array
        for (int i = first; i <= last; i++) {
            values[i] = tempArray[i];
        }
    }
}
