package DivideAndConquer;

public class MaxMin {
    public static void main(String[] args) {
        int arr []= {1,5,8,6,4,7,10};
        int [] result = new int [2];
        int i =0;
        int j = arr.length-1;
        maxminfunct(arr,result,i,j);
        System.out.println(result[0]+ " "+ result[1]);
    }


    public static int[] maxminfunct(int []arr, int result[], int i, int j)
    {
        if(i+1==j)
        {
            if(arr[i]>arr[j])
            {
                result[0]= arr[i];
                result[1]= arr[j];
                return result;
            }
            else 
            {
                result[0]= arr[j];
                result[1]= arr[i];
                return result;
            }
        }
        else if(i==j)
        {
            result[0]=arr[i];
            result[1]=arr[i];
            return result;
        }
        {
            int mid = (i+j)/2;
        int leftresult[]= new int [2];
        int rightresult[] = new int[2];
        maxminfunct(arr, leftresult, i, mid);
        maxminfunct(arr, rightresult, mid+1, j);


        if(leftresult[0]>rightresult[0])
        {
            result[0]= leftresult[0];
        }
        else 
        {
            result[0]= rightresult[0];
        }

        if(leftresult[1]<rightresult[1])
        {
            result[1]= leftresult[1];
        }
        else 
        {
            result[1]= rightresult[1];
        }
        return result;
        }

        








    }
}
