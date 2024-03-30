package UpcastingVsDowncasting;

class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A 
{
    public void show1()
    {
        System.out.println("In B show");
    }
}
public class UpcastingVsDowncasting {
    public static void main(String[] args) {
        //Upcasting 
        A obj = new B();
        obj.show();//this works fine
        //obj.show1();//this wont work as the reference is of type A
        //Solution
        B  obj1= (B)obj;
        obj1.show1();
        
    }
}
