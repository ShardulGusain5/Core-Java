package ProblemSolving;

//By using object to find the factorial

class Fact 
{
    public int fact(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*fact(num-1);
    }
}
/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        int n= 5;
        Fact f = new Fact();
        System.out.println(f.fact(n));
    }
}