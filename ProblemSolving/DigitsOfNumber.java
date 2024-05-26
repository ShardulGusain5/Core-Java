package ProblemSolving;

public class DigitsOfNumber {
    public static void main(String[] args) {
        int n = 10012000;
        int count = digitCounter(n);
        count= count -1;
        while(count!=-1)
        {
            int x = (int) ((int)n/(int)Math.pow(10, count));
            System.out.println(x);
            n= (int) (n%Math.pow(10, count));
            count--;
        }
    }

    public static  int digitCounter(int x)
    {
        int c=0;
        while(x!=0)
        {
            c++;
            x= x/10;
        }
        return c;
    }
}
