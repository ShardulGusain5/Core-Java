package FunctionalInterface;

//Functional Inteface in java
interface A 
{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
         A obj = new A() {
            public void show()
            {
                System.out.println("hello functional interface");
            }
         };
         obj.show();
    }
}
