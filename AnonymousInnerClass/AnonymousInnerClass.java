package AnonymousInnerClass;
//class that dont have a name
class A {
    public void show() {
        System.out.println("In A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In new implementation of show");
            }
        };
        obj.show();
    }
}
