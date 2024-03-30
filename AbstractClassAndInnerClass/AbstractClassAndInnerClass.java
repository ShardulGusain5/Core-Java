package AbstractClassAndInnerClass;

abstract class A {
    public abstract void show();
}

public class AbstractClassAndInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Hello I am made");
            }
        };
        obj.show();
    }
}
