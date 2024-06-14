package DivideAndConquer;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int arr[] = {8,1,5,7};
        int target = 5;
        int index= 0;
        int result = recLinear(arr,target,index);
        System.out.println("found at " + result);
    }



    public static  int recLinear(int []arr, int target,int index)
    {
        if(index>arr.length-1)
        {
            return -1;
        }
        else 
        {
            if(arr[index]==target)
            {
                return index;
            }
            
        }
        return recLinear(arr, target, ++index);
    
        
    }
}
