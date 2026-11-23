public class Main {

    public static void main(String[] args) {

        // Initialize an array with 50 random integers
        int[] values = Sorts.initValues(50);

        // Display the array
        System.out.println("Original Array:");
        Sorts.printValues(values);

        // Check whether the array is sorted
        System.out.println("Is the array sorted? "
                + Sorts.isSorted(values));
    }
}
