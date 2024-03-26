//Methods having same name but different parameters or different parameters types
package JavaMethods;

class Calculator
{
    public int add(int a,int b, int c)
    {
        return a+b+c;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public void add(float a,int b)
    {
        System.out.println(a+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =50;
        Calculator C = new Calculator();

        System.out.println(C.add(a,b,c));
    }
}
