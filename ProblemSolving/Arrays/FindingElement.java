package ProblemSolving.Arrays;

public class FindingElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int find = 5;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==find)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
