package ThisVsSuper;

class A
{
    A()
    {
        System.out.println("this is A class");
    }
    A(int n)
    {
        System.out.println("This is A int");
    }
}
class B extends A
{
    B()
    {
        super(10);
        System.out.println("this is B constructor");
    }
}
public class ThisVsSuper {
    public static void main(String[] args) {
        B  obj = new B();
        
    }
}
