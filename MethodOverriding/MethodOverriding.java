package MethodOverriding;

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        A obj1 = new A();
        obj1.show();

        A obj2 = new B();
        obj2.show();
    }
}
