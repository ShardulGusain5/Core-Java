package SortingTechniques;

public class BubbleSortRecursive {

    // Function to perform a single pass of bubble sort recursively
    public static void bubbleSortRecursive(int[] array, int n) {
        // Base case: If the array size is 1, return
        if (n == 1) {
            return;
        }

        // Perform one pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                // Swap array[i] and array[i + 1]
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Recursive call with reduced size
        bubbleSortRecursive(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22}; // Predefined array with 5 elements

        System.out.println("Unsorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Sort the array using recursive bubble sort
        bubbleSortRecursive(array, array.length);

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
