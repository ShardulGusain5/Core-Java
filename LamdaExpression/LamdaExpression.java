package LamdaExpression;

@FunctionalInterface
interface A 
{
    void show(int x);
}

public class LamdaExpression {
    public static void main(String[] args) {
    
        A obj = (int x)->System.out.println("hello"+ " "+ x);  
        obj.show(10);
    }
}
