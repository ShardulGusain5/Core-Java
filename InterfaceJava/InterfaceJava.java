package InterfaceJava;

/**
 * A
 */
interface A {
    int age = 10;

    public void show();
}

class B implements A {
    public void show() {
        System.out.println("Show is On");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println(A.age);
    }
}
