package Polymorphism;
//same function but different behaviour , dynamic method dispatch
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

        A obj1 = new A();
        obj1.show();     //In class A
        A obj = new B();
        obj.show();   //In class B  as the object is of type B
        A obj2 = obj;
        obj = new C();
        obj.show();
        obj2.show();
    }
}
