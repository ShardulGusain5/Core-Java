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
    }
}
