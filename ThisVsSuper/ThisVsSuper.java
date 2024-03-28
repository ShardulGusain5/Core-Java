package ThisVsSuper;

class A {
    A() {
        System.out.println("this is A class");
    }

    A(int n) {
        System.out.println("This is A int");
    }
}

class B extends A {
    B() {
        super(10);
        System.out.println("this is B constructor");
    }
}

class C extends A 
{
    C()
    {
        System.out.println("i am in C");
    }
    C(int x)
    {
        System.out.println("I ma C 2");
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C(10);

    }
}
