package ProblemSolving.Arrays;





public class SubsetsOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int count =0;
        String subset = "";
        int total = (int) Math.pow(2, 3);
        for(int i =0;i<=total-1;i++)
        {
            int temp =i;
            subset = "";
            for(int j =2;j>=0;j--)
            {
                int digit = temp%2;
                temp= temp/2;
                if(digit==0)
                {
                    subset= "_"+subset;
                }
                else{
                    subset= arr[j]+subset;
                }
            }
            System.out.println(subset);
        }
        System.out.println();
    }
}
