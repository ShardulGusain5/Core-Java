package InnerClass;

class A {
    int x;

    public void show() {
        System.out.println("I am in A show");
    }

    static class B {
        public void show() {
            System.out.println("I am in  B show");
        }
    }
}

public class InnerClassInJava {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.show();
    }
}
