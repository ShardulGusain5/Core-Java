package Polymorphism;
//
class A 
{
    public void show()
    {
        System.out.println("In class A");
    }
}

class B extends A 
{
    public void show()
    {
        System.out.println("In class B");
    }
}

class C extends A 
{
    public void show()
    {
        System.out.println("In class C");
    }
}




public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
