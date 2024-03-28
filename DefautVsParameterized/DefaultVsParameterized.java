package DefautVsParameterized;

class Human
{
    public Human()
    {
        System.out.println("i am default constructor");
    }
    public Human(String name)
    {
        System.out.println("Hello " + name);
    }
}
public class DefaultVsParameterized {
    public static void main(String[] args) {
        Human H = new Human();
        Human H1= new Human("Shardul");
    }
}
