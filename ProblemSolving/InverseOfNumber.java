package ProblemSolving;

/**
 * InverseOfNumber
 */
public class InverseOfNumber {

    public static void main(String[] args) {
        int n = 34125;
        int digit = 0;
        int inverse = 0;
        int count = 1;
        while(n!=0)
        {
            digit = n%10;
            inverse = (int) (inverse+count*Math.pow(10, digit-1));
            n= n/10;
            count++;
        }
        System.out.println(inverse);
    }
}