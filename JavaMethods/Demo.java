package JavaMethods;

class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer C;
        C =  new Computer();
        C.playMusic();
    }
}
