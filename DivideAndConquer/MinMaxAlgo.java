package DivideAndConquer;

public class MinMaxAlgo {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 9, 15};
        int min = arr[0];
        int max= arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            else if( arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(max + " "+  min);
    }
}
