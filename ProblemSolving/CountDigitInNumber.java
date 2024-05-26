package ProblemSolving;

public class CountDigitInNumber {
    public static void main(String[] args) {
        int n =102587;
        int count = 0;
        while(n!=0)
        {
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
