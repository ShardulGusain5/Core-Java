package ProblemSolving;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 100;
        int binary= 0;
        int digit = 0;
        int count=-1;
        while(n!=0)
        {
            digit= n%2;
            count++;
            binary =(int) (binary+digit*Math.pow(10, count));
            n= n/2; 
        }
        
        System.out.println(binary);
    }
}
