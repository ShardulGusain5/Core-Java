package AnonymousObjects;

class Human{
     public Human()
     {
        System.out.println("Human object is created in heap memory of JVM");
     }
}
public class AnonymousObjects {
    public static void main(String[] args) {
        new Human();
        Human H = new Human();
    }
}
