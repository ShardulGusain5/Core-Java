package AbstractKeyword;

 abstract class Car 
{
    public abstract void drive();
    public abstract void laugh();
    public void playMusic()
    {
        System.out.println("Playing music");
    }
}

abstract class BMW extends Car 
{
    public void drive() 
    {
        System.out.println("driving BMW");
    }
}

class NextBMW extends BMW 
{
    public void laugh()
    {
        System.out.println("hahah");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new NextBMW();
        obj.playMusic();
        obj.drive();
        obj.laugh();

    }
}
