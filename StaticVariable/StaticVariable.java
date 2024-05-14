package StaticVariable;


//static are methods as well as variables

class Mobile 
{
    //static variable
    static String name;
    //Instance variable
    int price;
    String brand;

    //Cant use instance variables in static method directly
    public static void show()
    {
        System.out.println("show is called");
    }

    //Indirectly we can achieve this by passing the object itself

    public static void show1(Mobile m)
    {
        System.out.println(m.price);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile M = new Mobile();
        Mobile.name = "Smartphone";
        M.price = 100;
        System.out.println(M.name);
        System.out.println(Mobile.name);
        Mobile.show();//can be called without object as it is static
        Mobile.show1(M);
    }
}
