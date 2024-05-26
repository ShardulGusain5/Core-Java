package ProblemSolving;

public class PrimeFactorisation {
    public static void main(String[] args) {
        int n = 76;
        for(int div =2;div*div<=n;div++)
        {

            if(n%div==0)
            {
                System.out.println(div);
            }
            while(n%div==0)
            {
                n = n/div;
            }
        }
        if(n!=1)
        {
            System.out.println(n);
        }
    }
}
