package ProblemSolving.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7};
        int i =0;
        int j = arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int itr =0;itr<arr.length;itr++)
        {
            System.out.println(arr[itr]);
        }
    }
}
