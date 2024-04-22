package AnonymousInnerClass;
//class that dont have a name
class A {
    public void show() {
        System.out.println("In A show");
    }
}

// class B extends A 
// {
//     public void show()
//     {
//         System.out.println("In new implementation of show");
//     }
// }

//If this class is to be used once then see the new implementation

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
