package ProblemSolving;

public class DigitFrequency {
    public static void main(String[] args) {
        int counter =0;
        int n = 1000001;
        int num = 0;
        int digit =0;
        while(n!=0)
        {
            digit = n%10;
            if(digit==num)
            {
                counter++;
            }
            n = n/10;
        }
        System.out.println(counter);
    }
}
