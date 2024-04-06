package InterfaceNeed;

interface Smartphone  {
    void useSmartphone();
    
}

class Nokia implements Smartphone {
     public void useSmartphone()
    {
        System.out.println("I am using nokia");
    }
    
}

class Samsung implements Smartphone{
    public void useSmartphone()
    {
        System.out.println("I am using Samsung");
    }
}

class Child 
{
    public void useSmartphone(Smartphone obj)
    {
        obj.useSmartphone();
    }
}

public class InterfaceNeed2 {
    public static void main(String[] args) {
        Child C = new Child();
        Nokia N = new Nokia();
        Samsung S = new Samsung();
        C.useSmartphone(N);
        C.useSmartphone(S);
    }
}
