package DivideAndConquer;

public class MaxMinDandConquer {
        // Method to find the max and min values in an array using divide and conquer
        public static void findMaxMin(int[] arr, int low, int high, int[] result) {
            // If the array has only one element
            if (low == high) {
                result[0] = arr[low]; // max
                result[1] = arr[low]; // min
                return;
            }
    
            // If the array has two elements
            if (high == low + 1) {
                if (arr[low] > arr[high]) {
                    result[0] = arr[low]; // max
                    result[1] = arr[high]; // min
                } else {
                    result[0] = arr[high]; // max
                    result[1] = arr[low]; // min
                }
                return;
            }
    
            // Divide the array into two halves
            int mid = (low + high) / 2;
    
            // Arrays to store the results of the left and right halves
            int[] leftResult = new int[2];
            int[] rightResult = new int[2];
    
            // Recursively find the max and min in the left half
            findMaxMin(arr, low, mid, leftResult);
    
            // Recursively find the max and min in the right half
            findMaxMin(arr, mid + 1, high, rightResult);
    
            // Combine the results
            result[0] = Math.max(leftResult[0], rightResult[0]); // overall max
            result[1] = Math.min(leftResult[1], rightResult[1]); // overall min
        }
    
        public static void main(String[] args) {
            int[] arr = { 10,11};
            int[] result = new int[2]; // result[0] will be max, result[1] will be min
            findMaxMin(arr, 0, arr.length - 1, result);
            System.out.println("Maximum element is " + result[0]);
            System.out.println("Minimum element is " + result[1]);
        }
    }
    
