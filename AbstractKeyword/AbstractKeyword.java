package AbstractKeyword;

 abstract class Car 
{
    //If a class contain abstract method then it need to be declared abstract
    public abstract void drive();
    public abstract void laugh();
    public abstract void race();
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
    public void race()
    {
        System.out.println("its racing");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new NextBMW();
        obj.playMusic();
        obj.drive();
        obj.laugh();
        obj.race();

    }
}
