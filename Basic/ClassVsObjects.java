package Basic;
class Calculator
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
}
public class ClassVsObjects {
    public static void main(String[] args) {
        int n= 10;
        int m= 20;
        Calculator C= new Calculator();
        System.out.println(C.add(n,m));
    }
}
