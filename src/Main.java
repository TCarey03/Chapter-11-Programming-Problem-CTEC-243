import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] sizes = {10000, 1000000};

        for (int size : sizes) {

            System.out.println("\nTesting Array Size: " + size);

            // Generate random starting data
            int[] original = Sorts.initValues(size);

            // Create identical copies
            int[] selectionArray =
                    Arrays.copyOf(original, original.length);

            int[] mergeArray =
                    Arrays.copyOf(original, original.length);

            // Calculate Selection Sort comparisons
            long selectionComparisons =
                    (long) size * (size - 1) / 2;

            System.out.println("Selection Sort Comparisons: "
                    + selectionComparisons);

            // Run Selection Sort only at 10,000 elements
            if (size == 10000) {

                long startTime = System.nanoTime();

                Sorts.selectionSort(selectionArray);

                long endTime = System.nanoTime();

                double selectionTime =
                        (endTime - startTime) / 1_000_000.0;

                System.out.println("Selection Sort Time: "
                        + selectionTime + " ms");

                System.out.println("Selection Sort Correct: "
                        + Sorts.isSorted(selectionArray));
            } else {
                System.out.println(
                        "Selection Sort skipped: too many comparisons.");
            }

            // Run Merge Sort
            long startTime = System.nanoTime();

            Sorts.mergeSort(mergeArray);

            long endTime = System.nanoTime();

            double mergeTime =
                    (endTime - startTime) / 1_000_000.0;

            System.out.println("Merge Sort Time: "
                    + mergeTime + " ms");

            System.out.println("Merge Sort Correct: "
                    + Sorts.isSorted(mergeArray));
        }

        // Test special cases
        testEdgeCases();
    }

    public static void testEdgeCases() {

        System.out.println("\n--- Edge Case Tests ---");

        int[] sorted = {1, 2, 3, 4, 5};

        int[] reversed = {5, 4, 3, 2, 1};

        int[] identical = {7, 7, 7, 7, 7};

        testArray("Already Sorted", sorted);

        testArray("Reverse Sorted", reversed);

        testArray("Identical Values", identical);
    }

    public static void testArray(String name, int[] original) {

        int[] selectionArray =
                Arrays.copyOf(original, original.length);

        int[] mergeArray =
                Arrays.copyOf(original, original.length);

        Sorts.selectionSort(selectionArray);

        Sorts.mergeSort(mergeArray);

        System.out.println("\n" + name);

        System.out.println("Selection Sort Correct: "
                + Sorts.isSorted(selectionArray));

        System.out.println("Merge Sort Correct: "
                + Sorts.isSorted(mergeArray));
    }
}
