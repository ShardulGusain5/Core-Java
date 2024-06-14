package DivideAndConquer;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 9};
        int target = 1;
        int result = linearSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearSearch(int[] arr, int target) {
       for(int i =0;i<arr.length;i++)
       {
        if(arr[i]==target)
        {
            return i;
        }
       }
       return -1;
    }
}

