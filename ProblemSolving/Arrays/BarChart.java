package ProblemSolving.Arrays;

public class BarChart {
    public static void main(String[] args) {
        int [] arr = {3,1,2,7,5};
        int max= 7;
        for(int i =max;i>0;i--)
        {
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    System.out.print("*");
                    arr[j]--;
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
