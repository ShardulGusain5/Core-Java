class SuperCar
{
    public SuperCar(){

    }
    public SuperCar(String car)
    {
        System.out.println(car+" is running");
    }
    public void run()
    {
        System.out.println("super car is running");
    }
}

public class Car {
    public static void main(String[] args) {
        SuperCar S = new SuperCar();
        SuperCar S2 = new SuperCar("Maruti");
        S.run();
    }
}
