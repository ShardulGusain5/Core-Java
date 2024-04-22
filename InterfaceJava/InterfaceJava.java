package InterfaceJava;

//Every method in interface are public abstract by default
//Reference of interface can be made 
//Interface is for designing purpose
//Ultimately object is of the class hence we need class to implement interface.
interface A {
    int age = 10;
    //All the variables by default are static and final
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
