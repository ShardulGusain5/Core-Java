class Box
{
    int side;
    Box()
    {
        System.out.println("Box is cube");
    }
    Box(String name )
    {
        System.out.println("Box is "+ name);
    }
}


public class Demo {
    public static void main(String[] args) {
        Box B = new Box();
        Box B1= new Box("Cuboid");
        Box B2= new Box("Cube");
        System.out.println(B2.toString());//Printing the object
    }
}
