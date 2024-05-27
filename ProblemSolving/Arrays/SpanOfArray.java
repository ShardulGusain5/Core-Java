package ProblemSolving.Arrays;
//Span of array = max-min
public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = {0,8,92,7,3,5};
        int max=arr[0];
        int min=arr[0];

        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            else if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max-min);
    }
}
