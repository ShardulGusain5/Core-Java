class SuperCar
{
    public void run()
    {
        System.out.println("super car is running");
    }
}

public class Car {
    public static void main(String[] args) {
        SuperCar S = new SuperCar();
        S.run();
    }
}
