public class Main {

    public static void main(String[] args) {

        // Initialize an array with 50 random integers
        int[] values = Sorts.initValues(50);

        // Display the original array
        System.out.println("Original Array:");
        Sorts.printValues(values);

        // Sort the array using Merge Sort
        Sorts.mergeSort(values);

        // Display the sorted array
        System.out.println("Sorted Array:");
        Sorts.printValues(values);

        // Verify that the array is sorted
        System.out.println("Is the array sorted? "
                + Sorts.isSorted(values));
    }
}
