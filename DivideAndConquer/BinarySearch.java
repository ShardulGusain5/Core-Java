package DivideAndConquer;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr []= {1,5,9,10,12,15};
        int target = 19;
        int low = 0;
        int high = arr.length-1;
        int result = binarySearch(arr, target, low, high);
        System.out.println(result);

    }

    public static int binarySearch(int arr[], int target,int low, int high)
    { 
        if(low<=high)
        {
            int mid = (low+high)/2;
        if(target== arr[mid])
        {
            return mid;
        }
        else 
        {
            if(target>arr[mid])
            {
                low= mid+1;
                return binarySearch(arr, target, low, high);
            }
            else 
            {
                high = mid-1 ;
                return binarySearch(arr, target, low, high);
            }
        }
        }
        else 
        {
            return -1;
        }
        
    }
}