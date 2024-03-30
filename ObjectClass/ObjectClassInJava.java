package ObjectClass;

class A 
{
    String name ;
    int age;
    //Here i am overriding toString method of object class
    public String toString()
    {
        return "hello";
    }
    public boolean equals(A obj2)
    {
        return this.name.equals(obj2.name);
    }
}


public class ObjectClassInJava {
    public static void main(String[] args) {
        A obj = new A();
        obj.name = "shardul";
        obj.age= 10;
        A obj1 = new A();
        obj1.name = "shardul";
        obj1.age= 10;
        System.out.println(obj==obj1);  //False
        //System.out.println(obj.equals(obj1)); //False as it comparing two objects by their hexadecimal values.
        System.out.println(obj.equals(obj1));
    }
}
