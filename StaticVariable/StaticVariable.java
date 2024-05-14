package StaticVariable;


//static are methods as well as variables

class Mobile 
{
    //static variable
    static String name;
    //Instance variable
    int price;
    String brand;

    public static void show()
    {
        System.out.println("show is called");
        System.out.println(p);
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
    }
}
